package com.tsign.terminal.controller.api;

import com.tsign.terminal.controller.dao.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
//    @RequestMapping(method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("name: " + name);

        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
