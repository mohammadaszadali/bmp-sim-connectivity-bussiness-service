package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"type",
	"id"	
})
public class OrderItemRelationship implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8075921712899011761L;

	@JsonProperty("type")
	private String type;
	
	@JsonProperty("id")
	private String id;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "OrderItemRelationship [type=" + type + ", id=" + id + "]";
	}
	
	
}
