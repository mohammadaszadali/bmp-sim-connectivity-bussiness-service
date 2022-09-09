package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.util.concurrent.Service;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"type",
	"service"	
})
public class ServiceRelationship implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2958396470872692930L;

	@JsonProperty("type")
	private String type;
	
	@JsonProperty("service")
	private Service service;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "ServiceRelationship [type=" + type + ", service=" + service + "]";
	}
	
	

}
