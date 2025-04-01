package com.dao;

import com.entity.ZhibugongzuohuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhibugongzuohuodongVO;
import com.entity.view.ZhibugongzuohuodongView;


/**
 * 支部工作活动
 * 
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
public interface ZhibugongzuohuodongDao extends BaseMapper<ZhibugongzuohuodongEntity> {
	
	List<ZhibugongzuohuodongVO> selectListVO(@Param("ew") Wrapper<ZhibugongzuohuodongEntity> wrapper);
	
	ZhibugongzuohuodongVO selectVO(@Param("ew") Wrapper<ZhibugongzuohuodongEntity> wrapper);
	
	List<ZhibugongzuohuodongView> selectListView(@Param("ew") Wrapper<ZhibugongzuohuodongEntity> wrapper);

	List<ZhibugongzuohuodongView> selectListView(Pagination page,@Param("ew") Wrapper<ZhibugongzuohuodongEntity> wrapper);
	
	ZhibugongzuohuodongView selectView(@Param("ew") Wrapper<ZhibugongzuohuodongEntity> wrapper);
	

}
