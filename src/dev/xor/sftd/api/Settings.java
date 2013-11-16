package dev.xor.sftd.api;

import org.apache.commons.httpclient.Header;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 13/11/13
 * Time: 2:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class Settings {
    public static String PLATFORM = "android";
    public static String API_VERSION = "12";
    private Header cookie;

    public Header getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = new Header("Cookie", cookie);
    }
}
