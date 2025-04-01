package com.entity.view;

import com.entity.LishidangzhibuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 历史团支部
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
@TableName("lishidangzhibu")
public class LishidangzhibuView  extends LishidangzhibuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LishidangzhibuView(){
	}
 
 	public LishidangzhibuView(LishidangzhibuEntity lishidangzhibuEntity){
 	try {
			BeanUtils.copyProperties(this, lishidangzhibuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
