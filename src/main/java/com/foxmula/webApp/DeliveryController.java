package com.foxmula.webApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

@Autowired
OrderListRepository order;

@RequestMapping("/orderlist")

public List<OrderList> getOrders()
{
	return order.findAll();
}

@RequestMapping("/orderlist/{orderid}")

public List<OrderList> getOrdersbyorderid(@PathVariable("orderid") long orderid)
{
	return order.findByorderid(orderid);
}


@PutMapping("/orderlist/{agentid}/{location}")
public List<OrderList> updateLocation(@PathVariable("agentid") 
                       long agentid,@PathVariable("location") String location)
{
	List<OrderList> list = order.findByagentid(agentid);
	
	return list;
}

   
}
