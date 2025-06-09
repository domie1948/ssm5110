package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmubaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmubaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmubaomingView;


/**
 * 项目报名
 *
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
public interface XiangmubaomingService extends IService<XiangmubaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmubaomingVO> selectListVO(Wrapper<XiangmubaomingEntity> wrapper);
   	
   	XiangmubaomingVO selectVO(@Param("ew") Wrapper<XiangmubaomingEntity> wrapper);
   	
   	List<XiangmubaomingView> selectListView(Wrapper<XiangmubaomingEntity> wrapper);
   	
   	XiangmubaomingView selectView(@Param("ew") Wrapper<XiangmubaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmubaomingEntity> wrapper);
   	
}

