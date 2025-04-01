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

import com.entity.ShenqingyijiaoEntity;
import com.entity.view.ShenqingyijiaoView;

import com.service.ShenqingyijiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 申请移交
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
@RestController
@RequestMapping("/shenqingyijiao")
public class ShenqingyijiaoController {
    @Autowired
    private ShenqingyijiaoService shenqingyijiaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenqingyijiaoEntity shenqingyijiao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhibuweiyuan")) {
			shenqingyijiao.setZhibuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			shenqingyijiao.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenqingyijiaoEntity> ew = new EntityWrapper<ShenqingyijiaoEntity>();
		PageUtils page = shenqingyijiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingyijiao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenqingyijiaoEntity shenqingyijiao, 
		HttpServletRequest request){
        EntityWrapper<ShenqingyijiaoEntity> ew = new EntityWrapper<ShenqingyijiaoEntity>();
		PageUtils page = shenqingyijiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingyijiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenqingyijiaoEntity shenqingyijiao){
       	EntityWrapper<ShenqingyijiaoEntity> ew = new EntityWrapper<ShenqingyijiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenqingyijiao, "shenqingyijiao")); 
        return R.ok().put("data", shenqingyijiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenqingyijiaoEntity shenqingyijiao){
        EntityWrapper< ShenqingyijiaoEntity> ew = new EntityWrapper< ShenqingyijiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenqingyijiao, "shenqingyijiao")); 
		ShenqingyijiaoView shenqingyijiaoView =  shenqingyijiaoService.selectView(ew);
		return R.ok("查询申请移交成功").put("data", shenqingyijiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenqingyijiaoEntity shenqingyijiao = shenqingyijiaoService.selectById(id);
        return R.ok().put("data", shenqingyijiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenqingyijiaoEntity shenqingyijiao = shenqingyijiaoService.selectById(id);
        return R.ok().put("data", shenqingyijiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenqingyijiaoEntity shenqingyijiao, HttpServletRequest request){
    	shenqingyijiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenqingyijiao);
        shenqingyijiaoService.insert(shenqingyijiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenqingyijiaoEntity shenqingyijiao, HttpServletRequest request){
    	shenqingyijiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenqingyijiao);
        shenqingyijiaoService.insert(shenqingyijiao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShenqingyijiaoEntity shenqingyijiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenqingyijiao);
        shenqingyijiaoService.updateById(shenqingyijiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenqingyijiaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShenqingyijiaoEntity> wrapper = new EntityWrapper<ShenqingyijiaoEntity>();
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
		if(tableName.equals("yonghu")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = shenqingyijiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
