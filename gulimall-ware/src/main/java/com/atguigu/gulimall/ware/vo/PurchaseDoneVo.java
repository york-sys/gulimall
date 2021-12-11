package com.atguigu.gulimall.ware.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author gmd on 2021/11/30
 * @since 1.0.0
 */
@Data
public class PurchaseDoneVo {

    @NotNull
  private Long id;//采购单id

    private List<PurchaseItemDoneVo> items;

}
