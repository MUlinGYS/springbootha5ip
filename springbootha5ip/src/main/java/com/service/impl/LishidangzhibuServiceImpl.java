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


import com.dao.LishidangzhibuDao;
import com.entity.LishidangzhibuEntity;
import com.service.LishidangzhibuService;
import com.entity.vo.LishidangzhibuVO;
import com.entity.view.LishidangzhibuView;

@Service("lishidangzhibuService")
public class LishidangzhibuServiceImpl extends ServiceImpl<LishidangzhibuDao, LishidangzhibuEntity> implements LishidangzhibuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LishidangzhibuEntity> page = this.selectPage(
                new Query<LishidangzhibuEntity>(params).getPage(),
                new EntityWrapper<LishidangzhibuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LishidangzhibuEntity> wrapper) {
		  Page<LishidangzhibuView> page =new Query<LishidangzhibuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LishidangzhibuVO> selectListVO(Wrapper<LishidangzhibuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LishidangzhibuVO selectVO(Wrapper<LishidangzhibuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LishidangzhibuView> selectListView(Wrapper<LishidangzhibuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LishidangzhibuView selectView(Wrapper<LishidangzhibuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
