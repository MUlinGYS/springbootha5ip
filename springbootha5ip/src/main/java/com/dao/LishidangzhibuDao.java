package com.dao;

import com.entity.LishidangzhibuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LishidangzhibuVO;
import com.entity.view.LishidangzhibuView;


/**
 * 历史团支部
 * 
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
public interface LishidangzhibuDao extends BaseMapper<LishidangzhibuEntity> {
	
	List<LishidangzhibuVO> selectListVO(@Param("ew") Wrapper<LishidangzhibuEntity> wrapper);
	
	LishidangzhibuVO selectVO(@Param("ew") Wrapper<LishidangzhibuEntity> wrapper);
	
	List<LishidangzhibuView> selectListView(@Param("ew") Wrapper<LishidangzhibuEntity> wrapper);

	List<LishidangzhibuView> selectListView(Pagination page,@Param("ew") Wrapper<LishidangzhibuEntity> wrapper);
	
	LishidangzhibuView selectView(@Param("ew") Wrapper<LishidangzhibuEntity> wrapper);
	

}
