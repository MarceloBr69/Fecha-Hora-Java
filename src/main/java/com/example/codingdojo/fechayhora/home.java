package com.example.codingdojo.fechayhora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class home {
	@RequestMapping("/home")
	public String homePage() {
		return "home.jsp";
	}
}
