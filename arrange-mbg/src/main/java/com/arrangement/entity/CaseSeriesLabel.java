package com.arrangement.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * b_case_series_label
 */
@Table(name = "b_case_series_label")
@TableName(value = "b_case_series_label")
@Alias("caseSeriesLabel")
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

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 案列标签名称
     * @return name 案列标签名称
     */
    public String getName() {
        return name;
    }

    /**
     * 案列标签名称
     * @param name 案列标签名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 总店id
     * @return business_id 总店id
     */
    public Integer getBusinessId() {
        return businessId;
    }

    /**
     * 总店id
     * @param businessId 总店id
     */
    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    /**
     * 公司ID
     * @return company_id 公司ID
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 公司ID
     * @param companyId 公司ID
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 状态（0：正常， 1：停用)
     * @return status 状态（0：正常， 1：停用)
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 状态（0：正常， 1：停用)
     * @param status 状态（0：正常， 1：停用)
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}