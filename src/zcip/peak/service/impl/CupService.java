package zcip.peak.service.impl;

import java.util.List;

import zcip.peak.dao.ICupDao;
import zcip.peak.dao.impl.CupDao;
import zcip.peak.entity.Cup;
import zcip.peak.service.ICupService;

public class CupService implements ICupService {
	
	private ICupDao icupdao = new CupDao();

	@Override
	public Cup selectOne(String cid) {
		return icupdao.selectOne(cid);
	}

	@Override
	public List<Cup> selectAll() {
		return icupdao.selectAll();
	}

	@Override
	public void updateCup(Cup cup) {
		icupdao.updateCup(cup);
		
	}

	@Override
	public void addCup(Cup cup) {
		icupdao.addCup(cup);
		
	}

	@Override
	public void deleteCup(String cid) {
		icupdao.deleteCup(cid);
		
	}
	
	@Override
	public boolean selectUid(String uid) {
       return icupdao.selectUid(uid);
	}
	
	@Override
	public boolean selectPid(String pid) {
       return icupdao.selectPid(pid);
	}
	
	@Override
	public List<Cup> selectU(String uid) {
		return icupdao.selectU(uid);
	}


	
}
