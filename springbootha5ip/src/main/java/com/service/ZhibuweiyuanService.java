package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhibuweiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhibuweiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhibuweiyuanView;


/**
 * 支部委员
 *
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
public interface ZhibuweiyuanService extends IService<ZhibuweiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhibuweiyuanVO> selectListVO(Wrapper<ZhibuweiyuanEntity> wrapper);
   	
   	ZhibuweiyuanVO selectVO(@Param("ew") Wrapper<ZhibuweiyuanEntity> wrapper);
   	
   	List<ZhibuweiyuanView> selectListView(Wrapper<ZhibuweiyuanEntity> wrapper);
   	
   	ZhibuweiyuanView selectView(@Param("ew") Wrapper<ZhibuweiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhibuweiyuanEntity> wrapper);
   	

}

