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


import com.dao.LishidangyuanDao;
import com.entity.LishidangyuanEntity;
import com.service.LishidangyuanService;
import com.entity.vo.LishidangyuanVO;
import com.entity.view.LishidangyuanView;

@Service("lishidangyuanService")
public class LishidangyuanServiceImpl extends ServiceImpl<LishidangyuanDao, LishidangyuanEntity> implements LishidangyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LishidangyuanEntity> page = this.selectPage(
                new Query<LishidangyuanEntity>(params).getPage(),
                new EntityWrapper<LishidangyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LishidangyuanEntity> wrapper) {
		  Page<LishidangyuanView> page =new Query<LishidangyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LishidangyuanVO> selectListVO(Wrapper<LishidangyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LishidangyuanVO selectVO(Wrapper<LishidangyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LishidangyuanView> selectListView(Wrapper<LishidangyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LishidangyuanView selectView(Wrapper<LishidangyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
