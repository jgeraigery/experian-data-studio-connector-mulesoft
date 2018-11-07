package com.collibra.connect.template.dgcdqresultconsumer;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.google.common.collect.Lists;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5154389851528634120L;
	private String externalEntityId;
	private String name;
	private String description;
	private String url;
	private List<ColumnIdentifier> evaluatedColumns = Lists.newArrayList();
	private List<ColumnIdentifier> rulefamily = Lists.newArrayList();
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLastSyncDate() {
		return lastSyncDate;
	}

	public List<ColumnIdentifier> getEvaluatedColumns() {
		return evaluatedColumns;
	}

	public void setEvaluatedColumns(List<ColumnIdentifier> evaluatedColumns) {
		this.evaluatedColumns = evaluatedColumns;
	}

	public List<ColumnIdentifier> getRulefamily() {
		return rulefamily;
	}

	public void setRulefamily(List<ColumnIdentifier> rulefamily) {
		this.rulefamily = rulefamily;
	}

	public void setLastSyncDate(String lastSyncDate) {
		this.lastSyncDate = lastSyncDate;
	}

	private String note;
	private String lastSyncDate;

	public String getPredicate() {
		return predicate;
	}

	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}

	private String predicate;
	private String dimension;
	private double rowsPassed;
	private double rowsFailed;
	private double qualityScore;

	public double getLoadedRows() {
		return loadedRows;
	}

	public void setLoadedRows(double loadedRows) {
		this.loadedRows = loadedRows;
	}

	private double loadedRows;
	private String type;

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

	private String parentName;
	private String parentType;

	@Override
	public String toString() {
		return "Result [externalEntityId=" + externalEntityId + ", name=" + name + ", description=" + description
				+ ", url=" + url + ", evaluatedColumns=" + evaluatedColumns + ", rulefamily=" + rulefamily + ", note="
				+ note + ", lastSyncDate=" + lastSyncDate + ", predicate=" + predicate + ", dimension=" + dimension
				+ ", rowsPassed=" + rowsPassed + ", rowsFailed=" + rowsFailed + ", qualityScore=" + qualityScore
				+ ", loadedRows=" + loadedRows + ", type=" + type + ", parentName=" + parentName + ", parentType="
				+ parentType + ", result=" + result + ", threshold=" + threshold + ", customAttributes="
				+ customAttributes + "]";
	}

	private String result;
	private double threshold;

	public double getRowsPassed() {
		return rowsPassed;
	}

	public void setRowsPassed(double rowsPassed) {
		this.rowsPassed = rowsPassed;
	}

	public double getRowsFailed() {
		return rowsFailed;
	}

	public void setRowsFailed(double rowsFailed) {
		this.rowsFailed = rowsFailed;
	}

	public double getQualityScore() {
		return qualityScore;
	}

	public void setQualityScore(double qualityScore) {
		this.qualityScore = qualityScore;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public double getThreshold() {
		return threshold;
	}

	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}

	private List<CustomAttribute> customAttributes = Lists.newArrayList();

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

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public List<CustomAttribute> getCustomAttributes() {
		return customAttributes;
	}

	public void setCustomAttributes(List<CustomAttribute> customAttributes) {
		this.customAttributes = customAttributes;
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
}