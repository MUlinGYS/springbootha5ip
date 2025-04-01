package com.entity.view;

import com.entity.ZhibuweiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 支部委员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-06 14:09:46
 */
@TableName("zhibuweiyuan")
public class ZhibuweiyuanView  extends ZhibuweiyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhibuweiyuanView(){
	}
 
 	public ZhibuweiyuanView(ZhibuweiyuanEntity zhibuweiyuanEntity){
 	try {
			BeanUtils.copyProperties(this, zhibuweiyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
