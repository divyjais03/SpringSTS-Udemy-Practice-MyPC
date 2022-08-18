package com.onmobile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome() {
		
		return "hello";							// this Hello is nothing but the JSP file in web-INF
	}											// we are loading the hello.jsp file
	
	//@RequestMapping("displayname")					// By default method is always get so need not to specify
	@GetMapping("displayname")						// specifically for GET operation
	
	public ModelAndView displayName(@RequestParam("firstName1") String FirstName) {	// instead of getParameter instead of making object of HttpServletRequest make model
														 
		ModelAndView modelAndView= new ModelAndView("displayName");
		Date date= new Date();
		List<String> names =new ArrayList<>();
		names.add("Divyanshu");
		names.add("Poplu");
		names.add("Asur");
		
		
		modelAndView.addObject("Date",date);		// instead of making Model model in parameter use ModelAndView
		modelAndView.addObject("name",FirstName);	// instead of setAttribute use model.addAttribute and put the value of FirstName in name.
		modelAndView.addObject("Team", names);
		
		  return modelAndView;					// instead of returning string return ModelAndView Object that you made
	}
	
}
