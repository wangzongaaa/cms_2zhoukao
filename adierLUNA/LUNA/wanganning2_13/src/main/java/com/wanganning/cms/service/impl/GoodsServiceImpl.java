package com.wanganning.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wanganning.cms.dao.GoodsMapper;
import com.wanganning.cms.entity.Goods;
import com.wanganning.cms.service.GoodsService;
import com.wanganning.cms.vo.GoodsVO;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private GoodsMapper goodsMapper;

	@Override
	public PageInfo<Goods> selects(GoodsVO goodsVO,Integer page,Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Goods> list = goodsMapper.selects(goodsVO);
		return new PageInfo<Goods>(list);
	}

	@Override
	public int insert(List<Goods> goods) {
		
		return goodsMapper.insert(goods);
	}

}
