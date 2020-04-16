package zcip.peak.test;

import java.util.List;

import org.junit.Test;

import zcip.peak.bean.Utils;
import zcip.peak.dao.IAdminDao;
import zcip.peak.dao.impl.AdminDao;
import zcip.peak.entity.Admin;
import zcip.peak.service.IAdminService;
import zcip.peak.service.impl.AdminService;

public class AdminDaoTest {
		
//		private String aid;
//		private String ausername;
//		private String apassword;
		@Test
		public void fun1() throws Exception{
//			Admin admin= new Admin(Utils.getUUID(),"admin","123456");
			
			Admin admin= new Admin(Utils.getUUID(),"管理员","123456","");
			
			IAdminDao admindao = new AdminDao();
			admindao.addAdmin(admin);
		}
		
		@Test
		public void fun2() throws Exception{
			Admin admin = new Admin("2550b3c648af46748ebdab054b281ee1","管理员2","1233","");
			IAdminDao admindao = new AdminDao();
			admindao.updateAdmin(admin);
		}
		
		@Test
		public void fun3() throws Exception{
			IAdminDao admindao = new AdminDao();
			admindao.deleteAdmin("2550b3c648af46748ebdab054b281ee1");
		}
		
		@Test
		public void fun4() throws Exception{			
			IAdminDao admindao = new AdminDao();
			List<Admin>admin = admindao.selectAll();
			
			for(Admin a :admin){
				System.out.println(a);
			}
		}
		
		@Test
		public void fun5() throws Exception{
			IAdminDao admindao = new AdminDao();
			Admin admin = admindao.selectOne("25d2d5005ba24b169b759c81e9acc607");
			System.out.println(admin);
		}
		@Test
		public void fun6() throws Exception{
			Admin admin = new Admin("","管理员","","");
			IAdminDao admindao = new AdminDao();
			Admin a = admindao.selectAusername(admin);
			System.out.println(a);
		}
		
		@Test
		public void fun7() throws Exception{
			Admin admin = new Admin("","管理员","12456","");
			IAdminDao admindao = new AdminDao();
			Admin a = admindao.selectAdmin(admin);
			System.out.println(a);
		}
		@Test
		public void fun8(){
			IAdminService iadminservice = new AdminService();
			IAdminDao admindao = new AdminDao();
			String aid=iadminservice.selectMail("1755825170@qq.com");
			String aid2=admindao.selectMail("1755825170@qq.com");
			System.out.println(aid+"aaaaaaaaaaaaa");
			System.out.println(aid2+"aaaaaaaaaaaaa");
			
			Admin admin=iadminservice.selectOne(aid);
			System.out.println(admin);
			
			
			Admin admin2=iadminservice.selectOne(aid2);
			System.out.println(admin2);

		}
		

		
}
