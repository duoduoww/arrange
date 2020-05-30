package com.arrange.mini.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;

/**
 * @author kzc
 */
@Data
@Entity
public class BaseCriteria {

    @ApiModelProperty(value = "公司id")
    private Integer companyId;

    @ApiModelProperty(value = "关键字")
    private String search;

    /**
     * 分页参数，是否计算总条数。当设置为false时，总条数total总是返回-1。
     */

    private boolean countSql = true;
    /**
     * 第几页
     */
    @ApiModelProperty(value = "第几页")
    private Integer pageNo = 1;

    /**
     * 每页数
     */
    @ApiModelProperty(value = "每页数")
    private Integer pageSize = 10;
    /**
     * 分页参数，每页条数。当limit为0时，将查询全部数据。
     */
    private Integer limit = pageSize;

    /**
     * 分页参数，从第几条开始。
     */
    private Integer offset = (pageNo - 1) * pageSize;

}
