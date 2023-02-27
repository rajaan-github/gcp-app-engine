package com.gcp.cluster;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppEngineController {

	
	@RequestMapping("/getdata")
	public String getdata()
	{
	return "Hello World";	
	}
}
