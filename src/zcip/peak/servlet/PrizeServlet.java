package zcip.peak.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.entity.Prize;
import zcip.peak.service.impl.PrizeService;

public class PrizeServlet extends HttpServlet {
	
	private PrizeService prizeservice = new PrizeService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			List<Prize> prizes = prizeservice.selectAll();
			
			request.getSession().setAttribute("prizes", prizes);
			request.getRequestDispatcher("/prize.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
