package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangwuxinxiView;


/**
 * 团务信息
 *
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
public interface DangwuxinxiService extends IService<DangwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangwuxinxiVO> selectListVO(Wrapper<DangwuxinxiEntity> wrapper);
   	
   	DangwuxinxiVO selectVO(@Param("ew") Wrapper<DangwuxinxiEntity> wrapper);
   	
   	List<DangwuxinxiView> selectListView(Wrapper<DangwuxinxiEntity> wrapper);
   	
   	DangwuxinxiView selectView(@Param("ew") Wrapper<DangwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangwuxinxiEntity> wrapper);
   	

}

