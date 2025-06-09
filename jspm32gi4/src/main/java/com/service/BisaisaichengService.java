package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BisaisaichengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BisaisaichengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BisaisaichengView;


/**
 * 比赛赛程
 *
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
public interface BisaisaichengService extends IService<BisaisaichengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BisaisaichengVO> selectListVO(Wrapper<BisaisaichengEntity> wrapper);
   	
   	BisaisaichengVO selectVO(@Param("ew") Wrapper<BisaisaichengEntity> wrapper);
   	
   	List<BisaisaichengView> selectListView(Wrapper<BisaisaichengEntity> wrapper);
   	
   	BisaisaichengView selectView(@Param("ew") Wrapper<BisaisaichengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BisaisaichengEntity> wrapper);
   	
}

