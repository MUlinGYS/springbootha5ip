package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanchushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanchushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanchushenqingView;


/**
 * 转出申请
 *
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
public interface ZhuanchushenqingService extends IService<ZhuanchushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanchushenqingVO> selectListVO(Wrapper<ZhuanchushenqingEntity> wrapper);
   	
   	ZhuanchushenqingVO selectVO(@Param("ew") Wrapper<ZhuanchushenqingEntity> wrapper);
   	
   	List<ZhuanchushenqingView> selectListView(Wrapper<ZhuanchushenqingEntity> wrapper);
   	
   	ZhuanchushenqingView selectView(@Param("ew") Wrapper<ZhuanchushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanchushenqingEntity> wrapper);
   	

}

