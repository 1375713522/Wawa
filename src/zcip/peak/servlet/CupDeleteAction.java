package zcip.peak.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.service.ICupService;
import zcip.peak.service.impl.CupService;

public class CupDeleteAction extends HttpServlet {
	
	private ICupService icupservice = new CupService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		String cid=request.getParameter("cid");
		icupservice.deleteCup(cid);		
		
		response.sendRedirect(request.getContextPath() + "/cup");
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
