package com.gobs.reviewservice.controller;

import java.math.BigInteger;

import javax.validation.Valid;

import com.gobs.reviewservice.domain.ReviewEntity;
import com.gobs.reviewservice.domain.requests.GetReviewRequestArguments;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @GetMapping
    public ResponseEntity<?> find(@Valid GetReviewRequestArguments arguments) throws Exception {
        return ResponseEntity.ok("{}");
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ReviewEntity entity) throws Exception {
        return ResponseEntity.ok("{}");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") BigInteger id) throws Exception {
        return ResponseEntity.ok("{}");
    }

    //
    //
    //
    @PutMapping("/{id}/upvote")
    public ResponseEntity<?> upvote(@PathVariable("id") BigInteger id) throws Exception {
        return ResponseEntity.ok("{}");
    }

    @PutMapping("/{id}/downvote")
    public ResponseEntity<?> downvote(@PathVariable("id") BigInteger id) throws Exception {
        return ResponseEntity.ok("{}");
    }

}