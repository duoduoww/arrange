package com.arrange.mini.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * b_case_browse
 * @author kzc
 */
@TableName(value = "b_case_browse")
@Alias("caseBrowse")
@Data
public class CaseBrowse {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 客戶ID
     */
    @Column(name = "customer_id")
    private Integer customerId;

    /**
     * 驻留时长
     */
    @Column(name = "resident")
    private Integer resident;

    /**
     * 公司ID
     */
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 品种ID
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 浏览类型 0商品 / 1案列 / 2 文章
     */
    @Column(name = "resident_type")
    private Integer residentType;

}