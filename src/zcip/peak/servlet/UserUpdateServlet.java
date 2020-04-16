package zcip.peak.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.entity.User;
import zcip.peak.service.IUserService;
import zcip.peak.service.impl.UserService;

public class UserUpdateServlet extends HttpServlet {
	
	private IUserService iuserservice = new UserService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String uid  = request.getParameter("uid");
		
		User user = iuserservice.selectOne(uid);
		
		request.getSession().setAttribute("userupdate", user);
		
		request.getRequestDispatcher("/userupdate.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
