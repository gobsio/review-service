package com.gobs.reviewservice.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ReviewEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String reviewerId;

    private String reviewedId;

    private String comment;

    private Short rating;

    private Integer upvotes;

    private Integer downvotes;  

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getReviewerId() {
        return this.reviewerId;
    }
    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getReviewedId() {
        return this.reviewedId;
    }
    public void setReviewedId(String reviewedId) {
        this.reviewedId = reviewedId;
    }

    public String getComment() {
        return this.comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Short getRating() {
        return this.rating;
    }
    public void setRating(Short rating) {
        this.rating = rating;
    }
    
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    
}
