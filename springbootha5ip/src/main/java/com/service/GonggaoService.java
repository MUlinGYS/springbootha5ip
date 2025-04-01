package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GonggaoView;


/**
 * 公告
 *
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
public interface GonggaoService extends IService<GonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GonggaoVO> selectListVO(Wrapper<GonggaoEntity> wrapper);
   	
   	GonggaoVO selectVO(@Param("ew") Wrapper<GonggaoEntity> wrapper);
   	
   	List<GonggaoView> selectListView(Wrapper<GonggaoEntity> wrapper);
   	
   	GonggaoView selectView(@Param("ew") Wrapper<GonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GonggaoEntity> wrapper);
   	

}

