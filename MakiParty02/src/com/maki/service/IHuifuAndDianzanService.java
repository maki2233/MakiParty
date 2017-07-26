package com.maki.service;

import java.util.List;

import com.maki.model.HuifuAndDianzanModel;

public interface IHuifuAndDianzanService {
	void createTable(HuifuAndDianzanModel huifuAndDianzanModel);
	HuifuAndDianzanModel insert(HuifuAndDianzanModel huifuAndDianzanModel);
	List<HuifuAndDianzanModel> select();
}
