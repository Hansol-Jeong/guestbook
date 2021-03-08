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

    @Value("${hansol.firstName}")
    private String testString2;

    @Value("${sample.zipkin.enabled}")
    private String testString3;

    @GetMapping("/test")
    public String test() {
        return this.testString;
    }

    @GetMapping("/test2")
    public String test2() {
        return "test2";
    }

    @GetMapping("/test3")
    public String test3() {
        return this.testString2;
    }

    @GetMapping("/test4")
    public String test4() { return this.testString3; }
}
