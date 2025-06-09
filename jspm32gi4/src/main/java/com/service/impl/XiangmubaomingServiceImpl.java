package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiangmubaomingDao;
import com.entity.XiangmubaomingEntity;
import com.service.XiangmubaomingService;
import com.entity.vo.XiangmubaomingVO;
import com.entity.view.XiangmubaomingView;

@Service("xiangmubaomingService")
public class XiangmubaomingServiceImpl extends ServiceImpl<XiangmubaomingDao, XiangmubaomingEntity> implements XiangmubaomingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmubaomingEntity> page = this.selectPage(
                new Query<XiangmubaomingEntity>(params).getPage(),
                new EntityWrapper<XiangmubaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmubaomingEntity> wrapper) {
		  Page<XiangmubaomingView> page =new Query<XiangmubaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmubaomingVO> selectListVO(Wrapper<XiangmubaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmubaomingVO selectVO(Wrapper<XiangmubaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmubaomingView> selectListView(Wrapper<XiangmubaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmubaomingView selectView(Wrapper<XiangmubaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
