package com.dao;

import com.entity.ZhibuweiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhibuweiyuanVO;
import com.entity.view.ZhibuweiyuanView;


/**
 * 支部委员
 * 
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
public interface ZhibuweiyuanDao extends BaseMapper<ZhibuweiyuanEntity> {
	
	List<ZhibuweiyuanVO> selectListVO(@Param("ew") Wrapper<ZhibuweiyuanEntity> wrapper);
	
	ZhibuweiyuanVO selectVO(@Param("ew") Wrapper<ZhibuweiyuanEntity> wrapper);
	
	List<ZhibuweiyuanView> selectListView(@Param("ew") Wrapper<ZhibuweiyuanEntity> wrapper);

	List<ZhibuweiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ZhibuweiyuanEntity> wrapper);
	
	ZhibuweiyuanView selectView(@Param("ew") Wrapper<ZhibuweiyuanEntity> wrapper);
	

}
