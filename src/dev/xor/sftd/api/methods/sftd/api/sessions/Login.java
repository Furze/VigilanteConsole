package dev.xor.sftd.api.methods.sftd.api.sessions;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.Settings;
import dev.xor.sftd.api.json.wrappers.deserializers.CurrentEventDeserializer;
import dev.xor.sftd.api.json.wrappers.deserializers.FriendDeserializer;
import dev.xor.sftd.api.methods.sftd.ApiMethod;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URI;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 15/11/13
 * Time: 8:22 PM
 * To change this template use File | Settings | File Templates.
 */
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
    public boolean handleResponse(Game game,String response, Header[] headers) {
        game.getSettings().setCookie(headers[7].getValue());
        /*for(Header header: headers){
            System.out.println(header.getName() +": " + header.getValue());
        }
        System.out.println("\n\n"+response);*/
        JSONObject resp = new JSONObject(response);
        game.setFriends(FriendDeserializer.deserializer(resp));
        game.setCurrentEvent(CurrentEventDeserializer.deserializer(resp));
        System.out.println(resp);
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
//{"api_version":"12","platform":"android","facebook_token":"CAACW9GZByJGEBAMG6MG0kBgqDVZB0NL61fMHHyvMelMpd7ZCZAUyWjp8TBnLfixp5YHSsa1a57xqUjdDH8kHeS7hgU8dLmjZAZBpd46YOZBpuA6NFJFzy6lZAgaSm0S7Vc9iaa0H2l8ku2eb6cHi0ciVK5zkMYe5EE9OCI3zkVAy6ML8ANVZCOGFZCqQDL1Ab2bXXN210ZCZBpUvrSZBwlGN7tlQ2ELy9STHiZBO0J9EuGXgZCESAZDZD"}
}
