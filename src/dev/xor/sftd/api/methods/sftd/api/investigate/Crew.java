package dev.xor.sftd.api.methods.sftd.api.investigate;

import dev.xor.sftd.api.Game;
import dev.xor.sftd.api.methods.sftd.ApiMethod;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpMethod;

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
public class Crew extends ApiMethod {
    String cookie = "";
    String crewNumber = ""+2884;
    public Crew(String cookie, String crewNumber){
        this.cookie = cookie;
        this.crewNumber = crewNumber;
    }

    /*GET /api/createMethod/crew/2884 HTTP/1.1
    Accept: application/json
    Host: vigilante.divisivemedia.com
    Connection: Keep-Alive
    Cookie: ci_session=a%3A4%3A%7Bs%3A10%3A%22session_id%22%3Bs%3A32%3A%22db0623ac23c8c66b8a2e79c05c957594%22%3Bs%3A10%3A%22ip_address%22%3Bs%3A14%3A%2210.188.174.112%22%3Bs%3A10%3A%22user_agent%22%3Bb%3A0%3Bs%3A13%3A%22last_activity%22%3Bi%3A1384333973%3B%7D27104e86f8917945bcfbb26317570490
    Cookie2: $Version=1 */

    @Override
    public HttpMethod createMethod(Game game) {
        try {
            URL url = new URL(getUrl());
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            //add request header



            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            //print result
            System.out.println(response.toString());

        } catch (Exception MalformedURLException) {

        }
       return null;
    }
    @Override
    public String getUrl() {
        return BASE_URL + "/crew/" + crewNumber;
    }
    @Override
    public URI getURI() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean handleResponse(Game game, String response, Header[] headers) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
