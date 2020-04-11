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
    private Integer pageIndex = 0;

    @Getter
    @Setter
    private Integer pageSize = 10;

    public DefaultRequestArguments defaultPageSize(Integer pageSize) {
        this.pageSize = (this.pageSize == null) ? pageSize : this.pageSize; 
        return this;
    }

    public DefaultRequestArguments defaultPageIndex(Integer pageIndex) {
        this.pageIndex = (this.pageIndex == null) ? pageIndex : this.pageIndex; 
        return this;
    }

    public DefaultRequestArguments defaultSortBy(String sortBy) {
        this.sortBy = (this.sortBy == null) ? sortBy : this.sortBy; 
        return this;
    }

    public DefaultRequestArguments defaultSortOrder(String sortOrder) {
        this.sortOrder = (this.sortOrder == null) ? sortOrder : this.sortOrder; 
        return this;
    }

}
