package com.dao;

import com.entity.DangwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangwuxinxiVO;
import com.entity.view.DangwuxinxiView;


/**
 * 团务信息
 * 
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
public interface DangwuxinxiDao extends BaseMapper<DangwuxinxiEntity> {
	
	List<DangwuxinxiVO> selectListVO(@Param("ew") Wrapper<DangwuxinxiEntity> wrapper);
	
	DangwuxinxiVO selectVO(@Param("ew") Wrapper<DangwuxinxiEntity> wrapper);
	
	List<DangwuxinxiView> selectListView(@Param("ew") Wrapper<DangwuxinxiEntity> wrapper);

	List<DangwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DangwuxinxiEntity> wrapper);
	
	DangwuxinxiView selectView(@Param("ew") Wrapper<DangwuxinxiEntity> wrapper);
	

}
