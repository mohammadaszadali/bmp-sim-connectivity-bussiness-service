package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"id",
	"href",
	"role"	,
	"@referredType",
	"@schemaLocation"
})
public class Place implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7141760583329103818L;
	@JsonProperty("id")
	private String id;
	@JsonProperty("href")
	private String href;
	@JsonProperty("role")
	private String role;
	@JsonProperty("@referredType")
	private String referredType;
	@JsonProperty("@schemaLocation")
	private String schemaLocation;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getReferredType() {
		return referredType;
	}
	public void setReferredType(String referredType) {
		this.referredType = referredType;
	}
	public String getSchemaLocation() {
		return schemaLocation;
	}
	public void setSchemaLocation(String schemaLocation) {
		this.schemaLocation = schemaLocation;
	}
	@Override
	public String toString() {
		return "Place [id=" + id + ", href=" + href + ", role=" + role + ", referredType=" + referredType
				+ ", schemaLocation=" + schemaLocation + "]";
	}
	
	
}
