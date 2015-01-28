package com.mycompany.alfresco.webscripts;

import org.springframework.extensions.webscripts.Cache;
import org.springframework.extensions.webscripts.DeclarativeWebScript;
import org.springframework.extensions.webscripts.Status;
import org.springframework.extensions.webscripts.WebScriptRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author martin.bergljung@marversolutions.com
 * @version 1.0
 */
public class HelloWorldWebScript extends DeclarativeWebScript {
    protected Map<String, Object> executeImpl(WebScriptRequest req, Status status, Cache cache) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("hello", "Hello");
        return model;
    }
}
