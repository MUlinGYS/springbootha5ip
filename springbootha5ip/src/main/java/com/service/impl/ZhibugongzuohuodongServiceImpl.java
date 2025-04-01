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


import com.dao.ZhibugongzuohuodongDao;
import com.entity.ZhibugongzuohuodongEntity;
import com.service.ZhibugongzuohuodongService;
import com.entity.vo.ZhibugongzuohuodongVO;
import com.entity.view.ZhibugongzuohuodongView;

@Service("zhibugongzuohuodongService")
public class ZhibugongzuohuodongServiceImpl extends ServiceImpl<ZhibugongzuohuodongDao, ZhibugongzuohuodongEntity> implements ZhibugongzuohuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhibugongzuohuodongEntity> page = this.selectPage(
                new Query<ZhibugongzuohuodongEntity>(params).getPage(),
                new EntityWrapper<ZhibugongzuohuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhibugongzuohuodongEntity> wrapper) {
		  Page<ZhibugongzuohuodongView> page =new Query<ZhibugongzuohuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhibugongzuohuodongVO> selectListVO(Wrapper<ZhibugongzuohuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhibugongzuohuodongVO selectVO(Wrapper<ZhibugongzuohuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhibugongzuohuodongView> selectListView(Wrapper<ZhibugongzuohuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhibugongzuohuodongView selectView(Wrapper<ZhibugongzuohuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
