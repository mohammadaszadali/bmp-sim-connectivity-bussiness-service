package com.dtag.bm.sim.connectivity.service.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dtag.bm.sim.connectivity.service.model.ServiceOrder;

@Repository
public interface SimConnectivityRepository extends MongoRepository<ServiceOrder, String> {
	
	

}
