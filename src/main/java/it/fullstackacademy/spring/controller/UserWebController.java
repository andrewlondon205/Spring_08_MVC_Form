package it.fullstackacademy.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/web/")
public class UserWebController {

	@GetMapping("/enterUser")
	public ModelAndView enterUser() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@GetMapping("/saveUser")
	public ModelAndView saveUser(@RequestParam String username, @RequestParam String lastname, @RequestParam(required=false) String userEmail) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		System.out.println(username);
		System.out.println(lastname);
		System.out.println(userEmail);
		return mv;
	}

}
