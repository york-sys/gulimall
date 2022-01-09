package com.atguigu.common.to;

import lombok.Data;

/**
 * @author gmd on 2021/12/21
 * @since 1.0.0
 */
@Data
public class SkuHasStockVo {
    private Long skuId;
    private Boolean hasStock;
}
