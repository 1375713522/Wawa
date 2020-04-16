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
import zcip.peak.dao.IAdminDao;
import zcip.peak.entity.Admin;
import zcip.peak.entity.User;

public class AdminDao implements IAdminDao{
	
	private Connection con;
	private QueryRunner qr = new QueryRunner();

	@Override
	public Admin selectOne(String aid)  {
		String sql = "select * from t_admin where aid=?;";
		try{
			con=Utils.getConnection();
			Admin admin = qr.query(con,sql,new BeanHandler<Admin>(Admin.class),aid);
			return admin;
			
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
	public List<Admin> selectAll() {
		List<Admin> list = new ArrayList<Admin>();
		String sql = "select * from t_admin";
		try{
			con=Utils.getConnection();
			list= qr.query(con,sql,new BeanListHandler<Admin>(Admin.class));
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
	public void updateAdmin(Admin admin) {
		String sql="update t_admin set ausername=?,apassword=? where aid=?;";
		try{
			con=Utils.getConnection();
			qr.update(con,sql,admin.getAusername(),admin.getApassword(),admin.getAid());
			
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
	public void addAdmin(Admin admin) {
		String sql="insert into t_admin(aid,ausername,apassword) values(?,?,?)";
		try{
			con=Utils.getConnection();
			qr.update(con,sql,admin.getAid(),admin.getAusername(),admin.getApassword());
			
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
	public void deleteAdmin(String aid) {
		String sql="delete from  t_admin where aid=?";
		try{
			con=Utils.getConnection();
			qr.update(con,sql,aid);
			
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
	public Admin selectAusername(Admin admin) {
//		System.out.println(admin.getAusername()+"---"+admin.getApassword());
		String sql = "select * from t_admin where ausername=?;";
		try{
			con=Utils.getConnection();
			Admin a = qr.query(con,sql,new BeanHandler<Admin>(Admin.class),admin.getAusername());
			return a;
			
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
	public Admin selectAdmin(Admin admin) {
		String sql = "select * from t_admin where ausername=? and apassword=?;";
		try{
			con=Utils.getConnection();
			Admin a = qr.query(con,sql,new BeanHandler<Admin>(Admin.class),admin.getAusername(),admin.getApassword());
			return a;
			
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
	public String selectMail(String aMail) {
		String sql = "select aid from t_admin where amail=?";
		try{
			con=Utils.getConnection();
			String str = qr.query(con,sql,new ScalarHandler<String>(),aMail);
			return str;
			
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

}
