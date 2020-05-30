package com.arrange.mini.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * b_case_advertise
 * @author kzc
 */
@TableName(value = "b_case_advertise")
@Alias("caseAdvertise")
@Data
public class CaseAdvertise {
    /**
     * 
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 轮播图
     */
    @TableField(value = "advertise_img")
    private String advertiseImg;

    /**
     * 排序(由大到小)
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 公司id
     */
    @TableField(value = "company_id")
    private Integer companyId;

    /**
     * 总店id
     */
    @TableField(value = "business_id")
    private Integer businessId;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * =-1删除,=1有效 =0停用
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 版本号
     */
    @TableField(value = "version")
    private Integer version;

    /**
     * 创建人
     */
    @TableField(value = "created_by")
    private String createdBy;

    /**
     * 创建时间
     */
    @TableField(value = "created_date")
    private Date createdDate;

    /**
     * 最后更新人
     */
    @TableField(value = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 最后更新时间
     */
    @TableField(value = "last_updated_date")
    private Date lastUpdatedDate;

    /**
     * 连接地址
     */
    @TableField(value = "url")
    private String url;

}