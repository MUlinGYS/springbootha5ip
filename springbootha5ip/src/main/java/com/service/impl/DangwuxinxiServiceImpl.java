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


import com.dao.DangwuxinxiDao;
import com.entity.DangwuxinxiEntity;
import com.service.DangwuxinxiService;
import com.entity.vo.DangwuxinxiVO;
import com.entity.view.DangwuxinxiView;

@Service("dangwuxinxiService")
public class DangwuxinxiServiceImpl extends ServiceImpl<DangwuxinxiDao, DangwuxinxiEntity> implements DangwuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangwuxinxiEntity> page = this.selectPage(
                new Query<DangwuxinxiEntity>(params).getPage(),
                new EntityWrapper<DangwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangwuxinxiEntity> wrapper) {
		  Page<DangwuxinxiView> page =new Query<DangwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangwuxinxiVO> selectListVO(Wrapper<DangwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangwuxinxiVO selectVO(Wrapper<DangwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangwuxinxiView> selectListView(Wrapper<DangwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangwuxinxiView selectView(Wrapper<DangwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
