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


import com.dao.BanfazhengshuDao;
import com.entity.BanfazhengshuEntity;
import com.service.BanfazhengshuService;
import com.entity.vo.BanfazhengshuVO;
import com.entity.view.BanfazhengshuView;

@Service("banfazhengshuService")
public class BanfazhengshuServiceImpl extends ServiceImpl<BanfazhengshuDao, BanfazhengshuEntity> implements BanfazhengshuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanfazhengshuEntity> page = this.selectPage(
                new Query<BanfazhengshuEntity>(params).getPage(),
                new EntityWrapper<BanfazhengshuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanfazhengshuEntity> wrapper) {
		  Page<BanfazhengshuView> page =new Query<BanfazhengshuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanfazhengshuVO> selectListVO(Wrapper<BanfazhengshuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanfazhengshuVO selectVO(Wrapper<BanfazhengshuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanfazhengshuView> selectListView(Wrapper<BanfazhengshuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanfazhengshuView selectView(Wrapper<BanfazhengshuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
