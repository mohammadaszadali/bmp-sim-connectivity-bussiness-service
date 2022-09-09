package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ 
	"id", "href", "externalId", "priority", "description", "category", "state", "orderDate",
		"requestedStartDate", "requestedCompletionDate", "completionDateTime", "startDate", "startDate",
		"@baseType", "@type", "@schemaLocation", "note", "orderItem", "orderRelationship", "relatedParty" })
@Document(collection = "SimConnectivity_Collection_Request")
public class ServiceOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -838963838099957310L;

	@JsonProperty("id")
	private String id;

	@JsonProperty("href")
	private String href;

	@JsonProperty("externalId")
	private String externalId;

	@JsonProperty("priority")
	private String priority;

	@JsonProperty("description")
	private String description;

	@JsonProperty("category")
	private String category;

	@JsonProperty("state")
	private String state;

	@JsonProperty("orderDate")
	private String orderDate;

	
	
	
	@JsonProperty("completionDateTime")
	private String completionDate;

	@JsonProperty("requestedStartDate")
	private String requestedStartDate;

	@JsonProperty("requestedCompletionDate")
	private String requestedCompletionDate;

	@JsonProperty("expectedCompletionDate")
	private String expectedCompletionDate;

	
	
	@JsonProperty("startDate") 
	private String startDate;
	 

	@JsonProperty("notificationContact")
	private String notificationContact;

	@JsonProperty("@baseType")
	private String baseType = "serviceOrder";

	@JsonProperty("@type")
	private String type;

	@JsonProperty("@schemaLocation")
	private String schemaLocation;

	@JsonProperty("note")
	private List<Note> note;

	@JsonProperty("orderItem")
	private List<ServiceOrderItem> orderItem;

	@JsonProperty("orderRelationship")
	private List<OrderRelationship> orderRelationship;

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

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}

	public String getRequestedStartDate() {
		return requestedStartDate;
	}

	public void setRequestedStartDate(String requestedStartDate) {
		this.requestedStartDate = requestedStartDate;
	}

	public String getRequestedCompletionDate() {
		return requestedCompletionDate;
	}

	public void setRequestedCompletionDate(String requestedCompletionDate) {
		this.requestedCompletionDate = requestedCompletionDate;
	}

	public String getExpectedCompletionDate() {
		return expectedCompletionDate;
	}

	public void setExpectedCompletionDate(String expectedCompletionDate) {
		this.expectedCompletionDate = expectedCompletionDate;
	}

	
	  public String getStartDate() { 
		  return startDate; 
		  }
	  
	  public void setStartDate(String startDate) { 
		  this.startDate = startDate; 
		  }
	 

	public String getNotificationContact() {
		return notificationContact;
	}

	public void setNotificationContact(String notificationContact) {
		this.notificationContact = notificationContact;
	}

	public String getBaseType() {
		return baseType;
	}

	public void setBaseType(String baseType) {
		this.baseType = baseType;
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

	public List<Note> getNote() {
		return note;
	}

	public void setNote(List<Note> note) {
		this.note = note;
	}

	public List<ServiceOrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<ServiceOrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public List<OrderRelationship> getOrderRelationship() {
		return orderRelationship;
	}

	public void setOrderRelationship(List<OrderRelationship> orderRelationship) {
		this.orderRelationship = orderRelationship;
	}

	public List<RelatedPartyRef> getRelatedParty() {
		return relatedParty;
	}

	public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
		this.relatedParty = relatedParty;
	}

	/*
	 * @Override public String toString() { return "ServiceOrder [id=" + id +
	 * ", href=" + href + ", externalId=" + externalId + ", priority=" + priority +
	 * ", description=" + description + ", category=" + category + ", state=" +
	 * state + ", orderDate=" + orderDate + ", completionDate=" + completionDate +
	 * ", requestedStartDate=" + requestedStartDate + ", requestedCompletionDate=" +
	 * requestedCompletionDate + ", expectedCompletionDate=" +
	 * expectedCompletionDate + ", startDate=" + startDate +
	 * ", notificationContact=" + notificationContact + ", baseType=" + baseType +
	 * ", type=" + type + ", schemaLocation=" + schemaLocation + ", note=" + note +
	 * ", orderItem=" + orderItem + ", orderRelationship=" + orderRelationship +
	 * ", relatedParty=" + relatedParty + "]"; }
	 * 
	 */

}
