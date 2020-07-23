package com.sriram.travisci;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home/{name}")
    public ResponseEntity<String> home(@PathVariable String name) {
        return ResponseEntity.ok(String.format("Hello, %s!", name));
    }
}
