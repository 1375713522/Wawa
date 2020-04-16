package zcip.peak.dao;

import java.util.List;

import zcip.peak.entity.Cup;

public interface ICupDao {
	
	public Cup selectOne(String cid);
	
	public List<Cup> selectAll();
	
	public void updateCup(Cup cup);
	
	public void addCup(Cup cup);
	
	public void deleteCup(String cid);
	
	public boolean selectUid(String uid);
	
	public boolean selectPid(String pid);
	
	public List<Cup> selectU(String uid);

}
