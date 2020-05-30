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
 * b_case_series_collection
 */
@Table(name = "b_case_series_collection")
@TableName(value = "b_case_series_collection")
@Alias("caseSeriesCollection")
@Data
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

}