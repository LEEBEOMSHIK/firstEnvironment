package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/test")
	public List<String> test() {
		List<String> list = Arrays.asList("aa", "bb");
		System.out.println(list + "list");
		return list;
	}
}
