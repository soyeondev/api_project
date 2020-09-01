package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.hello.HelloAnalyticsReporting;
import com.google.api.services.analyticsreporting.v4.AnalyticsReporting;
import com.google.api.services.analyticsreporting.v4.model.GetReportsResponse;

@Controller
public class DemoController {
	@RequestMapping("/test1")
	public void test1() {}
	
	@RequestMapping("/reporting")
	public void reporting() {}
	
	@RequestMapping("/embed")
	public void embed() {
		HelloAnalyticsReporting har = new HelloAnalyticsReporting();
	    try {
	        AnalyticsReporting service = har.initializeAnalyticsReporting();

	        GetReportsResponse response = har.getReport(service);
	        har.printResponse(response);
	        System.out.println();
	        
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	}
}
