package com.audi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.audi.mvc.dao.Factory;
import com.audi.mvc.dto.DataBean;

public class RequestDataServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// response to user 
		String redirect_url = "";
		RequestDispatcher  reqDisp = null;
		
		
		
		// get the user id with the help of html/ jsp page 
			int userid = Integer.parseInt(req.getParameter("userid"));
		
		// send it to bean to set in the variable
			DataBean   dataBean = new DataBean();
					   dataBean.setUserid(userid); // set the form data to dto
					   
		// access the related data using dao 	
		
		 DataBean dbean = Factory.getUser().getDetails(userid);
		 
		 if( dbean != null) {
			 // send user to home page
			 req.setAttribute("UserData", dbean);
			  redirect_url = "userhome.jsp";
			 
		 }else {
			 // send user to re_login_ or errorpage
			 req.setAttribute("invaliduser", "Invalid User ID ");
			 redirect_url = "err_relogin.jsp";
		 }
		 
		 reqDisp = req.getRequestDispatcher(redirect_url);
		 reqDisp.forward(req, resp);
			
	}

}
