package dev.xor.sftd.api.methods.sftd.api.analytics;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.Settings;
import dev.xor.sftd.api.methods.sftd.ApiMethod;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URI;

public class Launch extends ApiMethod {
    private static String url = BASE_URL + "analytics/launch";
    private URI uri;
    private JSONObject json;
    public Launch(){
        uri = urlToUri(url);
        json = new JSONObject();
        json.putOnce("mode","fresh");
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
    public boolean handleResponse(Game game, String response, Header[] headers) {
        if(response.contains("[]"))
            return true;
        return false;
    }
}
