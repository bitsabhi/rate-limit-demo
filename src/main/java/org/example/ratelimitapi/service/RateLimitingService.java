package org.example.ratelimitapi.service;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;
import io.github.bucket4j.Refill;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class RateLimitingService {

    private final Bucket bucket;

    public RateLimitingService() {
        // Define the rate limit: 10 tokens (requests) per minute
        Bandwidth limit = Bandwidth.classic(10, Refill.greedy(10, Duration.ofMinutes(1)));

        // Create the bucket with the defined rate limit
        this.bucket = Bucket4j.builder().addLimit(limit).build();
    }

    /**
     * Checks if the request is rate-limited.
     *
     * @return true if the request is rate-limited (no tokens available), false otherwise
     */
    public boolean isRateLimited() {
        // Try to consume a token from the bucket
        return !bucket.tryConsume(1);
    }
}