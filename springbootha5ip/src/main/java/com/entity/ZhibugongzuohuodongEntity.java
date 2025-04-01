package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 支部工作活动
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
@TableName("zhibugongzuohuodong")
public class ZhibugongzuohuodongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhibugongzuohuodongEntity() {
		
	}
	
	public ZhibugongzuohuodongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 工作活动主题
	 */
					
	private String gongzuohuodongzhuti;
	
	/**
	 * 工作活动时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：工作活动主题
	 */
	public void setGongzuohuodongzhuti(String gongzuohuodongzhuti) {
		this.gongzuohuodongzhuti = gongzuohuodongzhuti;
	}
	/**
	 * 获取：工作活动主题
	 */
	public String getGongzuohuodongzhuti() {
		return gongzuohuodongzhuti;
	}
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
