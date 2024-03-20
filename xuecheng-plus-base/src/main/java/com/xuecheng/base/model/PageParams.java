package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PageParams {

    @ApiModelProperty("当前页码")
    private Long pageNo=1L;

    @ApiModelProperty("每页记录数默认值")
    private Long pageSize=10L;

    public PageParams() {

    }
    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }



}
