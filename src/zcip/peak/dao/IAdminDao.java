package zcip.peak.dao;

import java.util.List;

import zcip.peak.entity.Admin;

public interface IAdminDao {
		
		public Admin selectOne(String aid);
		
		public List<Admin> selectAll();
		
		public void updateAdmin(Admin admin);
		
		public void addAdmin(Admin admin);
		
		public void deleteAdmin(String aid);
		
		public Admin selectAusername(Admin admin);
		
		public Admin selectAdmin(Admin admin);
		
		public String selectMail(String aMail);
}
