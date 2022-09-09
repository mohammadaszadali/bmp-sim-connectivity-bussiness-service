package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@id",
    "@schemaLocation"	   
})
public class TargetServiceSchema implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8281794787855904160L;

	@JsonProperty("@id")
	private String type;
	
	@JsonProperty("@schemaLocation")
	private String schemaLocation;

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
		return "TargetServiceSchema [type=" + type + ", schemaLocation=" + schemaLocation + "]";
	}
	
	
}
