package testpilot.helpers.http;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.net.URI;

/**
 * Created by ryogi on 15/09/15.
 */
public class Request {

    public static String httpPostJsonRequest(StringEntity body, String uri) {

        HttpClient httpClient = HttpClientBuilder.create().build();
        String jsonResponse = "";

        try {
            HttpPost request = new HttpPost(URI.create(uri));
            request.addHeader(HttpConstants.H_CONTENT_TYPE, HttpConstants.APPLICATION_JSON);

            request.setEntity(body);

            HttpResponse response = httpClient.execute(request);

            if(response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("No se pudo realizar la consulta POST a " + uri
                    + " HTTP error: " + response.getStatusLine().getStatusCode());
            }

            jsonResponse = EntityUtils.toString(response.getEntity());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonResponse;
    }

    public static String httpGetJsonRequest(String uri) {

        HttpClient httpClient = HttpClientBuilder.create().build();
        String jsonResponse = "";

        try {
            HttpGet request = new HttpGet(URI.create(uri));
            HttpResponse response = httpClient.execute(request);

            if(response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("No se pudo realizar la consulta GET a " + uri
                        + " HTTP error: " + response.getStatusLine().getStatusCode());
            }

            jsonResponse = EntityUtils.toString(response.getEntity());

        } catch(Exception e) {
            e.printStackTrace();
        }

        return jsonResponse;

    }
}
