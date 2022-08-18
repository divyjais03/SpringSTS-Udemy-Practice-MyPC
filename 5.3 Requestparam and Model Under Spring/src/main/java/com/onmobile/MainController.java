package com.onmobile;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome() {
		
		return "hello";							// this Hello is nothing but the JSP file in web-INF
	}											// we are loading the hello.jsp file
	
	@RequestMapping("displayname")					// By default method is always get so need not to specify
	
	public String displayName(@RequestParam("firstName1") String FirstName, Model model) {	  // instead of getParameter	
				// instead of making object of HttpServletRequest make model
		  model.addAttribute("name",FirstName);				// instead of setAttribute use model.addAttribute and put 
		  																		//the value of FirstName in name.
				
		
		return "displayName";
	}
	
}
