package org.example.paf_w5_submission;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    private static final Logger log = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/")
    public String rootEndpoint() {
        log.info("Root endpoint accessed");
        return "Your Spring Boot Application is Alive.!";
    }

    @GetMapping("/greet")
    public String greet() {
        log.info("Greet endpoint accessed");
        return "Welcome to Spring Boot!";
    }

    @GetMapping("/greet/{name}")
    public String greetName(@PathVariable String name, @RequestParam(value = "message", required = false) String message) {
        log.info("Greeting request received for name: {}", name);

        if (message != null && !message.isEmpty()) {
            log.info("Custom message provided: {}", message);
            return String.format("Hello %s! %s", name, message);
        }
        else {
            return String.format("Hello %s! Welcome to Spring Boot!", name);
        }
    }
}

