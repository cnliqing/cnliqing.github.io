package com.lq.questionnaire.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lq.questionnaire.pojo.User;
import com.lq.questionnaire.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	
	/**
	 * 主页面跳转至登录页面
	 */
	@RequestMapping("/login")
	public ModelAndView Login(HttpServletRequest request,Model model){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	/**
	 * 登陆面跳转至个人页面
	 */
	@RequestMapping("/personal")
	public ModelAndView Personal(HttpServletRequest request,Model model){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("personal");
		return mv;
	}
	
	/**
	 * 用户登录
	 * @param user
	 * @return map
	 */
	@RequestMapping(value="/logining", method=RequestMethod.POST)
	@ResponseBody 
	public Map<String, Object> Logining(@RequestBody User user) {
		Map<String, Object> map = new HashMap<>();
		
		String result = this.userService.getUserByLoginName(user);
		
		map.put("result", result);
		
		return map;
	}
}

