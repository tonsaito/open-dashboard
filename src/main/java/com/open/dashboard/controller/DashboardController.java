package com.open.dashboard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DashboardController {

	@RequestMapping("/dashboard")
	public ModelAndView index() {
		System.out.println("Dashboard Controller!");
		ModelAndView view = new ModelAndView("/dashboard/index");
		return view;
	}

	@RequestMapping("/test")
	public String test() {
		return "Test!";
	}
	
}
