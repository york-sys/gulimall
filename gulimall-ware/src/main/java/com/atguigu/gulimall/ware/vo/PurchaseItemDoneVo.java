package com.atguigu.gulimall.ware.vo;

import lombok.Data;

/**
 * @author gmd on 2021/11/30
 * @since 1.0.0
 */

@Data
public class PurchaseItemDoneVo {
    private Long itemId;
    private Integer status;
    private String reason;
}
