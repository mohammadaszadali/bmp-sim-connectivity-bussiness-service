package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "orderMessage", "id", "action", "state", "percentProgress", "@baseType", "@type",
		"@schemaLocation", "appointment", "orderItemRelationship", "service", "orderItemMessage" })
public class ServiceOrderItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7435692637748540265L;

	@JsonProperty("orderMessage")
	private List<OrderItemMessage> orderMessage;

	@JsonProperty("id")
	private String id;

	@JsonProperty("action")
	private String action;

	@JsonProperty("state")
	private String state;

	@JsonProperty("percentProgress")
	private String percentProgress;

	@JsonProperty("@baseType")
	private String baseType = "ServiceOrderItem";

	@JsonProperty("@type")
	private String type;

	@JsonProperty("@schemaLocation")
	private String schemaLocation;

	@JsonProperty("appointment")
	private AppointmentRef appointment;

	@JsonProperty("orderItemRelationship")
	private List<OrderItemRelationship> orderItemRelationship;

	@JsonProperty("service")
	private Service service;

	@JsonProperty("orderItemMessage")
	private List<OrderItemMessage> orderItemMessage;

	public String getPercentProgress() {
		return percentProgress;
	}

	public void setPercentProgress(String percentProgress) {
		this.percentProgress = percentProgress;
	}

	public List<OrderItemMessage> getOrderMessage() {
		return orderMessage;
	}

	public void setOrderMessage(List<OrderItemMessage> orderMessage) {
		this.orderMessage = orderMessage;
	}

	public List<OrderItemMessage> getOrderItemMessage() {
		return orderItemMessage;
	}

	public void setOrderItemMessage(List<OrderItemMessage> orderItemMessage) {
		this.orderItemMessage = orderItemMessage;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public AppointmentRef getAppointment() {
		return appointment;
	}

	public void setAppointment(AppointmentRef appointment) {
		this.appointment = appointment;
	}

	public List<OrderItemRelationship> getOrderItemRelationship() {
		return orderItemRelationship;
	}

	public void setOrderItemRelationship(List<OrderItemRelationship> orderItemRelationship) {
		this.orderItemRelationship = orderItemRelationship;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}
