package com.dtag.bm.sim.connectivity.service.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"author",
	"date",
	"text"	
})

public class Note implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8546385061810070867L;

	@JsonProperty("author")
	private String author;
	
	@JsonProperty("date")
	private String date;
	
	@JsonProperty("text")
	private String text;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Note [author=" + author + ", date=" + date + ", text=" + text + "]";
	}

	
}
