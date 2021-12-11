package com.atguigu.gulimall.product.vo;

import com.atguigu.gulimall.product.entity.AttrEntity;
import lombok.Data;

import java.util.List;

/**
 * @author gmd on 2021/11/18
 * @since 1.0.0
 */
    @Data
    public class AttrGroupWithAttrsVo {


        /**
         * 分组id
         */
        private Long attrGroupId;
        /**
         * 组名
         */
        private String attrGroupName;
        /**
         * 排序
         */
        private Integer sort;
        /**
         * 描述
         */
        private String descript;
        /**
         * 组图标
         */
        private String icon;
        /**
         * 所属分类id
         */
        private Long catalogId;

        private List<AttrEntity> attrs;
    }


