package com.onmobile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome() {
		
		return "hello";				// this Hello is nothing but the JSP file name and title name in web-INF
	}
	
}
