package dev.xor.sftd.api.methods.sftd.api.investigate;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.methods.sftd.ApiMethod;
import dev.xor.sftd.api.methods.sftd.ApiResult;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 13/11/13
 * Time: 1:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class CrewMembers extends ApiMethod {
    private String url;
    private URI uri;
    public CrewMembers(String crewNumber){
        url = BASE_URL + "investigate/crew_members/" + crewNumber;
        uri = urlToUri(url);
    }

    /*GET /api/createMethod/crew/2884 HTTP/1.1
    Accept: application/json
    Host: vigilante.divisivemedia.com
    Connection: Keep-Alive
    Cookie: ci_session=a%3A4%3A%7Bs%3A10%3A%22session_id%22%3Bs%3A32%3A%22db0623ac23c8c66b8a2e79c05c957594%22%3Bs%3A10%3A%22ip_address%22%3Bs%3A14%3A%2210.188.174.112%22%3Bs%3A10%3A%22user_agent%22%3Bb%3A0%3Bs%3A13%3A%22last_activity%22%3Bi%3A1384333973%3B%7D27104e86f8917945bcfbb26317570490
    Cookie2: $Version=1 */

    @Override
    public HttpMethod createMethod(Game game) {
        GetMethod method = new GetMethod(url);
        method.addRequestHeader("Accept", "application/json");
        method.addRequestHeader("Host", "vigilante.divisivemedia.com");
        method.addRequestHeader("Connection", "Keep-Alive");
        method.addRequestHeader(game.getSettings().getCookie());
        method.addRequestHeader("Cookie2", "$Version=1");
        return method;
    }
    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public URI getURI() {
        return uri;
    }

    @Override
    public ApiResult handleResponse(Game game, String response, Header[] headers) {
        System.out.println(response);
        return new ApiResult(true,headers,response);
    }
}
