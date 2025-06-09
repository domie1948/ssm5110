package com.dao;

import com.entity.BanfazhengshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanfazhengshuVO;
import com.entity.view.BanfazhengshuView;


/**
 * 颁发证书
 * 
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
public interface BanfazhengshuDao extends BaseMapper<BanfazhengshuEntity> {
	
	List<BanfazhengshuVO> selectListVO(@Param("ew") Wrapper<BanfazhengshuEntity> wrapper);
	
	BanfazhengshuVO selectVO(@Param("ew") Wrapper<BanfazhengshuEntity> wrapper);
	
	List<BanfazhengshuView> selectListView(@Param("ew") Wrapper<BanfazhengshuEntity> wrapper);

	List<BanfazhengshuView> selectListView(Pagination page,@Param("ew") Wrapper<BanfazhengshuEntity> wrapper);
	
	BanfazhengshuView selectView(@Param("ew") Wrapper<BanfazhengshuEntity> wrapper);
	
}
