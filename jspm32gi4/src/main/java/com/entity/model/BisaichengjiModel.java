package com.entity.model;

import com.entity.BisaichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 比赛成绩
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
public class BisaichengjiModel  implements Serializable {
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
