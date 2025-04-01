package com.dao;

import com.entity.LishidangyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LishidangyuanVO;
import com.entity.view.LishidangyuanView;


/**
 * 历史团员
 * 
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
public interface LishidangyuanDao extends BaseMapper<LishidangyuanEntity> {
	
	List<LishidangyuanVO> selectListVO(@Param("ew") Wrapper<LishidangyuanEntity> wrapper);
	
	LishidangyuanVO selectVO(@Param("ew") Wrapper<LishidangyuanEntity> wrapper);
	
	List<LishidangyuanView> selectListView(@Param("ew") Wrapper<LishidangyuanEntity> wrapper);

	List<LishidangyuanView> selectListView(Pagination page,@Param("ew") Wrapper<LishidangyuanEntity> wrapper);
	
	LishidangyuanView selectView(@Param("ew") Wrapper<LishidangyuanEntity> wrapper);
	

}
