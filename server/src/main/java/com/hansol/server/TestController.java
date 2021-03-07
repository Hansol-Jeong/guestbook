package com.hansol.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
    @Value("${hansol.name}")
    private String testString;

    @GetMapping("/test")
    public String test() {
        return this.testString;
    }

    @GetMapping("/test2")
    public String test2() {
        return "test2";
    }
}
