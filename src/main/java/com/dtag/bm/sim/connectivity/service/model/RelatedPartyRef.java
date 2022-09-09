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
	"name",
	"@referredType"
})

public class RelatedPartyRef implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1531315073202109011L;

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("href")
	private String href;
	
	@JsonProperty("role")
	private String role;
	
	@JsonProperty("name")
	private String name;
	
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReferredType() {
		return referredType;
	}

	public void setReferredType(String referredType) {
		this.referredType = referredType;
	}

	@Override
	public String toString() {
		return "RelatedPartyRef [id=" + id + ", href=" + href + ", role=" + role + ", name=" + name + ", referredType="
				+ referredType + "]";
	}

	
}
