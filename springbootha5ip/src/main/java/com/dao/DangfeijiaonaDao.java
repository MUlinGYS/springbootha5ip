package com.dao;

import com.entity.DangfeijiaonaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangfeijiaonaVO;
import com.entity.view.DangfeijiaonaView;


/**
 * 团费缴纳
 * 
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
public interface DangfeijiaonaDao extends BaseMapper<DangfeijiaonaEntity> {
	
	List<DangfeijiaonaVO> selectListVO(@Param("ew") Wrapper<DangfeijiaonaEntity> wrapper);
	
	DangfeijiaonaVO selectVO(@Param("ew") Wrapper<DangfeijiaonaEntity> wrapper);
	
	List<DangfeijiaonaView> selectListView(@Param("ew") Wrapper<DangfeijiaonaEntity> wrapper);

	List<DangfeijiaonaView> selectListView(Pagination page,@Param("ew") Wrapper<DangfeijiaonaEntity> wrapper);
	
	DangfeijiaonaView selectView(@Param("ew") Wrapper<DangfeijiaonaEntity> wrapper);
	

}
