package dev.xor.sftd.api.json.wrappers.deserializers;

import dev.xor.sftd.api.json.wrappers.Friend;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Message {
    //{"messages":{
    // "email_invite_subject":"Vigilante Invite",
    // "s4d_manifesto":"We have a code, break our code and we will break you. We are watching.",
    // "facebook_share_url":"http://www.facebook.com/appcenter/vigilante-sftd",
    // "twitter_share_url":"http://on.fb.me/TYtHzy",
    // "facebook_share_description":"Vigilante is an innovative massively multiplayer game where players dish out their own form of justice.","s4d_protip":"Deadly, swift and merciless, Speak for the Dead will rebuke anyone foolish enough to target citizens S4D deem to be innocent. Don't get caught on their bad side...","twitter_share_suffix":" #Vigilante","facebook_invite_message":"Come back me up!","shoutout_url":"http://www.divisivemedia.com/Vigilante/Vig2.html","email_invite_body":"This game is intense! Download for free at http://play.google.com/store/apps/details?id=com.divisivemedia.vigilante"}}
    public static Friend[] deserializer(JSONObject json){
        ArrayList<Friend> friends = new ArrayList<>();
        JSONArray friendStrs = (JSONArray)json.get("friends");
        for (int i = 0; i < friendStrs.length(); i++){
            friends.add(new Friend(Integer.parseInt(friendStrs.getString(i))));
        }
        return friends.toArray(new Friend[friends.size()]);
    }
}
