package com.example.codingdojo.fechayhora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Hora {
	@RequestMapping("/hora")
	public String homePage() {
		return "hora.jsp";
	}
}
