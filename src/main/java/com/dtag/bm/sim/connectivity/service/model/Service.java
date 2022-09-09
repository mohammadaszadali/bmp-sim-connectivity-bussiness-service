package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"id",
	"href",
	"name",
	"serviceState",
	"place",
	"@type",
	"@schemaLocation",
	"serviceSpecification",
	"serviceCharacteristic",
	"serviceRelationship",
	"relatedParty"	
})
public class Service implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1667445073992520533L;

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("href")
	private String href;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("serviceState")
	private String serviceState;
	
	@JsonProperty("place")
	private String place;
	
	@JsonProperty("@type")
	private String type;
	
	@JsonProperty("@schemaLocation")
	private String schemaLocation;
	
	@JsonProperty("serviceSpecification")
	private ServiceSpecificationRef serviceSpecification;
	@JsonProperty("serviceCharacteristic")
	private List<ServiceCharacteristic> serviceCharacteristic;
	
	@JsonProperty("serviceRelationship")
	private List<ServiceRelationship> serviceRelationship;
	
	@JsonProperty("relatedParty")
	private List<RelatedPartyRef> relatedParty;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceState() {
		return serviceState;
	}

	public void setServiceState(String serviceState) {
		this.serviceState = serviceState;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
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

	public ServiceSpecificationRef getServiceSpecification() {
		return serviceSpecification;
	}

	public void setServiceSpecification(ServiceSpecificationRef serviceSpecification) {
		this.serviceSpecification = serviceSpecification;
	}

	public List<ServiceCharacteristic> getServiceCharacteristic() {
		return serviceCharacteristic;
	}

	public void setServiceCharacteristic(List<ServiceCharacteristic> serviceCharacteristic) {
		this.serviceCharacteristic = serviceCharacteristic;
	}

	public List<ServiceRelationship> getServiceRelationship() {
		return serviceRelationship;
	}

	public void setServiceRelationship(List<ServiceRelationship> serviceRelationship) {
		this.serviceRelationship = serviceRelationship;
	}

	public List<RelatedPartyRef> getRelatedParty() {
		return relatedParty;
	}

	public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
		this.relatedParty = relatedParty;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", href=" + href + ", name=" + name + ", serviceState=" + serviceState + ", place="
				+ place + ", type=" + type + ", schemaLocation=" + schemaLocation + ", serviceSpecification="
				+ serviceSpecification + ", serviceCharacteristic=" + serviceCharacteristic + ", serviceRelationship="
				+ serviceRelationship + ", relatedParty=" + relatedParty + "]";
	}

	
	
}
