package com.entity.model;

import com.entity.BanfazhengshuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 颁发证书
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
public class BanfazhengshuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 颁发时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date banfashijian;
		
	/**
	 * 说明
	 */
	
	private String shuoming;
		
	/**
	 * 运动员账号
	 */
	
	private String yundongyuanzhanghao;
		
	/**
	 * 运动员姓名
	 */
	
	private String yundongyuanxingming;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：颁发时间
	 */
	 
	public void setBanfashijian(Date banfashijian) {
		this.banfashijian = banfashijian;
	}
	
	/**
	 * 获取：颁发时间
	 */
	public Date getBanfashijian() {
		return banfashijian;
	}
				
	
	/**
	 * 设置：说明
	 */
	 
	public void setShuoming(String shuoming) {
		this.shuoming = shuoming;
	}
	
	/**
	 * 获取：说明
	 */
	public String getShuoming() {
		return shuoming;
	}
				
	
	/**
	 * 设置：运动员账号
	 */
	 
	public void setYundongyuanzhanghao(String yundongyuanzhanghao) {
		this.yundongyuanzhanghao = yundongyuanzhanghao;
	}
	
	/**
	 * 获取：运动员账号
	 */
	public String getYundongyuanzhanghao() {
		return yundongyuanzhanghao;
	}
				
	
	/**
	 * 设置：运动员姓名
	 */
	 
	public void setYundongyuanxingming(String yundongyuanxingming) {
		this.yundongyuanxingming = yundongyuanxingming;
	}
	
	/**
	 * 获取：运动员姓名
	 */
	public String getYundongyuanxingming() {
		return yundongyuanxingming;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
			
}
