package com.dao;

import com.entity.XiangmubaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmubaomingVO;
import com.entity.view.XiangmubaomingView;


/**
 * 项目报名
 * 
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
public interface XiangmubaomingDao extends BaseMapper<XiangmubaomingEntity> {
	
	List<XiangmubaomingVO> selectListVO(@Param("ew") Wrapper<XiangmubaomingEntity> wrapper);
	
	XiangmubaomingVO selectVO(@Param("ew") Wrapper<XiangmubaomingEntity> wrapper);
	
	List<XiangmubaomingView> selectListView(@Param("ew") Wrapper<XiangmubaomingEntity> wrapper);

	List<XiangmubaomingView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmubaomingEntity> wrapper);
	
	XiangmubaomingView selectView(@Param("ew") Wrapper<XiangmubaomingEntity> wrapper);
	
}
