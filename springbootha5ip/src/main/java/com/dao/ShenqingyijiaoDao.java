package com.dao;

import com.entity.ShenqingyijiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingyijiaoVO;
import com.entity.view.ShenqingyijiaoView;


/**
 * 申请移交
 * 
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
public interface ShenqingyijiaoDao extends BaseMapper<ShenqingyijiaoEntity> {
	
	List<ShenqingyijiaoVO> selectListVO(@Param("ew") Wrapper<ShenqingyijiaoEntity> wrapper);
	
	ShenqingyijiaoVO selectVO(@Param("ew") Wrapper<ShenqingyijiaoEntity> wrapper);
	
	List<ShenqingyijiaoView> selectListView(@Param("ew") Wrapper<ShenqingyijiaoEntity> wrapper);

	List<ShenqingyijiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingyijiaoEntity> wrapper);
	
	ShenqingyijiaoView selectView(@Param("ew") Wrapper<ShenqingyijiaoEntity> wrapper);
	

}
