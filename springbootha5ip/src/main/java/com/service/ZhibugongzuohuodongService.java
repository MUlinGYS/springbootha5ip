package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhibugongzuohuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhibugongzuohuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhibugongzuohuodongView;


/**
 * 支部工作活动
 *
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
public interface ZhibugongzuohuodongService extends IService<ZhibugongzuohuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhibugongzuohuodongVO> selectListVO(Wrapper<ZhibugongzuohuodongEntity> wrapper);
   	
   	ZhibugongzuohuodongVO selectVO(@Param("ew") Wrapper<ZhibugongzuohuodongEntity> wrapper);
   	
   	List<ZhibugongzuohuodongView> selectListView(Wrapper<ZhibugongzuohuodongEntity> wrapper);
   	
   	ZhibugongzuohuodongView selectView(@Param("ew") Wrapper<ZhibugongzuohuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhibugongzuohuodongEntity> wrapper);
   	

}

