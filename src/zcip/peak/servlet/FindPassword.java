package zcip.peak.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.bean.Utils;
import zcip.peak.service.IAdminService;
import zcip.peak.service.impl.AdminService;

public class FindPassword extends HttpServlet {

	private IAdminService iadminservice = new AdminService();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String aMail=request.getParameter("amail");
			
			if(iadminservice.selectMail(aMail)==null){
				request.getSession().setAttribute("amailError", "amailError");
			}
			else{
				String  str=Utils.getUUID();
				String aid=iadminservice.selectMail(aMail);
				try {
					
					Utils.Letter("15940642098@163.com", "c5267827936d",aMail, "ÑéÖ¤ÂëÎª", str);
				} catch (Exception e) {
					e.printStackTrace();
				}
				request.getSession().setAttribute("str", str);
				request.getSession().setAttribute("aid", aid);
				System.out.println(aid+"aaaaaaaaaaaaaaaaaaaaaaaaa");
			}
			
			response.sendRedirect(request.getContextPath() + "/findpasswordaction.jsp");

			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			doGet(request,response);
	}

}
