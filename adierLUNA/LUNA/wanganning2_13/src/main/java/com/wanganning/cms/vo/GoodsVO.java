package com.wanganning.cms.vo;

import java.io.Serializable;


public class GoodsVO  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String startPrice;
	private String endPrice;
	private String startSales;
	private String endSales;
	private String orderColum;
	private String orderMethod;
	
	
	public String getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}
	public String getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}
	public String getStartSales() {
		return startSales;
	}
	public void setStartSales(String startSales) {
		this.startSales = startSales;
	}
	public String getEndSales() {
		return endSales;
	}
	public void setEndSales(String endSales) {
		this.endSales = endSales;
	}
	public String getOrderColum() {
		return orderColum;
	}
	public void setOrderColum(String orderColum) {
		this.orderColum = orderColum;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	
	

}
