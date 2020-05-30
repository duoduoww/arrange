package com.arrange.mini.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * b_case_series
 */
@Table(name = "b_case_series")
@TableName(value = "b_case_series")
@Alias("caseSeries")
public class CaseSeries {
    /**
     * 
     */
    @Id
    @Column(name = "id")
    @TableField(value = "id")
    private Integer id;

    /**
     * 案列名称
     */
    @Column(name = "name")
    @TableField(value = "name")
    private String name;

    /**
     * 组别ID
     */
    @Column(name = "type_id")
    @TableField(value = "type_id")
    private String typeId;

    /**
     * 标签值多个以,分割
     */
    @Column(name = "labels_id")
    @TableField(value = "labels_id")
    private String labelsId;

    /**
     * 产品id  多个以 , 区分
     */
    @Column(name = "product_id")
    @TableField(value = "product_id")
    private String productId;

    /**
     * 公司ID
     */
    @Column(name = "company_id")
    @TableField(value = "company_id")
    private Long companyId;

    /**
     * 总店id
     */
    @Column(name = "business_id")
    @TableField(value = "business_id")
    private Integer businessId;

    /**
     * 图片标签
     */
    @Column(name = "img_label")
    @TableField(value = "img_label")
    private String imgLabel;

    /**
     * 图片
     */
    @Column(name = "imgs")
    @TableField(value = "imgs")
    private String imgs;

    /**
     * 图片2
     */
    @Column(name = "two_imgs")
    @TableField(value = "two_imgs")
    private String twoImgs;

    /**
     * 图片3
     */
    @Column(name = "three_imgs")
    @TableField(value = "three_imgs")
    private String threeImgs;

    /**
     * 商品置顶 (0：未置顶  1：置顶)
     */
    @Column(name = "top_roof")
    @TableField(value = "top_roof")
    private Integer topRoof;

    /**
     * 人气数(详情页点击次数)
     */
    @Column(name = "popularity")
    @TableField(value = "popularity")
    private Integer popularity;

    /**
     * 收藏数
     */
    @Column(name = "collection_num")
    @TableField(value = "collection_num")
    private Integer collectionNum;

    /**
     * =-1删除,=1有效 =0撤销
     */
    @Column(name = "status")
    @TableField(value = "status")
    private Integer status;

    /**
     * 版本号
     */
    @Column(name = "version")
    @TableField(value = "version")
    private Integer version;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    @TableField(value = "created_by")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "created_date")
    @TableField(value = "created_date")
    private Date createdDate;

    /**
     * 最后更新人
     */
    @Column(name = "last_updated_by")
    @TableField(value = "last_updated_by")
    private String lastUpdatedBy;

    /**
     * 最后更新时间
     */
    @Column(name = "last_updated_date")
    @TableField(value = "last_updated_date")
    private Date lastUpdatedDate;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 案列名称
     * @return name 案列名称
     */
    public String getName() {
        return name;
    }

    /**
     * 案列名称
     * @param name 案列名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 组别ID
     * @return type_id 组别ID
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * 组别ID
     * @param typeId 组别ID
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     * 标签值多个以,分割
     * @return labels_id 标签值多个以,分割
     */
    public String getLabelsId() {
        return labelsId;
    }

    /**
     * 标签值多个以,分割
     * @param labelsId 标签值多个以,分割
     */
    public void setLabelsId(String labelsId) {
        this.labelsId = labelsId;
    }

    /**
     * 产品id  多个以 , 区分
     * @return product_id 产品id  多个以 , 区分
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 产品id  多个以 , 区分
     * @param productId 产品id  多个以 , 区分
     */
    public void setProductId(String productId) {
        this.productId = productId;
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
     * 图片标签
     * @return img_label 图片标签
     */
    public String getImgLabel() {
        return imgLabel;
    }

    /**
     * 图片标签
     * @param imgLabel 图片标签
     */
    public void setImgLabel(String imgLabel) {
        this.imgLabel = imgLabel;
    }

    /**
     * 图片
     * @return imgs 图片
     */
    public String getImgs() {
        return imgs;
    }

    /**
     * 图片
     * @param imgs 图片
     */
    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    /**
     * 图片2
     * @return two_imgs 图片2
     */
    public String getTwoImgs() {
        return twoImgs;
    }

    /**
     * 图片2
     * @param twoImgs 图片2
     */
    public void setTwoImgs(String twoImgs) {
        this.twoImgs = twoImgs;
    }

    /**
     * 图片3
     * @return three_imgs 图片3
     */
    public String getThreeImgs() {
        return threeImgs;
    }

    /**
     * 图片3
     * @param threeImgs 图片3
     */
    public void setThreeImgs(String threeImgs) {
        this.threeImgs = threeImgs;
    }

    /**
     * 商品置顶 (0：未置顶  1：置顶)
     * @return top_roof 商品置顶 (0：未置顶  1：置顶)
     */
    public Integer getTopRoof() {
        return topRoof;
    }

    /**
     * 商品置顶 (0：未置顶  1：置顶)
     * @param topRoof 商品置顶 (0：未置顶  1：置顶)
     */
    public void setTopRoof(Integer topRoof) {
        this.topRoof = topRoof;
    }

    /**
     * 人气数(详情页点击次数)
     * @return popularity 人气数(详情页点击次数)
     */
    public Integer getPopularity() {
        return popularity;
    }

    /**
     * 人气数(详情页点击次数)
     * @param popularity 人气数(详情页点击次数)
     */
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    /**
     * 收藏数
     * @return collection_num 收藏数
     */
    public Integer getCollectionNum() {
        return collectionNum;
    }

    /**
     * 收藏数
     * @param collectionNum 收藏数
     */
    public void setCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
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
     * 版本号
     * @return version 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本号
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 创建人
     * @return created_by 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 创建人
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 创建时间
     * @return created_date 创建时间
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * 创建时间
     * @param createdDate 创建时间
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 最后更新人
     * @return last_updated_by 最后更新人
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * 最后更新人
     * @param lastUpdatedBy 最后更新人
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * 最后更新时间
     * @return last_updated_date 最后更新时间
     */
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * 最后更新时间
     * @param lastUpdatedDate 最后更新时间
     */
    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
}