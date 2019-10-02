package pack.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;


import pack.model.HelloModel;

@org.springframework.stereotype.Controller
@RequestMapping({"hello.do","hi","aaa/bbb/world.do","h*.do","k*","mbc","sbs"})
public class HelloController{
	@Autowired
	private HelloModel helloModel;
	
	/*
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView abc() {
		String result = helloModel.getGreeting();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("result",result);
		return modelAndView;
	}
*/
	/*
	@RequestMapping(method = RequestMethod.GET)
	public Map<String,Object> abc() {
		String result = helloModel.getGreeting();
		
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("result", result);
		return map;
	}
	*/
	  @RequestMapping(method = RequestMethod.GET)
	public Model abc(Model model) {
		String result = helloModel.getGreeting();
		
		model.addAttribute("result",result);
		
		return model;
	}
	 
}



