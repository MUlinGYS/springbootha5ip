package com.dao;

import com.entity.ZhuanchushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanchushenqingVO;
import com.entity.view.ZhuanchushenqingView;


/**
 * 转出申请
 * 
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
public interface ZhuanchushenqingDao extends BaseMapper<ZhuanchushenqingEntity> {
	
	List<ZhuanchushenqingVO> selectListVO(@Param("ew") Wrapper<ZhuanchushenqingEntity> wrapper);
	
	ZhuanchushenqingVO selectVO(@Param("ew") Wrapper<ZhuanchushenqingEntity> wrapper);
	
	List<ZhuanchushenqingView> selectListView(@Param("ew") Wrapper<ZhuanchushenqingEntity> wrapper);

	List<ZhuanchushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanchushenqingEntity> wrapper);
	
	ZhuanchushenqingView selectView(@Param("ew") Wrapper<ZhuanchushenqingEntity> wrapper);
	

}
