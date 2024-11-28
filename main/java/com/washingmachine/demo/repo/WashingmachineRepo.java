package com.washingmachine.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.washingmachine.demo.entity.WashingmachineEntity;

public interface WashingmachineRepo extends JpaRepository<WashingmachineEntity, Integer> {

}
