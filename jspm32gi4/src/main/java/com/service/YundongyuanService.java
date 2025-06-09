package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YundongyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YundongyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YundongyuanView;


/**
 * 运动员
 *
 * @author 
 * @email 
 * @date 2021-03-01 14:35:31
 */
public interface YundongyuanService extends IService<YundongyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YundongyuanVO> selectListVO(Wrapper<YundongyuanEntity> wrapper);
   	
   	YundongyuanVO selectVO(@Param("ew") Wrapper<YundongyuanEntity> wrapper);
   	
   	List<YundongyuanView> selectListView(Wrapper<YundongyuanEntity> wrapper);
   	
   	YundongyuanView selectView(@Param("ew") Wrapper<YundongyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YundongyuanEntity> wrapper);
   	
}

