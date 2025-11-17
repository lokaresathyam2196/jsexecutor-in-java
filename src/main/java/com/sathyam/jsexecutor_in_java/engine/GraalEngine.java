package com.sathyam.jsexecutor_in_java.engine;

import org.graalvm.polyglot.*;

public class GraalEngine implements JavaScriptEngine {

    @Override
    public Object execute(String expression) {
        try (Context context = Context.newBuilder("js")
                .allowAllAccess(true)
                .build()) {
            Value value = context.eval("js", expression);
            return value.as(Object.class);
        }
    }

    @Override
    public String getName() {
        return "graal";
    }
}