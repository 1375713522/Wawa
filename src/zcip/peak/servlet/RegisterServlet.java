package zcip.peak.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.bean.Utils;
import zcip.peak.entity.Admin;
import zcip.peak.service.IAdminService;
import zcip.peak.service.impl.AdminService;

public class RegisterServlet extends HttpServlet {

	private IAdminService iadminservice = new AdminService();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String aUsername=request.getParameter("ausername");
			String aPassword=request.getParameter("apassword");
			System.out.println(aUsername+"---"+aPassword);
			Admin admin = iadminservice.register(new Admin(Utils.getUUID(),aUsername,aPassword,""));
			
			if(admin != null){
				response.sendRedirect(request.getContextPath() + "/register.jsp");
			}else{
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
			
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			doGet(request,response);
	}

}
