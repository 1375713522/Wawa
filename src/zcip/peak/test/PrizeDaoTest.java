package zcip.peak.test;

import java.util.List;

import org.junit.Test;

import zcip.peak.bean.Utils;
import zcip.peak.dao.IPrizeDao;
import zcip.peak.dao.IUserDao;
import zcip.peak.dao.impl.PrizeDao;
import zcip.peak.dao.impl.UserDao;
import zcip.peak.entity.Prize;
import zcip.peak.entity.User;

public class PrizeDaoTest {
		
//		private String pid;
//		private String pname;
//		private Integer pgrade;
//		private Integer pnum;
//		private String pdesc;
		@Test
		public void fun1() throws Exception{
			Prize prize= new Prize(Utils.getUUID(),"洗衣机",1,3,"洗衣机好用哦");
			IPrizeDao prizedao = new PrizeDao();
			prizedao.addPrize(prize);
		}
		
		@Test
		public void fun2() throws Exception{
			Prize prize = new Prize("081ff2cc7f224a78b09b96c8fd56cbcb","洗衣机",1,3,"洗衣机不好用哦");
			IPrizeDao prizedao = new PrizeDao();
			prizedao.updatePrize(prize);
		}
		
		@Test
		public void fun3() throws Exception{
			IPrizeDao prizedao = new PrizeDao();
			prizedao.deletePrize("081ff2cc7f224a78b09b96c8fd56cbcb");
		}
		
		@Test
		public void fun4() throws Exception{
			IPrizeDao prizedao = new PrizeDao();
			List<Prize> prize = prizedao.selectAll();
			
			for(Prize p:prize){
				System.out.println(p);
			}
		}
		
		@Test
		public void fun5() throws Exception{
			IPrizeDao prizedao = new PrizeDao();
			Prize prize = prizedao.selectOne("554ca22c7f9346a380459bd3c16e217a");
			System.out.println(prize);
		}
		
}
