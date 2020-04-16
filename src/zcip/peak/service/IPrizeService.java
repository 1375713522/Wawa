package zcip.peak.service;

import java.util.List;

import zcip.peak.entity.Prize;

public interface IPrizeService {
	
	public Prize selectOne(String pid);
	
	public List<Prize> selectAll();
	
	public void updatePrize(Prize prize);
	
	public void addPrize(Prize prize);
	
	public void deletePrize(String pid);
}
