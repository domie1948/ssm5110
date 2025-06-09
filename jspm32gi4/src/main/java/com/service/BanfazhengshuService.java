package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanfazhengshuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanfazhengshuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanfazhengshuView;


/**
 * 颁发证书
 *
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
public interface BanfazhengshuService extends IService<BanfazhengshuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanfazhengshuVO> selectListVO(Wrapper<BanfazhengshuEntity> wrapper);
   	
   	BanfazhengshuVO selectVO(@Param("ew") Wrapper<BanfazhengshuEntity> wrapper);
   	
   	List<BanfazhengshuView> selectListView(Wrapper<BanfazhengshuEntity> wrapper);
   	
   	BanfazhengshuView selectView(@Param("ew") Wrapper<BanfazhengshuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanfazhengshuEntity> wrapper);
   	
}

