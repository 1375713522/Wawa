package zcip.peak.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.entity.Cup;
import zcip.peak.entity.Prize;
import zcip.peak.service.ICupService;
import zcip.peak.service.IPrizeService;
import zcip.peak.service.IUserService;
import zcip.peak.service.impl.CupService;
import zcip.peak.service.impl.PrizeService;
import zcip.peak.service.impl.UserService;

public class UserPrizeInfo extends HttpServlet {
	
	private IUserService iuserservice = new UserService();
	private ICupService icupservice=new CupService();
	private IPrizeService iprizeservice=new PrizeService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String uid  = request.getParameter("uid");
		List<Cup> cup=icupservice.selectU(uid);
		List<Prize> userprizeinfo = new ArrayList<Prize>();
		for(int i=0;i<cup.size();i++){
			String pid = cup.get(i).getPid();
			Prize prize = iprizeservice.selectOne(pid);
			userprizeinfo.add(prize);
		}
		
		request.getSession().setAttribute("userprizeinfo", userprizeinfo);
		
		request.getRequestDispatcher("/userprizeinfo.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
