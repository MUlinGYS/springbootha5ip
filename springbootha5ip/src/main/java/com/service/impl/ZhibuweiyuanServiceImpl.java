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


import com.dao.ZhibuweiyuanDao;
import com.entity.ZhibuweiyuanEntity;
import com.service.ZhibuweiyuanService;
import com.entity.vo.ZhibuweiyuanVO;
import com.entity.view.ZhibuweiyuanView;

@Service("zhibuweiyuanService")
public class ZhibuweiyuanServiceImpl extends ServiceImpl<ZhibuweiyuanDao, ZhibuweiyuanEntity> implements ZhibuweiyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhibuweiyuanEntity> page = this.selectPage(
                new Query<ZhibuweiyuanEntity>(params).getPage(),
                new EntityWrapper<ZhibuweiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhibuweiyuanEntity> wrapper) {
		  Page<ZhibuweiyuanView> page =new Query<ZhibuweiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhibuweiyuanVO> selectListVO(Wrapper<ZhibuweiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhibuweiyuanVO selectVO(Wrapper<ZhibuweiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhibuweiyuanView> selectListView(Wrapper<ZhibuweiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhibuweiyuanView selectView(Wrapper<ZhibuweiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
