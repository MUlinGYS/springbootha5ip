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

import com.entity.DangwuxinxiEntity;
import com.entity.view.DangwuxinxiView;

import com.service.DangwuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.web.multipart.MultipartFile;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 团务信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
@RestController
@RequestMapping("/dangwuxinxi")
public class DangwuxinxiController {
    @Autowired
    private DangwuxinxiService dangwuxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DangwuxinxiEntity dangwuxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhibuweiyuan")) {
			dangwuxinxi.setZhibuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			dangwuxinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DangwuxinxiEntity> ew = new EntityWrapper<DangwuxinxiEntity>();
		PageUtils page = dangwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dangwuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DangwuxinxiEntity dangwuxinxi, 
		HttpServletRequest request){
        EntityWrapper<DangwuxinxiEntity> ew = new EntityWrapper<DangwuxinxiEntity>();
		PageUtils page = dangwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dangwuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DangwuxinxiEntity dangwuxinxi){
       	EntityWrapper<DangwuxinxiEntity> ew = new EntityWrapper<DangwuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dangwuxinxi, "dangwuxinxi")); 
        return R.ok().put("data", dangwuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DangwuxinxiEntity dangwuxinxi){
        EntityWrapper< DangwuxinxiEntity> ew = new EntityWrapper< DangwuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dangwuxinxi, "dangwuxinxi")); 
		DangwuxinxiView dangwuxinxiView =  dangwuxinxiService.selectView(ew);
		return R.ok("查询团务信息成功").put("data", dangwuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DangwuxinxiEntity dangwuxinxi = dangwuxinxiService.selectById(id);
        return R.ok().put("data", dangwuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DangwuxinxiEntity dangwuxinxi = dangwuxinxiService.selectById(id);
        return R.ok().put("data", dangwuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DangwuxinxiEntity dangwuxinxi, HttpServletRequest request){
    	dangwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dangwuxinxi);
        dangwuxinxiService.insert(dangwuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DangwuxinxiEntity dangwuxinxi, HttpServletRequest request){
    	dangwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dangwuxinxi);
        dangwuxinxiService.insert(dangwuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DangwuxinxiEntity dangwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dangwuxinxi);
        dangwuxinxiService.updateById(dangwuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dangwuxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DangwuxinxiEntity> wrapper = new EntityWrapper<DangwuxinxiEntity>();
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

		int count = dangwuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	





    @RequestMapping("/importExcel")
    public R importExcel(@RequestParam("file") MultipartFile file){
        try {
            //获取输入流
            InputStream inputStream = file.getInputStream();
            //创建读取工作簿
            Workbook workbook = WorkbookFactory.create(inputStream);
            //获取工作表
            Sheet sheet = workbook.getSheetAt(0);
            //获取总行
            int rows=sheet.getPhysicalNumberOfRows();
            if(rows>1){
                //获取单元格
                for (int i = 1; i < rows; i++) {
                    Row row = sheet.getRow(i);
                    DangwuxinxiEntity dangwuxinxiEntity =new DangwuxinxiEntity();
                    dangwuxinxiEntity.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
                    String zhibuzhanghao = CommonUtil.getCellValue(row.getCell(0));
                    dangwuxinxiEntity.setZhibuzhanghao(zhibuzhanghao);
                    String zhibumingcheng = CommonUtil.getCellValue(row.getCell(1));
                    dangwuxinxiEntity.setZhibumingcheng(zhibumingcheng);
                    String shenfen = CommonUtil.getCellValue(row.getCell(2));
                    dangwuxinxiEntity.setShenfen(shenfen);
                    String xuehao = CommonUtil.getCellValue(row.getCell(3));
                    dangwuxinxiEntity.setXuehao(xuehao);
                    String xingming = CommonUtil.getCellValue(row.getCell(4));
                    dangwuxinxiEntity.setXingming(xingming);
                    String banji = CommonUtil.getCellValue(row.getCell(5));
                    dangwuxinxiEntity.setBanji(banji);
                    String xingbie = CommonUtil.getCellValue(row.getCell(6));
                    dangwuxinxiEntity.setXingbie(xingbie);
                    String minzu = CommonUtil.getCellValue(row.getCell(7));
                    dangwuxinxiEntity.setMinzu(minzu);
                    String jiguan = CommonUtil.getCellValue(row.getCell(8));
                    dangwuxinxiEntity.setJiguan(jiguan);
                    String shenfenzhenghao = CommonUtil.getCellValue(row.getCell(9));
                    dangwuxinxiEntity.setShenfenzhenghao(shenfenzhenghao);
                    String lianxifangshi = CommonUtil.getCellValue(row.getCell(10));
                    dangwuxinxiEntity.setLianxifangshi(lianxifangshi);
                    String peiyanglianxiren = CommonUtil.getCellValue(row.getCell(11));
                    dangwuxinxiEntity.setPeiyanglianxiren(peiyanglianxiren);
                    String rudangjieshaoren = CommonUtil.getCellValue(row.getCell(12));
                    dangwuxinxiEntity.setRudangjieshaoren(rudangjieshaoren);
                     
                    //想数据库中添加新对象
                    dangwuxinxiService.insert(dangwuxinxiEntity);//方法
                }
            }
            inputStream.close();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return R.ok("导入成功");
    }


}
