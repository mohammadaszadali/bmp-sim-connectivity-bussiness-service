package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({	
	"code",	
	"field",	
	"messageInformation",
	"severity",
	"correctionRequired"	
})
public class OrderItemMessage implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6783065686054892197L;

	@JsonProperty("code")
	private String code;
	
	@JsonProperty("field")
	private String field;
	
	@JsonProperty("messageInformation")
	private String messageInformation;
	
	@JsonProperty("severity")
	private String severity;
	
	@JsonProperty("correctionRequired")
	private boolean correctionRequired;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMessageInformation() {
		return messageInformation;
	}

	public void setMessageInformation(String messageInformation) {
		this.messageInformation = messageInformation;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public boolean isCorrectionRequired() {
		return correctionRequired;
	}

	public void setCorrectionRequired(boolean correctionRequired) {
		this.correctionRequired = correctionRequired;
	}


}
