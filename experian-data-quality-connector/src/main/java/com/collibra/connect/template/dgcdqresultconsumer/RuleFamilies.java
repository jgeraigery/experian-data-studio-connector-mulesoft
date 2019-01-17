package com.collibra.connect.template.dgcdqresultconsumer;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.google.common.collect.Lists;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleFamilies implements Serializable{
	@Override
	public String toString() {
		return "RuleFamilies [externalEntityId=" + externalEntityId + ", name=" + name + ", descriptiveExample="
				+ descriptiveExample + ", url=" + url + ", description=" + description + ", note=" + note
				+ ", predicate=" + predicate + ", dimension=" + dimension + ", type=" + type + ", parentName="
				+ parentName + ", parentType=" + parentType + ", members=" + members + ", customAttributes="
				+ customAttributes + "]";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -659096596302407241L;

	private String externalEntityId;
	private String name;
	private String descriptiveExample;
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescriptiveExample() {
		return descriptiveExample;
	}
	public void setDescriptiveExample(String descriptiveExample) {
		this.descriptiveExample = descriptiveExample;
	}
	public String getExternalEntityId() {
		return externalEntityId;
	}
	public void setExternalEntityId(String externalEntityId) {
		this.externalEntityId = externalEntityId;
	}
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getPredicate() {
		return predicate;
	}
	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getParentType() {
		return parentType;
	}
	public void setParentType(String parentType) {
		this.parentType = parentType;
	}
	public List<ColumnIdentifier> getMembers() {
		return members;
	}
	public void setMembers(List<ColumnIdentifier> members) {
		this.members = members;
	}
	public List<CustomAttribute> getCustomAttributes() {
		return customAttributes;
	}
	public void setCustomAttributes(List<CustomAttribute> customAttributes) {
		this.customAttributes = customAttributes;
	}
	private String description;
	private String note;
	private String predicate;
	private String dimension;
	private String type;
	private String parentName;
	private String parentType;
	private List<ColumnIdentifier> members = Lists.newArrayList();
	private List<CustomAttribute> customAttributes = Lists.newArrayList();
}