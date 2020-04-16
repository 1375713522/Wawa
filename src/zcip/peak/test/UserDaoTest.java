package zcip.peak.test;

import java.util.List;

import org.junit.Test;

import zcip.peak.bean.Utils;
import zcip.peak.dao.IUserDao;
import zcip.peak.dao.impl.UserDao;
import zcip.peak.entity.User;

public class UserDaoTest {
		
	//	private String uid;
	//	private String uname;
	//	private String utel;
	//	private String uemail;
	//	private Integer uage;
	//	private Integer usex;
		@Test
		public void fun1() throws Exception{
			User user = new User(Utils.getUUID(),"张三","15940642098","1375713522@qq.com",14,1);
			IUserDao iuserdao = new UserDao();
			iuserdao.addUser(user);
		}
		
		@Test
		public void fun2() throws Exception{
			User user = new User("057c01bf454d41e2af56e72c525f5da2","张三","15940642098","1375713522@qq.com",14,1);
			IUserDao iuserdao = new UserDao();
			iuserdao.updateUser(user);
		}
		
		@Test
		public void fun3() throws Exception{
//			User user = new User("057c01bf454d41e2af56e72c525f5da2","张三","15940642098","1375713522@qq.com",14,1);
			IUserDao iuserdao = new UserDao();
			iuserdao.deleteUser("057c01bf454d41e2af56e72c525f5da2");
		}
		
		@Test
		public void fun4() throws Exception{
			IUserDao iuserdao = new UserDao();
			List<User> user = iuserdao.selectAll();
			
			for(User u:user){
				System.out.println(u);
			}
		}
		
		@Test
		public void fun5() throws Exception{
			IUserDao iuserdao = new UserDao();
			User user = iuserdao.selectOne("db446b1b5ec64779b41813cc3ec01681");
			System.out.println(user);
		}
		
}
