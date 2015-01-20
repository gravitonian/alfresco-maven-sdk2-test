package com.mycompany.alfresco.webscripts;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.extensions.webscripts.*;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit testing the Web Script Java Controller
 *
 * @author martin.bergljung@marversolutions.com
 * @version 1.0
 */
public class HelloWorldWebScriptControllerTest {

    @Test
    public void testController() {
        WebScriptRequest req = Mockito.mock(WebScriptRequest.class);
        Status status = Mockito.mock(Status.class);
        Cache cache = Mockito.mock(Cache.class);

        String helloPropName = "hello";
        String helloPropExpectedValue = "Hello";
        HelloWorldWebScript ws = new HelloWorldWebScript();
        Map<String, Object> model = ws.executeImpl(req, status, cache);

        assertNotNull("Response from Web Script Java Controller is null", model);
        assertEquals("Web Script Java Controller response is not " + helloPropExpectedValue,
                helloPropExpectedValue, model.get(helloPropName));
    }
}
