package com.wanganning.cms.service;

import java.util.List;


import com.github.pagehelper.PageInfo;
import com.wanganning.cms.entity.Goods;
import com.wanganning.cms.vo.GoodsVO;

public interface GoodsService {

	
	PageInfo<Goods> selects(GoodsVO goodsVO,Integer page,Integer pageSize);
	
	int insert(List<Goods> goods);
	
}
