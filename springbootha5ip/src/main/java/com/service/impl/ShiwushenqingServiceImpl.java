package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShiwushenqingDao;
import com.entity.ShiwushenqingEntity;
import com.service.ShiwushenqingService;
import com.entity.vo.ShiwushenqingVO;
import com.entity.view.ShiwushenqingView;

@Service("shiwushenqingService")
public class ShiwushenqingServiceImpl extends ServiceImpl<ShiwushenqingDao, ShiwushenqingEntity> implements ShiwushenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiwushenqingEntity> page = this.selectPage(
                new Query<ShiwushenqingEntity>(params).getPage(),
                new EntityWrapper<ShiwushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiwushenqingEntity> wrapper) {
		  Page<ShiwushenqingView> page =new Query<ShiwushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiwushenqingVO> selectListVO(Wrapper<ShiwushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiwushenqingVO selectVO(Wrapper<ShiwushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiwushenqingView> selectListView(Wrapper<ShiwushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiwushenqingView selectView(Wrapper<ShiwushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
