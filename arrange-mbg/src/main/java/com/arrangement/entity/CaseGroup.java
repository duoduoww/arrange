package com.arrangement.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import javax.persistence.Id;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * b_case_group
 */
@TableName(value = "b_case_group")
@Alias("caseGroup")
@Data
public class CaseGroup {
    /**
     * 
     */
    @Id
    @TableField(value = "id")
    private Long id;

    /**
     * 分组名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 封面图
     */
    @TableField(value = "series_img")
    private String seriesImg;

    /**
     * 总店id
     */
    @TableField(value = "business_id")
    private Integer businessId;

    /**
     * 公司ID
     */
    @TableField(value = "company_id")
    private Long companyId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 状态（0：正常， 1：停用)
     */
    @TableField(value = "status")
    private Boolean status;

}