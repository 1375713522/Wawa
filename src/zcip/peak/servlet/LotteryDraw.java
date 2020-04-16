package zcip.peak.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.entity.Prize;
import zcip.peak.entity.User;
import zcip.peak.entity.UserPrize;
import zcip.peak.service.IPrizeService;
import zcip.peak.service.IUserService;
import zcip.peak.service.impl.PrizeService;
import zcip.peak.service.impl.UserService;

public class LotteryDraw extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IPrizeService iprizeservice = new PrizeService();
		IUserService iuserservice = new UserService();
		
		List<Prize> prizea = iprizeservice.selectAll();
		List<User> usera= iuserservice.selectAll();
		List<UserPrize>userprizea = new ArrayList<UserPrize>();
		
		for(int i=0;i<prizea.size();){
			if(prizea.get(i).getPnum()<=0){
				prizea.remove(i);
			}else {
				i++;
			}
		}
	
		request.getSession().setAttribute("usera", usera);
		request.getSession().setAttribute("prizea", prizea);
		request.getSession().setAttribute("userprizea", userprizea);

		request.getRequestDispatcher("/lottery_draw.jsp").forward(request, response);
		///lottery_draw.jsp
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
