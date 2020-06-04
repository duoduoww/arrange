package com.arrange.mini.dto.result;

import com.arrange.mini.domain.CaseProductCollection;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * @author kzc
 */
@Data
public class ProductCollResult extends CaseProductCollection implements Serializable {

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 封面图
     */
    private String coverImg;

    /**
     * 人气数(详情页点击次数)
     */
    private Integer popularity;

    /**
     * 收藏数
     */
    private Integer collectionNum;
}
