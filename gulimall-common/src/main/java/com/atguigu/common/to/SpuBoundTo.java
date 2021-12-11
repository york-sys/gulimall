package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author gmd on 2021/11/21
 * @since 1.0.0
 */
@Data
public class SpuBoundTo {
    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
}
