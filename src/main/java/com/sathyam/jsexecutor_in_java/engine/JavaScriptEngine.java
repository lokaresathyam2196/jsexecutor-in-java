package com.sathyam.jsexecutor_in_java.engine;

public interface JavaScriptEngine {
    Object execute(String expression) throws Exception;
    String getName();
}

