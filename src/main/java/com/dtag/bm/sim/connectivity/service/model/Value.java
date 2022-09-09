package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
	"@type",	
	"@schemaLocation",
	"serviceCharacteristicValue"
	
})
public class Value implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7177109032668900983L;

	@JsonProperty("@type")
	private String type;
	
	@JsonProperty("@schemaLocation")
	private String schemaLocation;
	
	@JsonProperty("@serviceCharacteristicValue")
	private Object serviceCharacteristicValue;

	public Object getServiceCharacteristicValue() {
		return serviceCharacteristicValue;
	}

	public void setServiceCharacteristicValue(Object serviceCharacteristicValue) {
		this.serviceCharacteristicValue = serviceCharacteristicValue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSchemaLocation() {
		return schemaLocation;
	}

	public void setSchemaLocation(String schemaLocation) {
		this.schemaLocation = schemaLocation;
	}

	@Override
	public String toString() {
		return "Value [type=" + type + ", schemaLocation=" + schemaLocation + "]";
	}
	
	
}
