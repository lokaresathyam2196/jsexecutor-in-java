package com.sathyam.jsexecutor_in_java.engine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornEngine implements JavaScriptEngine {

    private final ScriptEngine engine;

    public NashornEngine() {
        ScriptEngineManager manager = new ScriptEngineManager();
        this.engine = manager.getEngineByName("nashorn");
    }

    @Override
    public Object execute(String expression) throws ScriptException {
        return engine.eval(expression);
    }

    @Override
    public String getName() {
        return "nashorn";
    }
}