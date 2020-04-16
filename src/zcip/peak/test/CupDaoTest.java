package zcip.peak.test;

import java.util.List;

import org.junit.Test;

import zcip.peak.bean.Utils;
import zcip.peak.dao.ICupDao;
import zcip.peak.dao.IUserDao;
import zcip.peak.dao.impl.CupDao;
import zcip.peak.dao.impl.UserDao;
import zcip.peak.entity.Cup;
import zcip.peak.entity.User;

public class CupDaoTest {
		
//		private String cid;
//		private String pid;
//		private String uid;
		@Test
		public void fun1() throws Exception{
			Cup cup = new Cup(Utils.getUUID(),"554ca22c7f9346a380459bd3c16e217a","9e5398bdf18a48c789af57ea26ee5e96");
			ICupDao cupdao = new CupDao();
			cupdao.addCup(cup);
		}
		
		@Test
		public void fun2() throws Exception{
			Cup cup = new Cup("38bf2a9bfcc94d4694e86d41973be26d","c7a5f213b83843139716176f463540fa","9e5398bdf18a48c789af57ea26ee5e96");
			ICupDao icupdao = new CupDao();
			icupdao.updateCup(cup);
		}
		
		@Test
		public void fun3() throws Exception{
			ICupDao icupdao = new CupDao();
			icupdao.deleteCup("7bfb4cc764834560be53e53f2b60f83e");
		}
		
		@Test
		public void fun4() throws Exception{
			ICupDao icupdao = new CupDao();
			List<Cup> cup = icupdao.selectAll();
			
			for(Cup c:cup){
				System.out.println(c);
			}
		}
		
		@Test
		public void fun5() throws Exception{
			ICupDao icupdao = new CupDao();
			Cup cup = icupdao.selectOne("38bf2a9bfcc94d4694e86d41973be26d");
			System.out.println(cup);

		}
		
}
