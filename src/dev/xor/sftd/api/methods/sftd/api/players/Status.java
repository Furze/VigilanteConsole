package dev.xor.sftd.api.methods.sftd.api.players;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.methods.sftd.ApiMethod;
import dev.xor.sftd.api.methods.sftd.ApiResult;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

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
        System.out.println(response);
        return new ApiResult(true,headers,response);
    }
}
