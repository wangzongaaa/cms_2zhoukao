package com.wanganning.cms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.github.pagehelper.PageInfo;
import com.wanganning.cms.entity.Goods;
import com.wanganning.cms.service.GoodsService;
import com.wanganning.cms.vo.GoodsVO;

@Controller
public class GoodsController {
	@Resource
	private GoodsService goodsService;

	@RequestMapping("selects")
	public String selects(GoodsVO goodsVO,Model model,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "8")Integer pageSize) {
		PageInfo<Goods> info = goodsService.selects(goodsVO, page, pageSize);
		model.addAttribute("pg", info);
		model.addAttribute("goodsVO", goodsVO);
		return "goods";
		
		
		
	}
}
