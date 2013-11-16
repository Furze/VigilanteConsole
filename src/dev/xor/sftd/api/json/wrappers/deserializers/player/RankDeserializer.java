package dev.xor.sftd.api.json.wrappers.deserializers.player;

import dev.xor.sftd.api.json.wrappers.player.Rank;
import org.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 17/11/13
 * Time: 1:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class RankDeserializer {
    public static Rank deserialize(JSONObject json){
        String id = json.getString("id");
        String fromLevel = json.getString("from_level");
        String name = json.getString("name");
        return new Rank(id, name, fromLevel);
    }
}
