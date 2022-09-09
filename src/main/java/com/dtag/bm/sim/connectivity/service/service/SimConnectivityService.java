package com.dtag.bm.sim.connectivity.service.service;

import org.springframework.stereotype.Service;

import com.dtag.bm.sim.connectivity.service.model.ServiceOrder;
@Service
public interface SimConnectivityService {


	public ServiceOrder createsimConnctivity(ServiceOrder amlRequest);
	public ServiceOrder getsimConnctivityRequestServiceByExternalId(String Id);
	public ServiceOrder getsimConnctivityRequestServiceById(String Id);
	public void deletesimConnctivityRequestServiceByExternalId(String Id);

}
