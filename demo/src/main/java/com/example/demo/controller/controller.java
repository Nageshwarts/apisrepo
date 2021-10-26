package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.distance.distance1;
import com.example.demo.items.items;
import com.example.demo.order.order;

@RestController
public class controller {
	
	private int totalsum;
	
	//declaring list to store the order items
	private List<items> order_items1=new ArrayList();
	private float distance2;
	
	//declaring a local map to store the offers
	private Map<String,String> offer1=new HashMap();
	
	//declaring a local hashmap to return the data as json
	private HashMap<String,Integer> order_total=new HashMap<String,Integer>();
	int sum2;
	//getting the data from user
	@PostMapping("/api")
	public HashMap fun(@RequestBody order od ) {
		
		//storing the oder items in local variable and iterate over the required data in a list
		order_items1=od.getOrder_items();
		for(items i:order_items1) 
			totalsum+=i.getPrice()*i.getQuantity();
		
		int sum2=totalsum;
		//getting distance from input and doing necessary  operation on data
		distance2=od.getDistance();
		distance2=distance2/1000;
		
		distance1 d1 = null;
		
		 d1.check(distance2);
		
		 
		order_total.put("order_total", totalsum);
		
		
		
		offer1=od.getOffer();
	   //checking the offer type is Flat		
		if(offer1.get("offer_type").equals("Flat")) {
			int val=Integer.parseInt(offer1.get("offer_val"));
			int discount=totalsum>val?val:totalsum;
			totalsum-=discount;
			order_total.put("order_total", totalsum);
			return order_total;
		}
		
		//checking the offer type is Delivery or not
		else if(offer1.get("offer_type").equals("Delivery")) {
			
		order_total.put("order_total",sum2);
		return order_total;
			
	}
		else {
			order_total.put("oredr_total",totalsum);
			return order_total;
		}

		
}
}