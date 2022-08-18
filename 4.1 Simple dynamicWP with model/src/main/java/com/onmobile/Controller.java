package com.onmobile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onmobile.model.Person;


@WebServlet("/")											// ("/") means that every request is being handled by the  Servlet
public class Controller extends HttpServlet {				//controller controls the flow of data  // THIS is SERVLET !!
	private static final long serialVersionUID = 1L;
       
 
    public Controller() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Person> staff= new ArrayList<>();
	    staff.add(new Person("Divyanshu", 21));
		staff.add(new Person("Poplu", 20));
		
		
		request.setAttribute("staffrandom", staff);		// for setting the data : request.setAttribute("String name", object);
		request.getRequestDispatcher("view.jsp").forward(request, response); // this RequestDispatcher is used to navigate fom servlet to html or jsp pages // only this line in SDWP
	}

	}


