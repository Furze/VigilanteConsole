package dev.xor.sftd.api.json.wrappers.deserializers;

import dev.xor.sftd.api.json.wrappers.Friend;
import dev.xor.sftd.api.json.wrappers.player.encounter.Encounter;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 16/11/13
 * Time: 9:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class CurrentEventDeserializer {
    public static Encounter deserializer(JSONObject json){
        if(json.has("resolve"))
            return new Encounter(Long.parseLong((String)json.get("resolve")));
        return null;
    }
}
