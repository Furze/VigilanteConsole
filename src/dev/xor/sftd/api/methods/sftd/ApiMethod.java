package dev.xor.sftd.api.methods.sftd;

import dev.xor.sftd.api.Game;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethod;
import org.json.JSONObject;

import java.net.URI;
import java.net.URISyntaxException;

public abstract class ApiMethod {
    public static String BASE_URL = "https://vigilante.divisivemedia.com/api/";
    public abstract String getUrl();
    public abstract URI getURI();
    public abstract HttpMethod createMethod(Game game);
    public abstract boolean handleResponse(Game game,String response, Header[] headers);
    public URI urlToUri(String url){
        URI uri = null;
        try{
            uri = new URI(url);
        }   catch (URISyntaxException e){
            System.err.println("URI INVALID");
        }
        return uri;
    }
    public HttpMethod addJsonHeaders(HttpMethod method, JSONObject json, Game game){
        method.addRequestHeader("Content-Type", "application/json");
        method.addRequestHeader("Accept", "application/json");
        method.addRequestHeader("Content-Length", "" + json.toString().length());
        method.addRequestHeader("Host", "vigilante.divisivemedia.com");
        method.addRequestHeader("Connection", "Keep-Alive");
        method.addRequestHeader(game.getSettings().getCookie());
        method.addRequestHeader("Cookie2","$Version=1");
        return method;
    }
}
