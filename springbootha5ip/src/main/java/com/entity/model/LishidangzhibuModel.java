package com.entity.model;

import com.entity.LishidangzhibuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 历史团支部
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
public class LishidangzhibuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 支部成立时间
	 */
	
	private String zhibuchenglishijian;
		
	/**
	 * 解散时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
