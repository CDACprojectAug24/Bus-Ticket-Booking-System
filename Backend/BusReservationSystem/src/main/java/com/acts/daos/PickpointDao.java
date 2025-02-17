package com.acts.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acts.entities.PickUpPoint;


public interface PickpointDao extends JpaRepository<PickUpPoint, Integer>{
	
}
