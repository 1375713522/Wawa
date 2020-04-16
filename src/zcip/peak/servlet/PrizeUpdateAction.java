package zcip.peak.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.entity.Prize;
import zcip.peak.service.IPrizeService;
import zcip.peak.service.impl.PrizeService;

public class PrizeUpdateAction extends HttpServlet {
	
	private IPrizeService iprizeservice = new PrizeService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String pid  = request.getParameter("pid");
		
		String pname=request.getParameter("pname");
		
		String pgrade=request.getParameter("pgrade");
		
		String pnum=request.getParameter("pnum");
		
		String pdesc=request.getParameter("pdesc");
		
		
		Prize prize= new Prize(pid,pname,Integer.parseInt(pgrade),Integer.parseInt(pnum),pdesc);
		
		iprizeservice.updatePrize(prize);
		
		
		response.sendRedirect(request.getContextPath() + "/prize");
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
