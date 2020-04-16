package zcip.peak.dao;

import java.util.List;

import zcip.peak.entity.User;

public interface IUserDao {
		
	public User selectOne(String uid);
	
	public List<User> selectAll();
	
	public void updateUser(User user);
	
	public void addUser(User user);
	
	public void deleteUser(String uid);

}
