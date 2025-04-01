package com.dao;

import com.entity.ShiwushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiwushenqingVO;
import com.entity.view.ShiwushenqingView;


/**
 * 事务申请
 * 
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
public interface ShiwushenqingDao extends BaseMapper<ShiwushenqingEntity> {
	
	List<ShiwushenqingVO> selectListVO(@Param("ew") Wrapper<ShiwushenqingEntity> wrapper);
	
	ShiwushenqingVO selectVO(@Param("ew") Wrapper<ShiwushenqingEntity> wrapper);
	
	List<ShiwushenqingView> selectListView(@Param("ew") Wrapper<ShiwushenqingEntity> wrapper);

	List<ShiwushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ShiwushenqingEntity> wrapper);
	
	ShiwushenqingView selectView(@Param("ew") Wrapper<ShiwushenqingEntity> wrapper);
	

}
