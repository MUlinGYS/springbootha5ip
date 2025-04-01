package com.entity.view;

import com.entity.DangwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 团务信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
@TableName("dangwuxinxi")
public class DangwuxinxiView  extends DangwuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangwuxinxiView(){
	}
 
 	public DangwuxinxiView(DangwuxinxiEntity dangwuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, dangwuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
