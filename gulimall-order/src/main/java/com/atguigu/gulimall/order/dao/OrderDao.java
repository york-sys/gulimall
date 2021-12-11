package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author york
 * @email york@gmail.com
 * @date 2021-10-22 18:52:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
