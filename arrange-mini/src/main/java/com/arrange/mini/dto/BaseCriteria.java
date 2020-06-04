package com.arrange.mini.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Entity;

/**
 * @author kzc
 */
@Data
@Entity
public class BaseCriteria {

    @ApiModelProperty(value = "公司id",required = true)
    private Integer companyId;

    @ApiModelProperty(value = "关键字")
    private String search;

    @ApiModelProperty(value = "分组id")
    private Integer groupId;

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

}
