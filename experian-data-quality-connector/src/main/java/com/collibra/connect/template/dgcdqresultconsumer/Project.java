package com.collibra.connect.template.dgcdqresultconsumer;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Project implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6791847925239238479L;

	private String name;
	@Override
	public String toString() {
		return "Project [name=" + name + ", description=" + description + "]";
	}
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}