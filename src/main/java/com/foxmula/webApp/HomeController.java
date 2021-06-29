package com.foxmula.webApp;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
	@Autowired
	CustomerRepository rep;
	@Autowired
	OrderListRepository obj;
	
	@RequestMapping("/customers")
	@ResponseBody
	public String customers()
	{   
		return rep.findAll().toString();
	}
	
    @RequestMapping("/customers/{cid}")
	
	public List<Customer> customersbyId(@PathVariable("cid") int cid)
	{   
		return rep.findBycid(cid);
	}
    
    @PostMapping("/addCustomer")
    @ResponseBody
    public boolean addCustomer(Customer customer)
    {
    	
    		rep.save(customer);
    		return true;
    }
    
    @RequestMapping("/trackorder")
    
    public List<OrderList> trackOrder()
    {
    	return obj.findAll();
    }
    
    @RequestMapping("/trackorder/{tid}")
    
    public List<OrderList> trackOrderbyId(@PathVariable("tid") int tid)
    {
    	return obj.findBytid(tid);
    }
    
    
	
}
