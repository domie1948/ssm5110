package com.entity.view;

import com.entity.XiangmubaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目报名
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
@TableName("xiangmubaoming")
public class XiangmubaomingView  extends XiangmubaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmubaomingView(){
	}
 
 	public XiangmubaomingView(XiangmubaomingEntity xiangmubaomingEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmubaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
