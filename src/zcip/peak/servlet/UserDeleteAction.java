package zcip.peak.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.service.ICupService;
import zcip.peak.service.IUserService;
import zcip.peak.service.impl.CupService;
import zcip.peak.service.impl.UserService;

public class UserDeleteAction extends HttpServlet {
	
	private IUserService iuserservice = new UserService();
	private ICupService icupservice = new CupService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		String uid=request.getParameter("uid");
		
		if(icupservice.selectUid(uid)==true){
			request.getSession().setAttribute("deleteUserError", "deleteUserError");
		}
		
		else {
			request.getSession().setAttribute("deleteUserError", null);
			iuserservice.deleteUser(uid);
		}
		response.sendRedirect(request.getContextPath() + "/user");
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
