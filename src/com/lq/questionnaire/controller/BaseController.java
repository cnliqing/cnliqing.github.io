package com.lq.questionnaire.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {
	/** 
	* 默认首页控制器 
	*/  
	@RequestMapping("/index")  
	public ModelAndView login(HttpServletRequest request,Model model){  
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;  
	}  
}
