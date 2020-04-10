package com.gobs.reviewservice.domain.requests;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class DefaultRequestArguments implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private String sortBy;

    @Getter
    @Setter
    private String sortOrder;

    @Getter
    @Setter
    private Integer pageIndex;

    @Getter
    @Setter
    private Integer pageSize;

}
