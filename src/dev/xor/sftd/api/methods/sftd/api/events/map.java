package dev.xor.sftd.api.methods.sftd.api.events;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.methods.sftd.ApiMethod;
import dev.xor.sftd.api.methods.sftd.ApiResult;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethod;

import java.net.URI;

public class map extends ApiMethod{
    @Override
    public String getUrl() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public URI getURI() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public HttpMethod createMethod(Game game) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ApiResult handleResponse(Game game, String response, Header[] headers) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
