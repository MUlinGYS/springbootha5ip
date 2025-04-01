package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LishidangzhibuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LishidangzhibuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LishidangzhibuView;


/**
 * 历史团支部
 *
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
public interface LishidangzhibuService extends IService<LishidangzhibuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LishidangzhibuVO> selectListVO(Wrapper<LishidangzhibuEntity> wrapper);
   	
   	LishidangzhibuVO selectVO(@Param("ew") Wrapper<LishidangzhibuEntity> wrapper);
   	
   	List<LishidangzhibuView> selectListView(Wrapper<LishidangzhibuEntity> wrapper);
   	
   	LishidangzhibuView selectView(@Param("ew") Wrapper<LishidangzhibuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LishidangzhibuEntity> wrapper);
   	

}

