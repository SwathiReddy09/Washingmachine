package com.washingmachine.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.washingmachine.demo.entity.WashingmachineEntity;
import com.washingmachine.demo.service.WashingmachineService;



@RestController
public class WashingmachineController {
@Autowired
WashingmachineService washingmachineService;

@PostMapping(value="/add") 
public String addInfo(@RequestBody WashingmachineEntity washingmachineEntity) {
return washingmachineService.addInfo(washingmachineEntity);
}

@GetMapping(value="/display")
public List<WashingmachineEntity>getAllData(){
return washingmachineService.getAllData();
}
@GetMapping(value="/display/{id}")
public WashingmachineEntity getInfo(@PathVariable int id) {
	return washingmachineService.getInfo(id);
}
}