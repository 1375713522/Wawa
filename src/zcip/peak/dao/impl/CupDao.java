package zcip.peak.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import zcip.peak.bean.Utils;
import zcip.peak.dao.ICupDao;
import zcip.peak.entity.Cup;

public class CupDao implements ICupDao{
	
	private Connection con;
	private QueryRunner qr = new QueryRunner();

	@Override
	public Cup selectOne(String cid)  {
		String sql = "select * from t_cup where cid=?;";
		try{
			con=Utils.getConnection();
			Cup cup= qr.query(con,sql,new BeanHandler<Cup>(Cup.class),cid);
			return cup;
			
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
	public List<Cup> selectAll() {
		List<Cup> list = new ArrayList<Cup>();
		String sql = "select * from t_cup";
		try{
			con=Utils.getConnection();
			list= qr.query(con,sql,new BeanListHandler<Cup>(Cup.class));
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
	public void updateCup(Cup cup) {
		String sql="update t_cup set pid=?,uid=? where cid=?;";
		try{
			con=Utils.getConnection();
			qr.update(con,sql,cup.getPid(),cup.getUid(),cup.getCid());
			
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
	public void addCup(Cup cup) {
		String sql="insert into t_cup(cid,pid,uid) values(?,?,?)";
		try{
			con=Utils.getConnection();
			qr.update(con,sql,cup.getCid(),cup.getPid(),cup.getUid());
			
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
	public void deleteCup(String cid) {
		String sql="delete from  t_cup where cid=?";
		try{
			con=Utils.getConnection();
			qr.update(con,sql,cid);
			
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
	public boolean selectUid(String uid) {
		String sql="select count(*) from t_cup where uid=?";
		try{
			con=Utils.getConnection();
			Long count = qr.query(con,sql,new ScalarHandler<Long>(),uid);
			if(count==0)return false;
			return true;
			
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
	public boolean selectPid(String pid) {
		String sql="select count(*) from t_cup where pid=?";
		try{
			con=Utils.getConnection();
			Long count = qr.query(con,sql,new ScalarHandler<Long>(),pid);

			if(count==0)return false;
			return true;
			
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
	public List<Cup> selectU(String uid) {
		List<Cup> list = new ArrayList<Cup>();
		String sql="select * from t_cup where uid=?";
		try{
			con=Utils.getConnection();
			list= qr.query(con,sql,new BeanListHandler<Cup>(Cup.class),uid);
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
	

}
