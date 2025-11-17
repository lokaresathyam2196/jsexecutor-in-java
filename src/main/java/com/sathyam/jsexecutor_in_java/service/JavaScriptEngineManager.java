package com.sathyam.jsexecutor_in_java.service;

import com.sathyam.jsexecutor_in_java.engine.GraalEngine;
import com.sathyam.jsexecutor_in_java.engine.JavaScriptEngine;
import com.sathyam.jsexecutor_in_java.engine.NashornEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaScriptEngineManager {

    private final JavaScriptEngine activeEngine;

    public JavaScriptEngineManager(
            @Value("${js.engine:graal}") String engineName) {

        switch (engineName.toLowerCase()) {
            case "nashorn":
                this.activeEngine = new NashornEngine();
                break;
            default:
                this.activeEngine = new GraalEngine();
        }
    }

    public JavaScriptEngine getEngine() {
        return activeEngine;
    }
}