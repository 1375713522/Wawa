package zcip.peak.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zcip.peak.bean.Utils;
import zcip.peak.entity.Cup;
import zcip.peak.entity.Prize;
import zcip.peak.entity.User;
import zcip.peak.entity.UserPrize;
import zcip.peak.service.ICupService;
import zcip.peak.service.IPrizeService;
import zcip.peak.service.IUserService;
import zcip.peak.service.impl.CupService;
import zcip.peak.service.impl.PrizeService;
import zcip.peak.service.impl.UserService;

public class HandleServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uid=request.getParameter("uid");
		String pid=request.getParameter("pid");
		
		String cid = Utils.getUUID();
		Cup cup = new Cup(cid,pid,uid);
		ICupService icupservice = new CupService();
		icupservice.addCup(cup);
		
		IPrizeService iprizeservice = new PrizeService();
		IUserService iuserservice = new UserService();
		
		List<User> usera = (List<User>)request.getSession().getAttribute("usera");
		List<Prize>prizea = (List<Prize>)request.getSession().getAttribute("prizea");
		List<UserPrize>userprizea = (List<UserPrize>)request.getSession().getAttribute("userprizea");
		
		for(int i=0;i<usera.size();i++){
			if(usera.get(i).getUid().equals(uid)){
				usera.remove(i);
				break;
			}
		}
		
		for(int i=0;i<prizea.size();i++){
			if(prizea.get(i).getPid().equals(pid)){
				Prize p = prizea.get(i);
				p.setPnum(p.getPnum()-1);
				iprizeservice.updatePrize(p);
				if(p.getPnum()==0){
					prizea.remove(i);
				}
				break;
			}
		}
		Prize p = iprizeservice.selectOne(pid);
		User u = iuserservice.selectOne(uid);
		if(userprizea.size()==0){
			userprizea.add(new UserPrize(cid,u.getUname(),u.getUtel(),p.getPgrade(),p.getPname()));
		}
		else {
			userprizea.add(0,new UserPrize(cid,u.getUname(),u.getUtel(),p.getPgrade(),p.getPname()));
		}
		
		
		request.getSession().setAttribute("usera", usera);
		request.getSession().setAttribute("prizea", prizea);
		request.getSession().setAttribute("userprizea", userprizea);
		request.getRequestDispatcher("/lottery_draw.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request,response);

	}

}
