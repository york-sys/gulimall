package com.atguigu.gulimall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @author gmd on 2021/11/25
 * @since 1.0.0
 */
@Data
public class MergeVo {
    private Long purchaseId;
    private List<Long> items;
}
