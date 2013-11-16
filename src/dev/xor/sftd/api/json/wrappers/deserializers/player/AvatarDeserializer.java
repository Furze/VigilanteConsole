package dev.xor.sftd.api.json.wrappers.deserializers.player;

import dev.xor.sftd.api.json.wrappers.player.Avatar;
import org.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 17/11/13
 * Time: 12:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class AvatarDeserializer {
    // "avatar":{"mouth":8,"mask":"av_mask_21","gender":"male","head":17,"eyes":8},
    public static Avatar deserialize(JSONObject json){
        int mouth = json.getInt("mouth");
        String mask = json.getString("mask");
        String gender = json.getString("gender");
        int head = json.getInt("head");
        int eyes = json.getInt("eyes");
        return new Avatar(mouth,gender,head,eyes,mask);
    }
}
