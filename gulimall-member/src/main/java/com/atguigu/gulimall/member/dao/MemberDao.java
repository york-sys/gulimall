package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author york
 * @email york@gmail.com
 * @date 2021-11-13 20:50:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
