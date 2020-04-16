package zcip.peak.service.impl;

import java.util.List;

import zcip.peak.dao.IPrizeDao;
import zcip.peak.dao.impl.PrizeDao;
import zcip.peak.entity.Prize;
import zcip.peak.service.IPrizeService;

public class PrizeService implements IPrizeService {
	
	private IPrizeDao iprizedao= new PrizeDao();

	@Override
	public Prize selectOne(String pid) {
		return iprizedao.selectOne(pid);
	}

	@Override
	public List<Prize> selectAll() {
		return iprizedao.selectAll();
	}

	@Override
	public void updatePrize(Prize prize) {
		iprizedao.updatePrize(prize);

	}

	@Override
	public void addPrize(Prize prize) {
		iprizedao.addPrize(prize);

	}

	@Override
	public void deletePrize(String pid) {
		iprizedao.deletePrize(pid);

	}

}
