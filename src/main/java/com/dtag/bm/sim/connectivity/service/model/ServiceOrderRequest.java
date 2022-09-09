package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "externalId",
    "priority",
    "description",
    "category",
    "relatedPartyRef",
    "orderRelationship",
    "orderItem",
    "@referredType"
    
})
//@Document(collection = "AMLRequest")
public class ServiceOrderRequest implements Serializable {
	
	
	private static final long serialVersionUID = -4395597729497890379L;
	
		@JsonProperty("externalId")
		private String externalId;
		
		@JsonProperty("priority")
		 private String priority;
		
		@JsonProperty("description")
		 private String description;
		
		@JsonProperty("category")
		 private String category;		
		
		@JsonProperty("relatedParty")
		 private List <RelatedPartyRef> relatedParty;
		
		@JsonProperty("orderRelationship")
		 private String orderRelationship = null;
		
		@JsonProperty("orderItem")
		 private List <ServiceOrderItem> orderItem;
		
		 // Getter Methods 

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

		public List<RelatedPartyRef> getRelatedParty() {
			return relatedParty;
		}

		public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
			this.relatedParty = relatedParty;
		}

		public String getOrderRelationship() {
			return orderRelationship;
		}

		public void setOrderRelationship(String orderRelationship) {
			this.orderRelationship = orderRelationship;
		}

		public List<ServiceOrderItem> getOrderItem() {
			return orderItem;
		}

		public void setOrderItem(List<ServiceOrderItem> orderItem) {
			this.orderItem = orderItem;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "ServiceOrderRequest [externalId=" + externalId + ", priority=" + priority + ", description="
					+ description + ", category=" + category + ", relatedParty=" + relatedParty + ", orderRelationship="
					+ orderRelationship + ", orderItem=" + orderItem + "]";
		}
		 
		

		 
		 
		 
}
