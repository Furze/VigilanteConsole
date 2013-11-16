package dev.xor.sftd.api.methods.sftd;

import org.apache.commons.httpclient.Header;

/**
 * Created with IntelliJ IDEA.
 * User: Troy
 * Date: 16/11/13
 * Time: 11:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApiResult {
    private boolean successful;
    private Header[] headers;
    private String response;

    public ApiResult(boolean successful, Header[] headers, String response) {
        this.successful = successful;
        this.headers = headers;
        this.response = response;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public Header[] getHeaders() {
        return headers;
    }

    public String getResponse() {
        return response;
    }
}
