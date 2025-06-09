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
 * 比赛成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
@TableName("bisaichengji")
public class BisaichengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BisaichengjiEntity() {
		
	}
	
	public BisaichengjiEntity(T t) {
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
	 * 赛程编号
	 */
					
	private String saichengbianhao;
	
	/**
	 * 项目编号
	 */
					
	private String xiangmubianhao;
	
	/**
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
	/**
	 * 比赛结果
	 */
					
	private String bisaijieguo;
	
	/**
	 * 裁判员账号
	 */
					
	private String caipanyuanzhanghao;
	
	/**
	 * 裁判员姓名
	 */
					
	private String caipanyuanxingming;
	
	
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
	 * 设置：赛程编号
	 */
	public void setSaichengbianhao(String saichengbianhao) {
		this.saichengbianhao = saichengbianhao;
	}
	/**
	 * 获取：赛程编号
	 */
	public String getSaichengbianhao() {
		return saichengbianhao;
	}
	/**
	 * 设置：项目编号
	 */
	public void setXiangmubianhao(String xiangmubianhao) {
		this.xiangmubianhao = xiangmubianhao;
	}
	/**
	 * 获取：项目编号
	 */
	public String getXiangmubianhao() {
		return xiangmubianhao;
	}
	/**
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
	/**
	 * 设置：比赛结果
	 */
	public void setBisaijieguo(String bisaijieguo) {
		this.bisaijieguo = bisaijieguo;
	}
	/**
	 * 获取：比赛结果
	 */
	public String getBisaijieguo() {
		return bisaijieguo;
	}
	/**
	 * 设置：裁判员账号
	 */
	public void setCaipanyuanzhanghao(String caipanyuanzhanghao) {
		this.caipanyuanzhanghao = caipanyuanzhanghao;
	}
	/**
	 * 获取：裁判员账号
	 */
	public String getCaipanyuanzhanghao() {
		return caipanyuanzhanghao;
	}
	/**
	 * 设置：裁判员姓名
	 */
	public void setCaipanyuanxingming(String caipanyuanxingming) {
		this.caipanyuanxingming = caipanyuanxingming;
	}
	/**
	 * 获取：裁判员姓名
	 */
	public String getCaipanyuanxingming() {
		return caipanyuanxingming;
	}

}
