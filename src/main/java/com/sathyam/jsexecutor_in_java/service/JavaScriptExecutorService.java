package com.sathyam.jsexecutor_in_java.service;

import org.springframework.stereotype.Service;

@Service
public class JavaScriptExecutorService {

    private final JavaScriptEngineManager engineManager;

    public JavaScriptExecutorService(JavaScriptEngineManager engineManager) {
        this.engineManager = engineManager;
    }

    public Object execute(String expression) {
        try {
            return engineManager.getEngine().execute(expression);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
