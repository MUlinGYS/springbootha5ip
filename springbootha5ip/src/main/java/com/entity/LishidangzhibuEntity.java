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
 * 历史团支部
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
@TableName("lishidangzhibu")
public class LishidangzhibuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LishidangzhibuEntity() {
		
	}
	
	public LishidangzhibuEntity(T t) {
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
					
	private String zhibuchenglishijian;
	
	/**
	 * 解散时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiesanshijian;
	
	/**
	 * 支部介绍
	 */
					
	private String zhibujieshao;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	
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
	public void setZhibuchenglishijian(String zhibuchenglishijian) {
		this.zhibuchenglishijian = zhibuchenglishijian;
	}
	/**
	 * 获取：支部成立时间
	 */
	public String getZhibuchenglishijian() {
		return zhibuchenglishijian;
	}
	/**
	 * 设置：解散时间
	 */
	public void setJiesanshijian(Date jiesanshijian) {
		this.jiesanshijian = jiesanshijian;
	}
	/**
	 * 获取：解散时间
	 */
	public Date getJiesanshijian() {
		return jiesanshijian;
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
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}

}
