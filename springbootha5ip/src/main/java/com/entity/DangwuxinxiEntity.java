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
 * 团务信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
@TableName("dangwuxinxi")
public class DangwuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DangwuxinxiEntity() {
		
	}
	
	public DangwuxinxiEntity(T t) {
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
	 * 身份
	 */
					
	private String shenfen;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 民族
	 */
					
	private String minzu;
	
	/**
	 * 籍贯
	 */
					
	private String jiguan;
	
	/**
	 * 身份证号
	 */
					
	private String shenfenzhenghao;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 培养联系人
	 */
					
	private String peiyanglianxiren;
	
	/**
	 * 入团介绍人
	 */
					
	private String rudangjieshaoren;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 确定拟发展对象时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date quedingnifazhanduixiangshijian;
	
	/**
	 * 申请入团时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shenqingrudangshijian;
	
	/**
	 * 确定积极分子时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date quedingjijifenzishijian;
	
	/**
	 * 接收为预备团员时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jieshouweiyubeidangyuanshijian;
	
	/**
	 * 转正时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zhuanzhengshijian;
	
	
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
	/**
	 * 设置：身份
	 */
	public void setShenfen(String shenfen) {
		this.shenfen = shenfen;
	}
	/**
	 * 获取：身份
	 */
	public String getShenfen() {
		return shenfen;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：民族
	 */
	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}
	/**
	 * 获取：民族
	 */
	public String getMinzu() {
		return minzu;
	}
	/**
	 * 设置：籍贯
	 */
	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}
	/**
	 * 获取：籍贯
	 */
	public String getJiguan() {
		return jiguan;
	}
	/**
	 * 设置：身份证号
	 */
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：培养联系人
	 */
	public void setPeiyanglianxiren(String peiyanglianxiren) {
		this.peiyanglianxiren = peiyanglianxiren;
	}
	/**
	 * 获取：培养联系人
	 */
	public String getPeiyanglianxiren() {
		return peiyanglianxiren;
	}
	/**
	 * 设置：入团介绍人
	 */
	public void setRudangjieshaoren(String rudangjieshaoren) {
		this.rudangjieshaoren = rudangjieshaoren;
	}
	/**
	 * 获取：入团介绍人
	 */
	public String getRudangjieshaoren() {
		return rudangjieshaoren;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：确定拟发展对象时间
	 */
	public void setQuedingnifazhanduixiangshijian(Date quedingnifazhanduixiangshijian) {
		this.quedingnifazhanduixiangshijian = quedingnifazhanduixiangshijian;
	}
	/**
	 * 获取：确定拟发展对象时间
	 */
	public Date getQuedingnifazhanduixiangshijian() {
		return quedingnifazhanduixiangshijian;
	}
	/**
	 * 设置：申请入团时间
	 */
	public void setShenqingrudangshijian(Date shenqingrudangshijian) {
		this.shenqingrudangshijian = shenqingrudangshijian;
	}
	/**
	 * 获取：申请入团时间
	 */
	public Date getShenqingrudangshijian() {
		return shenqingrudangshijian;
	}
	/**
	 * 设置：确定积极分子时间
	 */
	public void setQuedingjijifenzishijian(Date quedingjijifenzishijian) {
		this.quedingjijifenzishijian = quedingjijifenzishijian;
	}
	/**
	 * 获取：确定积极分子时间
	 */
	public Date getQuedingjijifenzishijian() {
		return quedingjijifenzishijian;
	}
	/**
	 * 设置：接收为预备团员时间
	 */
	public void setJieshouweiyubeidangyuanshijian(Date jieshouweiyubeidangyuanshijian) {
		this.jieshouweiyubeidangyuanshijian = jieshouweiyubeidangyuanshijian;
	}
	/**
	 * 获取：接收为预备团员时间
	 */
	public Date getJieshouweiyubeidangyuanshijian() {
		return jieshouweiyubeidangyuanshijian;
	}
	/**
	 * 设置：转正时间
	 */
	public void setZhuanzhengshijian(Date zhuanzhengshijian) {
		this.zhuanzhengshijian = zhuanzhengshijian;
	}
	/**
	 * 获取：转正时间
	 */
	public Date getZhuanzhengshijian() {
		return zhuanzhengshijian;
	}

}
