 package com.authentication.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		 String text="this is provate page";
		 text+="this page is not allowed to unauthenticated users";
		 return text;
	}
}
