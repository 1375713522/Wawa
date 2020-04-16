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

public class FindPassWordAction extends HttpServlet {

	private IAdminService iadminservice = new AdminService();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String apassword=request.getParameter("apassword");
			String wrong =(String)request.getParameter("str");
			String right = (String)request.getSession().getAttribute("str");
			System.out.println(right+"-------"+wrong);
			if(wrong.equals(right)){
				String  aid=(String)request.getSession().getAttribute("aid");
				System.out.println(aid+"cccccccccccccccccccc");
				Admin admin=iadminservice.selectOne(aid);
				admin.setApassword(apassword);
				iadminservice.updateAdmin(admin);
			}else {
				request.getSession().setAttribute("findpasswordError", "findpasswordError");
			}
			
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			doGet(request,response);
	}

}
