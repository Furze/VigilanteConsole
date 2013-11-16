package dev.xor.sftd.api.methods.sftd.api.sessions;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.Settings;
import dev.xor.sftd.api.json.wrappers.deserializers.CurrentEventDeserializer;
import dev.xor.sftd.api.json.wrappers.deserializers.FriendDeserializer;
import dev.xor.sftd.api.json.wrappers.deserializers.Message;
import dev.xor.sftd.api.methods.sftd.ApiMethod;
import dev.xor.sftd.api.methods.sftd.ApiResult;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URI;

public class Login extends ApiMethod{
   private String facebookToken;
    private JSONObject json;
    private String url = BASE_URL + "sessions/login";
    private URI uri;

    public Login(String facebookToken){
        this.facebookToken = facebookToken;
        json = new JSONObject();
        json.putOnce("api_version",Settings.API_VERSION);
        json.putOnce("platform", Settings.PLATFORM);
        json.putOnce("facebook_token", facebookToken);
        uri = urlToUri(url);
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public HttpMethod createMethod(Game game) {
        PostMethod method = new PostMethod(url);
        method.addRequestHeader("Content-Type", "application/json");
        method.addRequestHeader("Accept", "application/json");
        method.addRequestHeader("Content-Length", "" + json.toString().length());
        method.addRequestHeader("Host", "vigilante.divisivemedia.com");
        method.addRequestHeader("Connection", "Keep-Alive");
        try{
            StringRequestEntity requestEntity = new StringRequestEntity(
                    json.toString(),
                    "application/json",
                    "UTF-8");
            method.setRequestEntity(requestEntity);
        }   catch (UnsupportedEncodingException e) {
            System.err.println("Login.createMethod - unsupported encoding");
        }
        return method;
    }

    @Override
    public URI getURI() {
        return uri;
    }

    @Override
    public ApiResult handleResponse(Game game,String response, Header[] headers) {
        game.getSettings().setCookie(headers[7].getValue());
        /*for(Header header: headers){
            System.out.println(header.getName() +": " + header.getValue());
        }
        System.out.println("\n\n"+response);*/
        JSONObject resp = new JSONObject(response);
        game.setFriends(FriendDeserializer.deserializer(resp));
        game.setCurrentEvent(CurrentEventDeserializer.deserializer(resp));
        game.setMessages(Message.deserializer(json));
        System.out.println(resp);
        return new ApiResult(true,headers,response);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
