package com.entity.vo;

import com.entity.ZhibugongzuohuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 支部工作活动
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
public class ZhibugongzuohuodongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工作活动时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gongzuohuodongshijian;
		
	/**
	 * 主持人
	 */
	
	private String zhuchiren;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 附件
	 */
	
	private String fujian;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 支部账号
	 */
	
	private String zhibuzhanghao;
		
	/**
	 * 委员姓名
	 */
	
	private String weiyuanxingming;
		
	/**
	 * 支部名称
	 */
	
	private String zhibumingcheng;
				
	
	/**
	 * 设置：工作活动时间
	 */
	 
	public void setGongzuohuodongshijian(Date gongzuohuodongshijian) {
		this.gongzuohuodongshijian = gongzuohuodongshijian;
	}
	
	/**
	 * 获取：工作活动时间
	 */
	public Date getGongzuohuodongshijian() {
		return gongzuohuodongshijian;
	}
				
	
	/**
	 * 设置：主持人
	 */
	 
	public void setZhuchiren(String zhuchiren) {
		this.zhuchiren = zhuchiren;
	}
	
	/**
	 * 获取：主持人
	 */
	public String getZhuchiren() {
		return zhuchiren;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：附件
	 */
	 
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	
	/**
	 * 获取：附件
	 */
	public String getFujian() {
		return fujian;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：支部账号
	 */
	 
	public void setZhibuzhanghao(String zhibuzhanghao) {
		this.zhibuzhanghao = zhibuzhanghao;
	}
	
	/**
	 * 获取：支部账号
	 */
	public String getZhibuzhanghao() {
		return zhibuzhanghao;
	}
				
	
	/**
	 * 设置：委员姓名
	 */
	 
	public void setWeiyuanxingming(String weiyuanxingming) {
		this.weiyuanxingming = weiyuanxingming;
	}
	
	/**
	 * 获取：委员姓名
	 */
	public String getWeiyuanxingming() {
		return weiyuanxingming;
	}
				
	
	/**
	 * 设置：支部名称
	 */
	 
	public void setZhibumingcheng(String zhibumingcheng) {
		this.zhibumingcheng = zhibumingcheng;
	}
	
	/**
	 * 获取：支部名称
	 */
	public String getZhibumingcheng() {
		return zhibumingcheng;
	}
			
}
