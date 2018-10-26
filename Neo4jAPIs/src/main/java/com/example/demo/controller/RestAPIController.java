package com.example.demo.controller;

import com.example.demo.utility.DBOpsImpl;

@RestController
@RequestMapping("/api")
public class RestAPIController {

	private DBOpsImpl dbo;
	
	public RestAPIController() {
		dbo=new DBOpsImpl();
	}
	
	
	
}
