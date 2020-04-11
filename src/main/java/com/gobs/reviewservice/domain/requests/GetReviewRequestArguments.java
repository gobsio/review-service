package com.gobs.reviewservice.domain.requests;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

public class GetReviewRequestArguments extends DefaultRequestArguments {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private String reviewId;

    @Getter
    @Setter
    private String reviewerId;

    @Getter
    @Setter
    // @NotBlank // argument is required
    private String reviewedId;

}
