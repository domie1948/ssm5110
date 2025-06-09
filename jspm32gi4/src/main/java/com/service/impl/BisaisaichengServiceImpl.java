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


import com.dao.BisaisaichengDao;
import com.entity.BisaisaichengEntity;
import com.service.BisaisaichengService;
import com.entity.vo.BisaisaichengVO;
import com.entity.view.BisaisaichengView;

@Service("bisaisaichengService")
public class BisaisaichengServiceImpl extends ServiceImpl<BisaisaichengDao, BisaisaichengEntity> implements BisaisaichengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BisaisaichengEntity> page = this.selectPage(
                new Query<BisaisaichengEntity>(params).getPage(),
                new EntityWrapper<BisaisaichengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BisaisaichengEntity> wrapper) {
		  Page<BisaisaichengView> page =new Query<BisaisaichengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BisaisaichengVO> selectListVO(Wrapper<BisaisaichengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BisaisaichengVO selectVO(Wrapper<BisaisaichengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BisaisaichengView> selectListView(Wrapper<BisaisaichengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BisaisaichengView selectView(Wrapper<BisaisaichengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
