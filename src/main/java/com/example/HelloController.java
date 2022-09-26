package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello!");
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> sayHelloWithName(@PathVariable("name") final String name) {
        return ResponseEntity.ok("Hello! " + name);
    }
}
