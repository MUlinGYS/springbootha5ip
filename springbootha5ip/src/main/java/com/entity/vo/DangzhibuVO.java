package com.entity.vo;

import com.entity.DangzhibuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 团支部
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
public class DangzhibuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 支部成立时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhibuchenglishijian;
		
	/**
	 * 支部介绍
	 */
	
	private String zhibujieshao;
				
	
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
