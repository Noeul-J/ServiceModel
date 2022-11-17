package egovframework.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainCtr {
	
	@RequestMapping(value = "/main.do")
	public String mainPage() {
		return "main";
	}
	
	@RequestMapping(value = "/test/test.do")
	public String test() {
		return "test";
	}
}
