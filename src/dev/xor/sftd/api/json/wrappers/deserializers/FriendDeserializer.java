package dev.xor.sftd.api.json.wrappers.deserializers;

import dev.xor.sftd.api.json.wrappers.Friend;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 16/11/13
 * Time: 7:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class FriendDeserializer {
//"friends":["2611","4051","9911"]
    public static Friend[] deserializer(JSONObject json){
        ArrayList<Friend> friends = new ArrayList<>();
        JSONArray friendStrs = (JSONArray)json.get("friends");
        for (int i = 0; i < friendStrs.length(); i++){
            friends.add(new Friend(Integer.parseInt(friendStrs.getString(i))));
        }
        return friends.toArray(new Friend[friends.size()]);
    }
}
