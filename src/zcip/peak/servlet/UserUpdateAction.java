package zcip.peak.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.entity.User;
import zcip.peak.service.IUserService;
import zcip.peak.service.impl.UserService;

public class UserUpdateAction extends HttpServlet {
	
	private IUserService iuserservice = new UserService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String uid  = request.getParameter("uid");
		
		String uname=request.getParameter("uname");
		
		String utel=request.getParameter("utel");
		
		String uemail=request.getParameter("uemail");
		
		String uage=request.getParameter("uage");
		
		String usex=request.getParameter("usex");
		
		User user = new User(uid,uname,utel,uemail,Integer.parseInt(uage),Integer.parseInt(usex));
		
		System.out.println(user);
		iuserservice.updateUser(user);
		
		
		response.sendRedirect(request.getContextPath() + "/user");
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
