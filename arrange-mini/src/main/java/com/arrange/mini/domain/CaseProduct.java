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
 * b_case_product
 * @author kzc
 */
@TableName(value = "b_case_product")
@Alias("caseProduct")
@Data
public class CaseProduct {
    /**
     * 
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 产品名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 组别ID
     */
    @Column(name = "group_id")
    private Integer groupId;

    /**
     * 公司ID
     */
    @Column(name = "company_id")
    private Long companyId;

    /**
     * 总店id
     */
    @Column(name = "business_id")
    private Integer businessId;

    /**
     * 成分
     */
    @Column(name = "component")
    private String component;

    /**
     * 幅宽
     */
    @Column(name = "breadth")
    private String breadth;

    /**
     * 克重
     */
    @Column(name = "weight")
    private String weight;

    /**
     * 规格
     */
    @Column(name = "size")
    private String size;

    /**
     * 二维码图片地址
     */
    @Column(name = "qr_img")
    private String qrImg;

    /**
     * 封面图
     */
    @Column(name = "cover_img")
    private String coverImg;

    /**
     * 详细图片
     */
    @Column(name = "imgs")
    private String imgs;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 商品置顶 (0：未置顶  1：置顶)
     */
    @Column(name = "top_roof")
    private Integer topRoof;

    /**
     * 人气数(详情页点击次数)
     */
    @Column(name = "popularity")
    private Integer popularity;

    /**
     * 收藏数
     */
    @Column(name = "collection_num")
    private Integer collectionNum;

    /**
     * =-1删除,=1有效 =0撤销
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 版本号
     */
    @Column(name = "version")
    private Integer version;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "created_date")
    private Date createdDate;

    /**
     * 最后更新人
     */
    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 最后更新时间
     */
    @Column(name = "last_updated_date")
    private Date lastUpdatedDate;

}