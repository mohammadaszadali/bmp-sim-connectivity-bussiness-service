package com.dtag.bm.sim.connectivity.service.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dtag.bm.sim.connectivity.service.constants.SimConnectivityConstants;
import com.dtag.bm.sim.connectivity.service.dao.SimConnectivityRepository;
import com.dtag.bm.sim.connectivity.service.model.ServiceOrder;
import com.fasterxml.uuid.Generators;

@Service
public class SimConnectivityServiceImpl implements SimConnectivityService {

	private static Logger logger = LoggerFactory.getLogger(SimConnectivityServiceImpl.class);
	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	SimConnectivityRepository simConnectivityRepository;

	@Value("${simConnctivityURL}")
	private String simConnctivity;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ServiceOrder createsimConnctivity(ServiceOrder simConnctivityRequest) {
		
		UUID uuid = Generators.timeBasedGenerator().generate();
		simConnctivityRequest.setId(uuid.toString());
		simConnctivityRequest.setState("Acknowledged");
		simConnctivityRequest.setStartDate("");
		
		
		// setting completion date as system today's date
		Date date = new Date();
		DateFormat formatter = new SimpleDateFormat(SimConnectivityConstants.DATE_FORMAT);
		formatter.setTimeZone(TimeZone.getTimeZone(SimConnectivityConstants.TIMEZONE));
		simConnctivityRequest.setCompletionDate(formatter.format(date));

		mongoTemplate.save(simConnctivityRequest);
		return simConnctivityRequest;
	}

	@Override
	public ServiceOrder getsimConnctivityRequestServiceByExternalId(String Id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("externalId".trim()).is(Id.trim()));
		return mongoTemplate.findOne(query, ServiceOrder.class);
	}
	
	
	@Override
	public ServiceOrder getsimConnctivityRequestServiceById(String Id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id".trim()).is(Id.trim()));
		return mongoTemplate.findOne(query, ServiceOrder.class);
	}


	@Override
	public void deletesimConnctivityRequestServiceByExternalId(String Id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("externalId".trim()).is(Id.trim()));
		mongoTemplate.remove(query, ServiceOrder.class);
	}

	
	
	


}
