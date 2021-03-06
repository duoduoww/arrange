package com.arrange.mini.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * b_case_series_label
 */
@Table(name = "b_case_series_label")
@TableName(value = "b_case_series_label")
@Alias("caseSeriesLabel")
@Data
public class CaseSeriesLabel {
    /**
     * 
     */
    @Id
    @Column(name = "id")
    @TableField(value = "id")
    private Long id;

    /**
     * 案列标签名称
     */
    @Column(name = "name")
    @TableField(value = "name")
    private String name;

    /**
     * 总店id
     */
    @Column(name = "business_id")
    @TableField(value = "business_id")
    private Integer businessId;

    /**
     * 公司ID
     */
    @Column(name = "company_id")
    @TableField(value = "company_id")
    private Long companyId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 状态（0：正常， 1：停用)
     */
    @Column(name = "status")
    @TableField(value = "status")
    private Boolean status;

}