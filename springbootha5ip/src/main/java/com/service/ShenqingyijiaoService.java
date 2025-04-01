package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingyijiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingyijiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingyijiaoView;


/**
 * 申请移交
 *
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
public interface ShenqingyijiaoService extends IService<ShenqingyijiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingyijiaoVO> selectListVO(Wrapper<ShenqingyijiaoEntity> wrapper);
   	
   	ShenqingyijiaoVO selectVO(@Param("ew") Wrapper<ShenqingyijiaoEntity> wrapper);
   	
   	List<ShenqingyijiaoView> selectListView(Wrapper<ShenqingyijiaoEntity> wrapper);
   	
   	ShenqingyijiaoView selectView(@Param("ew") Wrapper<ShenqingyijiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingyijiaoEntity> wrapper);
   	

}

