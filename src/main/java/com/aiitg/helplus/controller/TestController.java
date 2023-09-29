package com.aiitg.helplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aiitg.helplus.service.TestService;


@Controller
public class TestController {
	
	private final TestService testService;
	@Autowired
	TestController(TestService testService){
		this.testService = testService;
	}
	@GetMapping("/index")
	String index(Model model) throws Exception {
		System.out.println("index start");
		return "/index";
	}
	@GetMapping("/test")
	String test(Model model) throws Exception {
		System.out.println("Spring Legacy Version : " + org.springframework.core.SpringVersion.getVersion());
		
		String result = testService.getTest();
		model.addAttribute("message", result);
		
		return "/showMessage";
	}

}
