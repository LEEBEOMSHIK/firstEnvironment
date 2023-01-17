package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String hello() {
		
//		ModelAndView mv = new ModelAndView("test");
		System.out.println("여기 탄게 맞아??");
		return "test";
	}
}
