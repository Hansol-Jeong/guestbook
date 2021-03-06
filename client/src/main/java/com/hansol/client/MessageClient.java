package com.hansol.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.*;

@FeignClient(
        value = "messages",
        url = "http://localhost:8081/messages")
public interface MessageClient {
    @GetMapping(path = "/")
    PagedModel<Message> getMessages();

    @GetMapping(path = "{id}")
    Message getMessage(@PathVariable("id") long messageId);

    @PostMapping("/")
    Message add(@RequestBody Message message);
}
