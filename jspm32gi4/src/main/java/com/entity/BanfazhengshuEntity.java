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
 * 颁发证书
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
@TableName("banfazhengshu")
public class BanfazhengshuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BanfazhengshuEntity() {
		
	}
	
	public BanfazhengshuEntity(T t) {
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
	 * 证书名称
	 */
					
	private String zhengshumingcheng;
	
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
	 * 设置：证书名称
	 */
	public void setZhengshumingcheng(String zhengshumingcheng) {
		this.zhengshumingcheng = zhengshumingcheng;
	}
	/**
	 * 获取：证书名称
	 */
	public String getZhengshumingcheng() {
		return zhengshumingcheng;
	}
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
