package com.arrange.mini.dto.result;

import com.arrange.mini.domain.CaseProduct;
import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;

/**
 * @author kzc
 */
@Data
public class ProductResult extends CaseProduct {

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 是否收藏  0 未收藏 / 1 已收藏
     */

    private Integer customerColl;
}
