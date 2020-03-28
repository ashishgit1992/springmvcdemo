package com.proj.SimpleMailDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mailController {

	@RequestMapping("/action")
	public String mail()
	{
		return "mail";
		}
	@RequestMapping("/")
	public String index()
	{
		return "index";
		}
	@RequestMapping("/login")
	public String login()
	{
		return "login";
		}
}
