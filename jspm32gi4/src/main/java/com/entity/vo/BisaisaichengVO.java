package com.entity.vo;

import com.entity.BisaisaichengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 比赛赛程
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
public class BisaisaichengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目编号
	 */
	
	private String xiangmubianhao;
		
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 比赛日期
	 */
	
	private String bisairiqi;
		
	/**
	 * 比赛地点
	 */
	
	private String bisaididian;
		
	/**
	 * 赛程安排
	 */
	
	private String saichenganpai;
		
	/**
	 * 附件
	 */
	
	private String fujian;
				
	
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
	 * 设置：比赛日期
	 */
	 
	public void setBisairiqi(String bisairiqi) {
		this.bisairiqi = bisairiqi;
	}
	
	/**
	 * 获取：比赛日期
	 */
	public String getBisairiqi() {
		return bisairiqi;
	}
				
	
	/**
	 * 设置：比赛地点
	 */
	 
	public void setBisaididian(String bisaididian) {
		this.bisaididian = bisaididian;
	}
	
	/**
	 * 获取：比赛地点
	 */
	public String getBisaididian() {
		return bisaididian;
	}
				
	
	/**
	 * 设置：赛程安排
	 */
	 
	public void setSaichenganpai(String saichenganpai) {
		this.saichenganpai = saichenganpai;
	}
	
	/**
	 * 获取：赛程安排
	 */
	public String getSaichenganpai() {
		return saichenganpai;
	}
				
	
	/**
	 * 设置：附件
	 */
	 
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	
	/**
	 * 获取：附件
	 */
	public String getFujian() {
		return fujian;
	}
			
}
