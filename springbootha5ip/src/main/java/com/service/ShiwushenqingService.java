package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiwushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiwushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiwushenqingView;


/**
 * 事务申请
 *
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
public interface ShiwushenqingService extends IService<ShiwushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiwushenqingVO> selectListVO(Wrapper<ShiwushenqingEntity> wrapper);
   	
   	ShiwushenqingVO selectVO(@Param("ew") Wrapper<ShiwushenqingEntity> wrapper);
   	
   	List<ShiwushenqingView> selectListView(Wrapper<ShiwushenqingEntity> wrapper);
   	
   	ShiwushenqingView selectView(@Param("ew") Wrapper<ShiwushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiwushenqingEntity> wrapper);
   	

}

