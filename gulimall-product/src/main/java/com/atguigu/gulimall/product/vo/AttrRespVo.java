package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @author gmd on 2021/11/15
 * @since 1.0.0
 */
@Data
public class AttrRespVo extends AttrVo {

    private String catalogName;
    private String groupName;

    private Long[] catalogPath;

}
