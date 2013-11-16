package dev.xor.sftd.api.json.wrappers;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 16/11/13
 * Time: 11:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class Messages {
    private String s4dManifesto;
    private String s4dProTip;
    private String shoutoutUrl;
    private String twitterShareUrl;
    private String twitterShareSuffix;
    private String facebookShareUrl;
    private String facebookShareDescription;
    private String facebookInviteMessage;
    private String emailInviteSubject;
    private String emailInviteBody;

    public Messages(String s4dManifesto, String s4dProTip, String shoutoutUrl, String twitterShareUrl, String twitterShareSuffix, String facebookShareUrl, String facebookShareDescription, String facebookInviteMessage, String emailInviteSubject, String emailInviteBody) {
        this.s4dManifesto = s4dManifesto;
        this.s4dProTip = s4dProTip;
        this.shoutoutUrl = shoutoutUrl;
        this.twitterShareUrl = twitterShareUrl;
        this.twitterShareSuffix = twitterShareSuffix;
        this.facebookShareUrl = facebookShareUrl;
        this.facebookShareDescription = facebookShareDescription;
        this.facebookInviteMessage = facebookInviteMessage;
        this.emailInviteSubject = emailInviteSubject;
        this.emailInviteBody = emailInviteBody;
    }

    public String getS4dManifesto() {
        return s4dManifesto;
    }

    public String getS4dProTip() {
        return s4dProTip;
    }

    public String getShoutoutUrl() {
        return shoutoutUrl;
    }

    public String getTwitterShareUrl() {
        return twitterShareUrl;
    }

    public String getTwitterShareSuffix() {
        return twitterShareSuffix;
    }

    public String getFacebookShareUrl() {
        return facebookShareUrl;
    }

    public String getFacebookShareDescription() {
        return facebookShareDescription;
    }

    public String getFacebookInviteMessage() {
        return facebookInviteMessage;
    }

    public String getEmailInviteSubject() {
        return emailInviteSubject;
    }

    public String getEmailInviteBody() {
        return emailInviteBody;
    }
}
