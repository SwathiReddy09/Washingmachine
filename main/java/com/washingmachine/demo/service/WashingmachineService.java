package com.washingmachine.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washingmachine.demo.dao.WashingmachineDao;
import com.washingmachine.demo.entity.WashingmachineEntity;
@Service
public class WashingmachineService {
	Logger logger=LoggerFactory.getLogger(WashingmachineService.class);
@Autowired
WashingmachineDao washingmachineDao;
	public String addInfo(WashingmachineEntity washingmachineEntity) {
		return washingmachineDao.addInfo(washingmachineEntity);
	}

	public  List<WashingmachineEntity> getAllData() {
		logger.info("This method execute second");
		return washingmachineDao.getAllData();
	}

	public WashingmachineEntity getInfo(int id) {
	return washingmachineDao.getInfo(id);
	}

}
