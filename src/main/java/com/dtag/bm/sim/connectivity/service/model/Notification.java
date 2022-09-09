package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"eventId",
	"eventType",
	"eventTime",
	"fieldPath",
	"resourcePath"
})

public class Notification implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8546385061810070867L;

	@JsonProperty("eventId")
	private String eventId;
	
	@JsonProperty("eventType")
	private String eventType;
	
	@JsonProperty("eventTime")
	private String eventTime;
	
	@JsonProperty("fieldPath")
	private String fieldPath;
	
	@JsonProperty("resourcePath")
	private String resourcePath;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getFieldPath() {
		return fieldPath;
	}

	public void setFieldPath(String fieldPath) {
		this.fieldPath = fieldPath;
	}

	public String getResourcePath() {
		return resourcePath;
	}

	public void setResourcePath(String resourcePath) {
		this.resourcePath = resourcePath;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ServiceNotification [eventId=" + eventId + ", eventType=" + eventType + ", eventTime=" + eventTime
				+ ", fieldPath=" + fieldPath + ", resourcePath=" + resourcePath + "]";
	}
	
	

	
}
