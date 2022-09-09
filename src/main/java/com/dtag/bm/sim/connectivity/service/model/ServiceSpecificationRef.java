package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "id",
    "href",	 
    "version",
    "name",
    "targetServiceSchema",
    "@type",
    "@schemaLocation",
    "@baseType"
})
public class ServiceSpecificationRef implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5549142095407982571L;
	@JsonProperty("id")
	private String id;
	@JsonProperty("href")
	private String href;
	@JsonProperty("version")
	private String version;
	@JsonProperty("name")
	private String name;
	@JsonProperty("targetServiceSchema")
	private String targetServiceSchema;
	public String getTargetServiceSchema() {
		return targetServiceSchema;
	}
	public void setTargetServiceSchema(String targetServiceSchema) {
		this.targetServiceSchema = targetServiceSchema;
	}
	@JsonProperty("@type")
	private String type="Service specification";
	@JsonProperty("@schemaLocation")
	private String schemaLocation;
	@JsonProperty("@baseType")
	private String baseType="ServiceSpecification";
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
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getBaseType() {
		return baseType;
	}
	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}	

	
	
}
