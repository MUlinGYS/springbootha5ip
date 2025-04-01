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

import com.entity.LishidangyuanEntity;
import com.entity.view.LishidangyuanView;

import com.service.LishidangyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 历史团员
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
@RestController
@RequestMapping("/lishidangyuan")
public class LishidangyuanController {
    @Autowired
    private LishidangyuanService lishidangyuanService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LishidangyuanEntity lishidangyuan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			lishidangyuan.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhibuweiyuan")) {
			lishidangyuan.setZhibuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LishidangyuanEntity> ew = new EntityWrapper<LishidangyuanEntity>();
		PageUtils page = lishidangyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lishidangyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LishidangyuanEntity lishidangyuan, 
		HttpServletRequest request){
        EntityWrapper<LishidangyuanEntity> ew = new EntityWrapper<LishidangyuanEntity>();
		PageUtils page = lishidangyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lishidangyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LishidangyuanEntity lishidangyuan){
       	EntityWrapper<LishidangyuanEntity> ew = new EntityWrapper<LishidangyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lishidangyuan, "lishidangyuan")); 
        return R.ok().put("data", lishidangyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LishidangyuanEntity lishidangyuan){
        EntityWrapper< LishidangyuanEntity> ew = new EntityWrapper< LishidangyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lishidangyuan, "lishidangyuan")); 
		LishidangyuanView lishidangyuanView =  lishidangyuanService.selectView(ew);
		return R.ok("查询历史团员成功").put("data", lishidangyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LishidangyuanEntity lishidangyuan = lishidangyuanService.selectById(id);
        return R.ok().put("data", lishidangyuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LishidangyuanEntity lishidangyuan = lishidangyuanService.selectById(id);
        return R.ok().put("data", lishidangyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LishidangyuanEntity lishidangyuan, HttpServletRequest request){
    	lishidangyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lishidangyuan);
        lishidangyuanService.insert(lishidangyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LishidangyuanEntity lishidangyuan, HttpServletRequest request){
    	lishidangyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lishidangyuan);
        lishidangyuanService.insert(lishidangyuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LishidangyuanEntity lishidangyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lishidangyuan);
        lishidangyuanService.updateById(lishidangyuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lishidangyuanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<LishidangyuanEntity> wrapper = new EntityWrapper<LishidangyuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhibuweiyuan")) {
			wrapper.eq("zhibuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = lishidangyuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
