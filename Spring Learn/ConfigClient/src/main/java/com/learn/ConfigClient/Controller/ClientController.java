package com.learn.ConfigClient.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Client")
@RestController
@RefreshScope
public class ClientController {
	
	@Value("${app.message}")
	private String message1;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@GetMapping("/app")
	public String getApp1() {
		return message1;
	}
	
	@Value("${user}")
	private String user;
	
	@GetMapping("/username")
	public String getUsername() {
		return username+" Properties "+user;
	}
	
}
