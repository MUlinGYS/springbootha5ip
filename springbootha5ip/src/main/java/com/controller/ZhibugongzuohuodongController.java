package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhibugongzuohuodongEntity;
import com.entity.view.ZhibugongzuohuodongView;

import com.service.ZhibugongzuohuodongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 支部工作活动
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
@RestController
@RequestMapping("/zhibugongzuohuodong")
public class ZhibugongzuohuodongController {
    @Autowired
    private ZhibugongzuohuodongService zhibugongzuohuodongService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhibugongzuohuodongEntity zhibugongzuohuodong,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhibuweiyuan")) {
			zhibugongzuohuodong.setZhibuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhibugongzuohuodongEntity> ew = new EntityWrapper<ZhibugongzuohuodongEntity>();
		PageUtils page = zhibugongzuohuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhibugongzuohuodong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhibugongzuohuodongEntity zhibugongzuohuodong, 
		HttpServletRequest request){
        EntityWrapper<ZhibugongzuohuodongEntity> ew = new EntityWrapper<ZhibugongzuohuodongEntity>();
		PageUtils page = zhibugongzuohuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhibugongzuohuodong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhibugongzuohuodongEntity zhibugongzuohuodong){
       	EntityWrapper<ZhibugongzuohuodongEntity> ew = new EntityWrapper<ZhibugongzuohuodongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhibugongzuohuodong, "zhibugongzuohuodong")); 
        return R.ok().put("data", zhibugongzuohuodongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhibugongzuohuodongEntity zhibugongzuohuodong){
        EntityWrapper< ZhibugongzuohuodongEntity> ew = new EntityWrapper< ZhibugongzuohuodongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhibugongzuohuodong, "zhibugongzuohuodong")); 
		ZhibugongzuohuodongView zhibugongzuohuodongView =  zhibugongzuohuodongService.selectView(ew);
		return R.ok("查询支部工作活动成功").put("data", zhibugongzuohuodongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhibugongzuohuodongEntity zhibugongzuohuodong = zhibugongzuohuodongService.selectById(id);
        return R.ok().put("data", zhibugongzuohuodong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhibugongzuohuodongEntity zhibugongzuohuodong = zhibugongzuohuodongService.selectById(id);
        return R.ok().put("data", zhibugongzuohuodong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhibugongzuohuodongEntity zhibugongzuohuodong, HttpServletRequest request){
    	zhibugongzuohuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhibugongzuohuodong);
        zhibugongzuohuodongService.insert(zhibugongzuohuodong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhibugongzuohuodongEntity zhibugongzuohuodong, HttpServletRequest request){
    	zhibugongzuohuodong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhibugongzuohuodong);
        zhibugongzuohuodongService.insert(zhibugongzuohuodong);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhibugongzuohuodongEntity zhibugongzuohuodong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhibugongzuohuodong);
        zhibugongzuohuodongService.updateById(zhibugongzuohuodong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhibugongzuohuodongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhibugongzuohuodongEntity> wrapper = new EntityWrapper<ZhibugongzuohuodongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhibuweiyuan")) {
			wrapper.eq("zhibuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhibugongzuohuodongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
