package com.entity.view;

import com.entity.ZhibugongzuohuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 支部工作活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-06 14:09:47
 */
@TableName("zhibugongzuohuodong")
public class ZhibugongzuohuodongView  extends ZhibugongzuohuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhibugongzuohuodongView(){
	}
 
 	public ZhibugongzuohuodongView(ZhibugongzuohuodongEntity zhibugongzuohuodongEntity){
 	try {
			BeanUtils.copyProperties(this, zhibugongzuohuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
