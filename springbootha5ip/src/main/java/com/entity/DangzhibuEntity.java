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
 * 团支部
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
@TableName("dangzhibu")
public class DangzhibuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DangzhibuEntity() {
		
	}
	
	public DangzhibuEntity(T t) {
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
	 * 支部名称
	 */
					
	private String zhibumingcheng;
	
	/**
	 * 支部成立时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zhibuchenglishijian;
	
	/**
	 * 支部介绍
	 */
					
	private String zhibujieshao;
	
	
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
	 * 设置：支部成立时间
	 */
	public void setZhibuchenglishijian(Date zhibuchenglishijian) {
		this.zhibuchenglishijian = zhibuchenglishijian;
	}
	/**
	 * 获取：支部成立时间
	 */
	public Date getZhibuchenglishijian() {
		return zhibuchenglishijian;
	}
	/**
	 * 设置：支部介绍
	 */
	public void setZhibujieshao(String zhibujieshao) {
		this.zhibujieshao = zhibujieshao;
	}
	/**
	 * 获取：支部介绍
	 */
	public String getZhibujieshao() {
		return zhibujieshao;
	}

}
