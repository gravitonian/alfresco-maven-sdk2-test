package com.mycompany.alfresco.webscripts;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Integration Test (IT) for Hello World web script.
 *
 * @author martin.bergljung@marversolutions.com
 * @version 1.0
 */
public class HelloWorldWebScriptIT {
    @Test
    public void testWebScriptCall() throws Exception {
        String webscriptURL = "http://localhost:8080/alfresco/service/ecmstuff/helloworld";
        String expectedResponse = "Hello World";

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(webscriptURL);
            HttpResponse httpResponse = httpclient.execute(httpget);
            assertEquals("HTTP Response Status is not OK(200)", HttpStatus.SC_OK, httpResponse.getStatusLine().getStatusCode());
            HttpEntity entity = httpResponse.getEntity();
            assertNotNull("Response from Web Script is null", entity);
            assertEquals("Web Script response is not " + expectedResponse, expectedResponse, EntityUtils.toString(entity));
        } finally {
            httpclient.close();
        }
    }
}
