package dev.xor.sftd.api.json.wrappers.deserializers;

import dev.xor.sftd.api.json.wrappers.Friend;
import dev.xor.sftd.api.json.wrappers.Messages;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Message {
    public static Messages deserializer(JSONObject json){
        String s4dManifesto, s4dProTip, shoutoutUrl, twitterShareUrl, twitterShareSuffix, facebookShareUrl,
                facebookShareDescription, facebookInviteMessage,emailInviteSubject, emailInviteBody;
        s4dManifesto = json.getString("s4d_manifesto");
        s4dProTip = json.getString("s4d_protip");
        shoutoutUrl = json.getString("shoutout_url");
        twitterShareUrl = json.getString("twitter_share_url");
        twitterShareSuffix = json.getString("twitter_share_suffix");
        facebookShareUrl = json.getString("facebook_share_url");
        facebookShareDescription = json.getString("facebook_share_description");
        facebookInviteMessage = json.getString("facebook_invite_message");
        emailInviteSubject = json.getString("email_invite_subject");
        emailInviteBody = json.getString("email_invite_body");

        return new Messages(s4dManifesto, s4dProTip,shoutoutUrl,twitterShareUrl,twitterShareSuffix, facebookShareUrl, facebookShareDescription, facebookInviteMessage, emailInviteSubject, emailInviteBody);
    }
}
