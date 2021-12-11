package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author york
 * @email york@gmail.com
 * @date 2021-10-22 16:35:20
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);

    /*
     *找到catalogId的完整路径
     * [父/子/孙]
     * */

    Long[] findCatalogPath(Long catelogId);

    void updateCascade(CategoryEntity category);

}

