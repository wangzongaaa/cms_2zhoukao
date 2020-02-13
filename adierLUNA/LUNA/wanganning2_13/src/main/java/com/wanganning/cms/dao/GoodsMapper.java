package com.wanganning.cms.dao;

import java.util.List;

import com.wanganning.cms.entity.Goods;
import com.wanganning.cms.vo.GoodsVO;



public interface GoodsMapper {

	List<Goods> selects(GoodsVO goodsVO);

	int insert(List<Goods> goods);
	

}
