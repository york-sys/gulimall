package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author york
 * @email york@gmail.com
 * @date 2021-11-13 20:38:02
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
