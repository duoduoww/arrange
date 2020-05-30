package com.arrangement.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.type.Alias;

/**
 * b_case_series_collection
 */
@Table(name = "b_case_series_collection")
@TableName(value = "b_case_series_collection")
@Alias("caseSeriesCollection")
public class CaseSeriesCollection {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @TableField(value = "id")
    private Integer id;

    /**
     * 案列id
     */
    @Column(name = "series_id")
    @TableField(value = "series_id")
    private Integer seriesId;

    /**
     * 客户id
     */
    @Column(name = "customer_id")
    @TableField(value = "customer_id")
    private Integer customerId;

    /**
     * 公司id
     */
    @Column(name = "company_id")
    @TableField(value = "company_id")
    private Integer companyId;

    /**
     * 总店id
     */
    @Column(name = "business_id")
    @TableField(value = "business_id")
    private Integer businessId;

    /**
     * =-1删除,=1有效 =0撤销
     */
    @Column(name = "status")
    @TableField(value = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 案列id
     * @return series_id 案列id
     */
    public Integer getSeriesId() {
        return seriesId;
    }

    /**
     * 案列id
     * @param seriesId 案列id
     */
    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    /**
     * 客户id
     * @return customer_id 客户id
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * 客户id
     * @param customerId 客户id
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * 公司id
     * @return company_id 公司id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 公司id
     * @param companyId 公司id
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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
     * =-1删除,=1有效 =0撤销
     * @return status =-1删除,=1有效 =0撤销
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * =-1删除,=1有效 =0撤销
     * @param status =-1删除,=1有效 =0撤销
     */
    public void setStatus(Integer status) {
        this.status = status;
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
}