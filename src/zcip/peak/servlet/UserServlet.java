package zcip.peak.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.entity.User;
import zcip.peak.service.impl.UserService;

public class UserServlet extends HttpServlet {
	
	private UserService userservice = new UserService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			List<User> users = userservice.selectAll();
			
			request.getSession().setAttribute("users", users);
			request.getRequestDispatcher("/user.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
