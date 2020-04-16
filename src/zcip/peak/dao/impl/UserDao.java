package zcip.peak.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import zcip.peak.bean.Utils;
import zcip.peak.dao.IUserDao;
import zcip.peak.entity.User;

public class UserDao implements IUserDao{
	
	private Connection con;
	private QueryRunner qr = new QueryRunner();

	@Override
	public User selectOne(String uid)  {
		String sql = "select * from t_user where uid=?;";
		try{
			con=Utils.getConnection();
			User user = qr.query(con,sql,new BeanHandler<User>(User.class),uid);
			return user;
			
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
	public List<User> selectAll() {
		List<User> list = new ArrayList<User>();
		String sql = "select * from t_user";
		try{
			con=Utils.getConnection();
			list= qr.query(con,sql,new BeanListHandler<User>(User.class));
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
	public void updateUser(User user) {
		String sql="update t_user set uname=?,utel=?,uemail=?,uage=?,usex=? where uid=?;";
		try{
			con=Utils.getConnection();
			qr.update(con,sql,user.getUname(),user.getUtel(),user.getUemail(),user.getUage(),user.getUsex(),user.getUid());
			
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
	public void addUser(User user) {
		String sql="insert into t_user(uid,uname,utel,uemail,uage,usex) values(?,?,?,?,?,?)";
		try{
			con=Utils.getConnection();
			qr.update(con,sql,user.getUid(),user.getUname(),user.getUtel(),user.getUemail(),user.getUage(),user.getUsex());
			
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
	public void deleteUser(String uid) {
		String sql="delete from  t_user where uid=?";
		try{
			con=Utils.getConnection();
			qr.update(con,sql,uid);
			
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
