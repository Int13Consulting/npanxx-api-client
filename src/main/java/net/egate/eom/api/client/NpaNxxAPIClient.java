package net.egate.eom.api.client;

import com.google.gson.Gson;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import net.egate.npanxx.objects.NPANXXEntry;
import org.apache.log4j.Logger;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.Request;
import org.asynchttpclient.RequestBuilder;
import org.asynchttpclient.Response;

/**
 *
 * @author mgamble
 */
public class NpaNxxAPIClient implements Closeable {

    private static final String JSON = "application/json; charset=UTF-8";
    private final boolean closeClient;
    private final AsyncHttpClient client;
    private final String url;

    private final Logger logger;
    private boolean closed = false;
    private static final Version version = new Version();
    Gson gson = new Gson();

    public NpaNxxAPIClient(String url) throws Exception {
        this.logger = Logger.getLogger(NpaNxxAPIClient.class);
        this.url = url;
      
        this.client = new DefaultAsyncHttpClient();

        closeClient = true;

    }

    //////////////////////////////////////////////////////////////////////
    // Closeable interface methods
    //////////////////////////////////////////////////////////////////////
    public boolean isClosed() {
        return closed || client.isClosed();
    }

    public void close() {
        if (closeClient && !client.isClosed()) {
            try {
                client.close();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(NpaNxxAPIClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        closed = true;
    }


    ///v2/dynamics/:customerGUID/contact
    public NPANXXEntry getNPXNXXEntry(String npa, String nxx) throws Exception {
        Future<Response> f = client.executeRequest(buildRequest("GET", "/query/npa/" + npa + "/" + nxx));
        Response r = f.get();
        if (r.getStatusCode() != 200) {

            throw new Exception("Could not query NPA NXX API");
        } else {

            return gson.fromJson(r.getResponseBody(), NPANXXEntry.class);

        }
    }

    public static String getVersion() {
        return version.getBuildNumber();
    }

    private Request buildRequest(String type, String subUrl) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                
                .build();
        return request;
    }

    private Request buildRequest(String type, String subUrl, String requestBody) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                .setBody(requestBody)
                .build();
        return request;
    }
}
