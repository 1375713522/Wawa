package zcip.peak.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.entity.Cup;
import zcip.peak.entity.CupAll;
import zcip.peak.entity.Prize;
import zcip.peak.entity.User;
import zcip.peak.service.ICupService;
import zcip.peak.service.IPrizeService;
import zcip.peak.service.IUserService;
import zcip.peak.service.impl.CupService;
import zcip.peak.service.impl.PrizeService;
import zcip.peak.service.impl.UserService;

public class CupDeleteServlet extends HttpServlet {
	
	private ICupService icupservice = new CupService();
	private IPrizeService iprizeservice = new PrizeService();
	private IUserService iuserservice = new UserService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String cid  = request.getParameter("cid");
		
		Cup cup = icupservice.selectOne(cid);
		User user = iuserservice.selectOne(cup.getUid());
		Prize prize = iprizeservice.selectOne(cup.getPid());
		
		CupAll cupdelete = new CupAll(prize,user,cid);
		
		
		request.getSession().setAttribute("cupdelete", cupdelete);
		
		request.getRequestDispatcher("/cupdelete.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
