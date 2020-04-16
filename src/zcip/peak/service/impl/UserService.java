package zcip.peak.service.impl;

import java.util.List;

import zcip.peak.dao.IUserDao;
import zcip.peak.dao.impl.UserDao;
import zcip.peak.entity.User;
import zcip.peak.service.IUserService;

public class UserService implements IUserService{

	private IUserDao  iuserdao = new UserDao();
	@Override
	public User selectOne(String uid) {
		return iuserdao.selectOne(uid);
	}

	@Override
	public List<User> selectAll() {
		return iuserdao.selectAll();
	}

	@Override
	public void updateUser(User user) {
		iuserdao.updateUser(user);
		
	}

	@Override
	public void addUser(User user) {
		iuserdao.addUser(user);
		
	}

	@Override
	public void deleteUser(String uid) {
		iuserdao.deleteUser(uid);
		
	}
	

}
