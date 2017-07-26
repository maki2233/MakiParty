package com.maki.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.maki.dao.IHuifuAndDianzanDao;
import com.maki.model.HuifuAndDianzanModel;
import com.maki.service.IHuifuAndDianzanService;

@Service
public class HuifuAndDianzanServiceImpl implements IHuifuAndDianzanService{
	@Resource(name="HuifuAndDianzanDao")
	private IHuifuAndDianzanDao iHuifuAndDianzanDao;

	public IHuifuAndDianzanDao getiHuifuAndDianzanDao() {
		return iHuifuAndDianzanDao;
	}

	public void setiHuifuAndDianzanDao(IHuifuAndDianzanDao iHuifuAndDianzanDao) {
		this.iHuifuAndDianzanDao = iHuifuAndDianzanDao;
	}

	@Override
	public void createTable(HuifuAndDianzanModel huifuAndDianzanModel) {
		// TODO Auto-generated method stub
		iHuifuAndDianzanDao.createTable(huifuAndDianzanModel);
		
	}

	@Override
	public HuifuAndDianzanModel insert(HuifuAndDianzanModel huifuAndDianzanModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HuifuAndDianzanModel> select() {
		// TODO Auto-generated method stub
		return null;
	}

}
