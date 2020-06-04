package com.arrange.mini.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * b_case_product_collection
 * @author kzc
 */
@TableName(value = "b_case_product_collection")
@Alias("caseProductCollection")
@Data
public class CaseProductCollection {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @TableId(value="id", type= IdType.AUTO)
    @ApiModelProperty(hidden = true)
    private Integer id;

    /**
     * 商品id
     */
    @TableField(value = "product_id")
    @ApiModelProperty(value = "商品id",required = true)
    private Integer productId;

    /**
     * 客户id
     */
    @TableField(value = "customer_id")
    @ApiModelProperty(value = "客户id",required = true)
    private Integer customerId;

    /**
     * 公司id
     */
    @TableField(value = "company_id")
    @ApiModelProperty(value = "公司id",required = true)
    private Integer companyId;

    /**
     * 总店id
     */
    @TableField(value = "business_id")
    @ApiModelProperty(value = "总公司id",required = true)
    private Integer businessId;

    /**
     * =-1删除,=1有效 =0撤销
     */
    @TableField(value = "status")
    @ApiModelProperty(hidden = true)
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(hidden = true)
    private Date createTime;
}