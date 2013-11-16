package dev.xor.sftd.api.methods.sftd.api.encounters;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.methods.sftd.ApiMethod;
import dev.xor.sftd.api.methods.sftd.ApiResult;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethod;

import java.net.URI;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 15/11/13
 * Time: 8:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Acknowledge extends ApiMethod {
    String url = ""  ;
    //TODO

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
