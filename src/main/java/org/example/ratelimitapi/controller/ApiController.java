package org.example.ratelimitapi.controller;


import org.example.ratelimitapi.service.RateLimitingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final RateLimitingService rateLimitingService;

    public ApiController(RateLimitingService rateLimitingService) {
        this.rateLimitingService = rateLimitingService;
    }

    @GetMapping("/hmu")
    public ResponseEntity<String> hmu() {
        if (rateLimitingService.isRateLimited()) {
            return ResponseEntity.status(429).body("Rate limit exceeded. Try again later.");
        }
        return ResponseEntity.ok("Hello, whats up!!");
    }
}