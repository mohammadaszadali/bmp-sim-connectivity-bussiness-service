package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"serviceOrder"
	
})
public class ServiceOrderEvent implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8546385061810070867L;
	
	@JsonProperty("serviceOrder")
	private ServiceOrder serviceOrder;

	public ServiceOrder getServiceOrder() {
		return serviceOrder;
	}

	public void setServiceOrder(ServiceOrder serviceOrder) {
		this.serviceOrder = serviceOrder;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ServiceOrderEvent [serviceOrder=" + serviceOrder + "]";
	}
	
	
}
