package com.entity.view;

import com.entity.LishidangyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 历史团员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
@TableName("lishidangyuan")
public class LishidangyuanView  extends LishidangyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LishidangyuanView(){
	}
 
 	public LishidangyuanView(LishidangyuanEntity lishidangyuanEntity){
 	try {
			BeanUtils.copyProperties(this, lishidangyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
