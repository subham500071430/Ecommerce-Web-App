package com.foxmula.webApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
	@Autowired
	CustomerRepository rep;
	
	@RequestMapping("track")
	
	public ModelAndView track()
	{   
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("track.jsp");
		
		return mv;
	}
	
	@RequestMapping("addDetails")
	
	public ModelAndView add(Customer c)
	{
        ModelAndView mv = new ModelAndView();
		
		mv.setViewName("customerdetails.jsp");
		
		rep.save(c);
		
		return mv;
	}
	
	
	@PostMapping("details")
	
	public ModelAndView viewdetails(@RequestParam("uid") String uid
			,@RequestParam("pass") String pass,@RequestParam("tid") String
			tid,ModelMap mm)
	{      
		   ModelAndView mv = new ModelAndView();
		   
		   mm.put("uid",uid);
		   mm.put("pass",pass);
		   mm.put("tid",tid);
		   
		   mv.setViewName("view.jsp");
		   return mv;
	}
}
