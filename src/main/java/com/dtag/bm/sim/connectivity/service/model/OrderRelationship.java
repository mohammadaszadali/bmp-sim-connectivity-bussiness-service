package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"href",
	"id",
	"type"	,
	"@referredType"
})
public class OrderRelationship implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6373456769248057219L;

	@JsonProperty("href")
	private String href;
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("@referredType")
	private String referredType;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReferredType() {
		return referredType;
	}

	public void setReferredType(String referredType) {
		this.referredType = referredType;
	}

	@Override
	public String toString() {
		return "OrderRelationship [href=" + href + ", id=" + id + ", type=" + type + ", referredType=" + referredType
				+ "]";
	}
	
	
}
