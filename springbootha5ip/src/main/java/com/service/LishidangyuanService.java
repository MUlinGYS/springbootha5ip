package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LishidangyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LishidangyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LishidangyuanView;


/**
 * 历史团员
 *
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
public interface LishidangyuanService extends IService<LishidangyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LishidangyuanVO> selectListVO(Wrapper<LishidangyuanEntity> wrapper);
   	
   	LishidangyuanVO selectVO(@Param("ew") Wrapper<LishidangyuanEntity> wrapper);
   	
   	List<LishidangyuanView> selectListView(Wrapper<LishidangyuanEntity> wrapper);
   	
   	LishidangyuanView selectView(@Param("ew") Wrapper<LishidangyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LishidangyuanEntity> wrapper);
   	

}

