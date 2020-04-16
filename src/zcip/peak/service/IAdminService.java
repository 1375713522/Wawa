package zcip.peak.service;

import zcip.peak.entity.Admin;

public interface IAdminService {
		
	public Admin login(Admin admin);
	
	public Admin register(Admin admin);
	
	public String selectMail(String aMail);
	
	public Admin selectAdmin(Admin admin);
	
	public void updateAdmin(Admin admin);
	
	public Admin selectOne(String aid);
}
