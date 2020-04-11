package com.gobs.reviewservice.controllers;

import javax.validation.Valid;

import com.gobs.reviewservice.domain.ReviewEntity;
import com.gobs.reviewservice.domain.requests.GetReviewRequestArguments;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @formatter:off
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @GetMapping
    public ResponseEntity<?> fetch(@Valid GetReviewRequestArguments arguments, 
                                  OAuth2Authentication authentication) throws Exception {
        return ResponseEntity.ok("{}");
    }

    @PostMapping 
    public ResponseEntity<?> create(@RequestBody ReviewEntity entity, 
                                    OAuth2Authentication authentication) throws Exception {
        return ResponseEntity.ok("{}");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id, 
                                    OAuth2Authentication authentication) throws Exception {
        return ResponseEntity.ok("{}");
    }

    @PutMapping("/{id}/upvote")
    public ResponseEntity<?> upvote(@PathVariable String id, 
                                    OAuth2Authentication authentication) throws Exception {
        return ResponseEntity.ok("{}");
    }

    @PutMapping("/{id}/downvote")
    public ResponseEntity<?> downvote(@PathVariable String id,
                                      OAuth2Authentication authentication) throws Exception {
        return ResponseEntity.ok("{}");
    }

}