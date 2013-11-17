package dev.xor.sftd.api.methods.sftd.api.players;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.json.wrappers.deserializers.CurrentEventDeserializer;
import dev.xor.sftd.api.methods.sftd.ApiMethod;
import dev.xor.sftd.api.methods.sftd.ApiResult;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.net.URI;

public class Status extends ApiMethod {
    private String url;
    private URI uri;
    public Status(){
        url = BASE_URL + "players/status";
        uri = urlToUri(url);
    }
    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public URI getURI() {
        return uri;
    }

    @Override
    public HttpMethod createMethod(Game game) {
        GetMethod method = new GetMethod(url);
        addGetHeaders(method, game);
        return method;
    }

    @Override
    public ApiResult handleResponse(Game game, String response, Header[] headers) {
            JSONObject resp = new JSONObject(response);
        if(headers[4] != null && headers[4].getName().equals("Set-Cookie"))
        game.getSettings().setCookie(headers[4].getValue());
       /* for(Header header: headers){
            System.out.println(header.getName() +": " + header.getValue());
        }   */
            game.setCurrentEvent(CurrentEventDeserializer.deserializer(resp));
            return new ApiResult(true,headers,response);
    }
}
