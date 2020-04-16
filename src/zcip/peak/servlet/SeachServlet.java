package zcip.peak.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

public class SeachServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String seach = request.getParameter("seach");
		ICupService icupservice = new CupService();
		IPrizeService iprizeservice = new PrizeService();
		IUserService iuserservice = new UserService();
		
		List<Cup> cup = icupservice.selectAll();
		List<CupAll> cupall= new ArrayList<CupAll>();		
		for(int i=0;i<cup.size();i++){
			Cup c = cup.get(i);
			User u = iuserservice.selectOne(c.getUid());
			Prize p = iprizeservice.selectOne(c.getPid());
			cupall.add(new CupAll(p,u,c.getCid()));
			
		}
		
		for(int i=0;i<cupall.size();){
			if(cupall.get(i).getUser().getUname().indexOf(seach)==-1){
				cupall.remove(i);
			}else{
				i++;
			}
		}
		
		request.getSession().setAttribute("cupall", cupall);
		if(request.getSession().getAttribute("userprizea")!=null)request.getSession().removeAttribute("userprizea");
		request.getRequestDispatcher("/cup.jsp").forward(request, response);
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);
	}

}
