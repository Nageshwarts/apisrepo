package com.example.demo.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.items.items;

public class order {

	private List<items> order_items=new ArrayList();
	private int distance;
	private Map<String,String> offer=new HashMap();
	
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public Map<String,String> getOffer() {
		return offer;
	}
	public void setOffer(Map<String,String> offer) {
		this.offer = offer;
	}
	public List<items> getOrder_items() {
		return order_items;
	}
	public void setOrder_items(List<items> order_items) {
		this.order_items = order_items;
	}
}
