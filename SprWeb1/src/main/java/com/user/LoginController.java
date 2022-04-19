package com.user;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	//load input file for user inputs
	@RequestMapping(value ="/login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login", "command",  new Login());
	}
	
	//configuring output page with url as /userlogin, send data to destination as hidden data with POST method
	@RequestMapping(value ="/userlogin",method=RequestMethod.POST)
	public String userLogin(@ModelAttribute("SpringWeb") Login login,ModelMap model) {
		model.addAttribute("username",login.getUsername());
		model.addAttribute("password",login.getPassword());
		if (login.getUsername().equals(login.getPassword())) {
			return "result";
		}
		else {
			return "failure";
		}
	}
}