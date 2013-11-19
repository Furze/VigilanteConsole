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

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 19/11/13
 * Time: 2:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Initiate extends ApiMethod {
    /*{
	"target_type": "player",
	"punishment_id": "7",      KILL
	"encountertype_id": "dead_on_arrival",
	"target_id": "43289"
}*/
    public static enum Punishment {
      Killed("7"),
      Hospitalise("3");
        private final String id;   // in kilograms
        Punishment(String id) {
            this.id = id;
        }
    };
    public static enum Encounter{
        dead_on_arrival("dead_on_arrival"),
        out_of_bounds("out_of_bounds");
        private final String id;   // in kilograms
        Encounter(String id) {
            this.id = id;
        }
    };
    private static String url = BASE_URL + "encounters/initiate";
    private URI uri;
    private JSONObject json;
    public Initiate(String npcEventID, String encounterID, String punishmentID, String npcID){
        uri = urlToUri(url);
        json = new JSONObject();
        System.out.println("attacking NPC: " + npcEventID);
        json.putOnce("npc_event_id", npcEventID);
        json.putOnce("encountertype_id", encounterID);
        json.putOnce("target_type", "npc");
        json.putOnce("punishment_id", punishmentID);
        json.putOnce("target_id", npcID);

    }
    public Initiate(String playerID, String encounter, String punishment){
        uri = urlToUri(url);
        json = new JSONObject();
        System.out.println("attacking " + playerID);
        json.putOnce("target_type", "player");
        json.putOnce("punishment_id", punishment);
        json.putOnce("encountertype_id", encounter);
        json.putOnce("target_id", playerID);

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
