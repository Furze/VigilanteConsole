package dev.xor.sftd.api.methods.sftd.api.encounters;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.methods.sftd.ApiMethod;
import dev.xor.sftd.api.methods.sftd.ApiResult;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Collection;

public class Acknowledge extends ApiMethod {
    private static String url = BASE_URL + "encounters/acknowledge";
    private URI uri;
    private JSONObject json;
    public Acknowledge(String encounterID){
        uri = urlToUri(url);
        json = new JSONObject();
        System.out.println("acking " + encounterID);
        json.putOnce("encounter_id", encounterID);
        json.put("stats",(Collection)null);
    }
    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public HttpMethod createMethod(Game game) {
        PostMethod method = new PostMethod(url);
        addJsonHeaders(method,json,game);
        try{
            StringRequestEntity requestEntity = new StringRequestEntity(
                    json.toString(),
                    "application/json",
                    "UTF-8");
            method.setRequestEntity(requestEntity);
        }   catch (UnsupportedEncodingException e) {
            System.err.println("Launch.createMethod - unsupported encoding");
        }
        return method;
    }

    @Override
    public URI getURI() {
        return uri;
    }

    @Override
    public ApiResult handleResponse(Game game, String response, Header[] headers) {
        System.out.println(response);
        if(response.contains("[]"))
            return new ApiResult(true,headers,response);
        return new ApiResult(false,headers,response);
    }
}
