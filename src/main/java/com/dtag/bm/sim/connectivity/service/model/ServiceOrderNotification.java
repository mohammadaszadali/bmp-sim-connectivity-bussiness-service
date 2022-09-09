package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	
	"event"
	
})

public class ServiceOrderNotification extends Notification implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8546385061810070867L;

	@JsonProperty("event")
	private ServiceOrderEvent event;

	public ServiceOrderEvent getEvent() {
		return event;
	}

	public void setEvent(ServiceOrderEvent event) {
		this.event = event;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ServiceOrderNotification [event=" + event + "]";
	}
	
	

	
}
