package com.arrange.mini.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * b_case_img_label
 * @author kzc
 */
@Table(name = "b_case_img_label")
@Alias("caseImgLabel")
@Data
public class CaseImgLabel {
    /**
     * 
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 案列图片标签名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 总店id
     */
    @Column(name = "business_id")
    private Integer businessId;

    /**
     * 公司ID
     */
    @Column(name = "company_id")
    private Long companyId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 状态（0：正常， 1：停用)
     */
    @Column(name = "status")
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

}