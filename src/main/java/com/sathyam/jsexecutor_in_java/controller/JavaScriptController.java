package com.sathyam.jsexecutor_in_java.controller;


import com.sathyam.jsexecutor_in_java.service.JavaScriptExecutorService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/js")
public class JavaScriptController {

    private final JavaScriptExecutorService service;

    public JavaScriptController(JavaScriptExecutorService service) {
        this.service = service;
    }

    @PostMapping("/execute")
    public Result execute(@RequestBody ExpressionRequest request) {
        Object result = service.execute(request.getExpression());
        return new Result(result);
    }

    @Data
    public static class ExpressionRequest {
        private String expression;
    }

    @Data
    public static class Result {
        private final Object result;
    }
}
