package zcip.peak.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import zcip.peak.bean.Utils;
import zcip.peak.dao.IPrizeDao;
import zcip.peak.entity.Prize;
import zcip.peak.entity.User;

public class PrizeDao implements IPrizeDao{
	
	private Connection con;
	private QueryRunner qr = new QueryRunner();

	@Override
	public Prize selectOne(String pid)  {
		String sql = "select * from t_prize where pid=?;";
		try{
			con=Utils.getConnection();
			Prize prize = qr.query(con,sql,new BeanHandler<Prize>(Prize.class),pid);
			return prize;
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Prize> selectAll() {
		List<Prize> list = new ArrayList<Prize>();
		String sql = "select * from t_prize";
		try{
			con=Utils.getConnection();
			list= qr.query(con,sql,new BeanListHandler<Prize>(Prize.class));
			return list;
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updatePrize(Prize prize) {
		String sql="update t_prize set pname=?,pgrade=?,pnum=?,pdesc=? where pid=?;";
		try{
			con=Utils.getConnection();
			qr.update(con,sql,prize.getPname(),prize.getPgrade(),prize.getPnum(),prize.getPdesc(),prize.getPid());
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
				try {
					if(con!=null)con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

		
	}

	@Override
	public void addPrize(Prize prize) {
		String sql="insert into t_prize(pid,pname,pgrade,pnum,pdesc) values(?,?,?,?,?)";
		try{
			con=Utils.getConnection();
			qr.update(con,sql,prize.getPid(),prize.getPname(),prize.getPgrade(),prize.getPnum(),prize.getPdesc());
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}

	@Override
	public void deletePrize(String pid) {
		String sql="delete from  t_prize where pid=?";
		try{
			con=Utils.getConnection();
			qr.update(con,sql,pid);
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

}
