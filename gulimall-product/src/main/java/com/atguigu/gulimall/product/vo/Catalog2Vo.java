package com.atguigu.gulimall.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author gmd on 2021/12/27
 * @since 1.0.0
 */
//2级分类Vo
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Catalog2Vo {
 private String catalog1Id;   //1级父分类id
 private List<Catalog3Vo> catalog3List;  //三级子分类
 private String id;
 private String name;

    /**
     * 三级分类Vo
     */
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Catalog3Vo{
      private String catalog2Id;
      private String id;
      private String name;
 }
}
