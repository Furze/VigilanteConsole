package dev.xor.sftd.api.Connection;

import org.apache.commons.httpclient.*;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 13/11/13
 * Time: 2:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class Connection {
    private static String url;
    public Connection(String url){
        this.url = url;
    }
    private String getCookie(){
        String sessionID = "f64af44b2c3c71cc956455c063af3e62";
        String ipAddress = "10.188.174.112";
        String userAgent = "Jakarta Commons-HttpClient/3.1";
        String time = (""+ System.currentTimeMillis()).substring(0,10);
        String cookie = "ci_session=a:4:{s:10:\"" +
                "session_id\";s:32:\""+sessionID+"\";s:10:\"" +
                "ip_address\";s:14:\""+ipAddress+"\";s:10:\"" +
                "user_agent\";s:30:" +"\""+userAgent+"\";s:13:\"" +
                "last_activity\";i:"+time+";}" +
                "6ea7534c83847a319944d319c6acb261";//wut is this hash of ?!

        return cookie;
    }
    public static HttpClient getHttpClient(){

            return null;
    }
}
