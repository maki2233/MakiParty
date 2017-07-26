package com.maki.dao;

import java.util.List;

import com.maki.model.HuifuAndDianzanModel;

public interface IHuifuAndDianzanDao {
	void createTable( HuifuAndDianzanModel huifuAndDianzanModel);
	HuifuAndDianzanModel insert(HuifuAndDianzanModel huifuAndDianzanModel);
	List<HuifuAndDianzanModel> select();
}
