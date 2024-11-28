package com.washingmachine.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.washingmachine.demo.entity.WashingmachineEntity;
import com.washingmachine.demo.repo.WashingmachineRepo;

@Repository
public class WashingmachineDao{
	@Autowired
	WashingmachineRepo washingmachineRepo;
	
	public String addInfo(WashingmachineEntity washingmachineEntity) {
	washingmachineRepo.save(washingmachineEntity);
	return"data is added to db";
}
	public List<WashingmachineEntity>getAllData(){
		return washingmachineRepo.findAll();
	}
	public WashingmachineEntity getInfo(int id) {
		return washingmachineRepo.findById(id).get();	}
	public String deletecolour(int id) {
		 washingmachineRepo.deleteById(id);
		 return "Deleted Successfully";
	}
}