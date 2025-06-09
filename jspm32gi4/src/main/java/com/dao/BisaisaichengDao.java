package com.dao;

import com.entity.BisaisaichengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BisaisaichengVO;
import com.entity.view.BisaisaichengView;


/**
 * 比赛赛程
 * 
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
public interface BisaisaichengDao extends BaseMapper<BisaisaichengEntity> {
	
	List<BisaisaichengVO> selectListVO(@Param("ew") Wrapper<BisaisaichengEntity> wrapper);
	
	BisaisaichengVO selectVO(@Param("ew") Wrapper<BisaisaichengEntity> wrapper);
	
	List<BisaisaichengView> selectListView(@Param("ew") Wrapper<BisaisaichengEntity> wrapper);

	List<BisaisaichengView> selectListView(Pagination page,@Param("ew") Wrapper<BisaisaichengEntity> wrapper);
	
	BisaisaichengView selectView(@Param("ew") Wrapper<BisaisaichengEntity> wrapper);
	
}
