package zcip.peak.service.impl;

import zcip.peak.dao.IAdminDao;
import zcip.peak.dao.impl.AdminDao;
import zcip.peak.entity.Admin;
import zcip.peak.service.IAdminService;

public class AdminService implements IAdminService{

	private IAdminDao iadmindao = new AdminDao();
	@Override
	public Admin login(Admin admin) {
		return iadmindao.selectAdmin(admin);
	}

	@Override
	public Admin register(Admin admin) {
		Admin a=iadmindao.selectAusername(admin);
		if(a==null){
			iadmindao.addAdmin(admin);
		}
		return a;
	}
	
	public String selectMail(String aMail){
		return iadmindao.selectMail(aMail);
	}
	
	public Admin selectAdmin(Admin admin){
		return iadmindao.selectAdmin(admin);
	}
	
	public Admin selectOne(String aid){
		return iadmindao.selectOne(aid);
	}

	
	public void updateAdmin(Admin admin) {
		iadmindao.updateAdmin(admin);
	}

}
