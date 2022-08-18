package com.onmobile;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome() {
		
		return "hello";							// this Hello is nothing but the JSP file in web-INF
	}											// we are loading the hello.jsp file
	
	@RequestMapping(value="displayname")					// By default method is always get so need not to specify
	public String displayName(HttpServletRequest request) {
		String FirstName=request.getParameter("firstName1");   // name from hello.jsp is stored in FirstName
		request.setAttribute("firstName2", FirstName);			//Vale of FirstName is set in name from displayName.jsp
		
		return "displayName";
	}
	
}
