package zcip.peak.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.entity.Prize;
import zcip.peak.service.IPrizeService;
import zcip.peak.service.impl.PrizeService;

public class PrizeDeleteServlet extends HttpServlet {
	
	private IPrizeService iprizeservice = new PrizeService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String pid  = request.getParameter("pid");
		
		Prize prize= iprizeservice.selectOne(pid);
		
		request.getSession().setAttribute("prizedelete", prize);
		
		request.getRequestDispatcher("/prizedelete.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
