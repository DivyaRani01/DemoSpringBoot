package com.DemoBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(value="/Hey")
	public String hello() {
		
		//showing the output by the server
		return "HELLO...!Welcome to server";
	}

}
