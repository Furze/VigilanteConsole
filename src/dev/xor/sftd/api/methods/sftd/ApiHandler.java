package dev.xor.sftd.api.methods.sftd;

import dev.xor.sftd.api.Connection.EasySSLProtocolSocketFactory;
import dev.xor.sftd.api.Game;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.protocol.Protocol;
import org.json.JSONException;

import java.io.IOException;

public class ApiHandler {
    HttpClient client;
    Protocol easyhttps;
    Game game;
    public ApiHandler(Game game){
        client = new HttpClient();
        //TODO: actually check ssl certs...
       easyhttps = new Protocol("https", new EasySSLProtocolSocketFactory(), 443);
        Protocol.registerProtocol("https", easyhttps);
        this.game = game;
    }

    public ApiResult handle(ApiMethod apiMethod){
        HttpMethod method = apiMethod.createMethod(game);
        HostConfiguration hc = new HostConfiguration();
        Header[] headers = null;
        String response = "";
        hc.setHost(apiMethod.getURI().getHost(), apiMethod.getURI().getPort(), easyhttps);
        try {
            int statusCode = client.executeMethod(hc, method);
            if (statusCode != HttpStatus.SC_OK) {
                System.err.println("Method failed: " + method.getStatusLine()+ "\n" + response) ;
            }
            byte[] responseBody = method.getResponseBody();
            headers = method.getResponseHeaders();
            response = new String(responseBody);
        } catch (HttpException e) {
            System.err.println("Fatal protocol violation: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Fatal transport error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            method.releaseConnection();
        }
        if(response.contains("{\"error\":\"unauthorised\"}")){
           // System.out.println(response);
            game.reinitializeGame();
        } else if(response.contains("{session")){
            System.out.println(response);
            System.exit(0);
        }
        try{
         return apiMethod.handleResponse(game,response,headers);
        }catch (JSONException e){
            return new ApiResult(false,headers,response);
        }
    }
}
