package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"id",
	"href",
	"@referredType"	
})
public class AppointmentRef implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2212552217196143137L;

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("href")
	private String href;
	
	@JsonProperty("@referredType")
	private String referredType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getReferredType() {
		return referredType;
	}

	public void setReferredType(String referredType) {
		this.referredType = referredType;
	}

	@Override
	public String toString() {
		return "AppointmentRef [id=" + id + ", href=" + href + ", referredType=" + referredType + "]";
	}
	
	
}
