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


import com.dao.ZhuanchushenqingDao;
import com.entity.ZhuanchushenqingEntity;
import com.service.ZhuanchushenqingService;
import com.entity.vo.ZhuanchushenqingVO;
import com.entity.view.ZhuanchushenqingView;

@Service("zhuanchushenqingService")
public class ZhuanchushenqingServiceImpl extends ServiceImpl<ZhuanchushenqingDao, ZhuanchushenqingEntity> implements ZhuanchushenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanchushenqingEntity> page = this.selectPage(
                new Query<ZhuanchushenqingEntity>(params).getPage(),
                new EntityWrapper<ZhuanchushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanchushenqingEntity> wrapper) {
		  Page<ZhuanchushenqingView> page =new Query<ZhuanchushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanchushenqingVO> selectListVO(Wrapper<ZhuanchushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanchushenqingVO selectVO(Wrapper<ZhuanchushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanchushenqingView> selectListView(Wrapper<ZhuanchushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanchushenqingView selectView(Wrapper<ZhuanchushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
