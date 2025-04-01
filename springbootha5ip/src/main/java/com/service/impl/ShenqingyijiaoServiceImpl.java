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


import com.dao.ShenqingyijiaoDao;
import com.entity.ShenqingyijiaoEntity;
import com.service.ShenqingyijiaoService;
import com.entity.vo.ShenqingyijiaoVO;
import com.entity.view.ShenqingyijiaoView;

@Service("shenqingyijiaoService")
public class ShenqingyijiaoServiceImpl extends ServiceImpl<ShenqingyijiaoDao, ShenqingyijiaoEntity> implements ShenqingyijiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingyijiaoEntity> page = this.selectPage(
                new Query<ShenqingyijiaoEntity>(params).getPage(),
                new EntityWrapper<ShenqingyijiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingyijiaoEntity> wrapper) {
		  Page<ShenqingyijiaoView> page =new Query<ShenqingyijiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingyijiaoVO> selectListVO(Wrapper<ShenqingyijiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingyijiaoVO selectVO(Wrapper<ShenqingyijiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingyijiaoView> selectListView(Wrapper<ShenqingyijiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingyijiaoView selectView(Wrapper<ShenqingyijiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
