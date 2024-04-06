package com.example.codingdojo.fechayhora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class fecha {
	@RequestMapping("/fecha")
	public String homePage() {
		return "fecha.jsp";
	}
}
