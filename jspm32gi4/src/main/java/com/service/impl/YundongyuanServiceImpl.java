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


import com.dao.YundongyuanDao;
import com.entity.YundongyuanEntity;
import com.service.YundongyuanService;
import com.entity.vo.YundongyuanVO;
import com.entity.view.YundongyuanView;

@Service("yundongyuanService")
public class YundongyuanServiceImpl extends ServiceImpl<YundongyuanDao, YundongyuanEntity> implements YundongyuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YundongyuanEntity> page = this.selectPage(
                new Query<YundongyuanEntity>(params).getPage(),
                new EntityWrapper<YundongyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YundongyuanEntity> wrapper) {
		  Page<YundongyuanView> page =new Query<YundongyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YundongyuanVO> selectListVO(Wrapper<YundongyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YundongyuanVO selectVO(Wrapper<YundongyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YundongyuanView> selectListView(Wrapper<YundongyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YundongyuanView selectView(Wrapper<YundongyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
