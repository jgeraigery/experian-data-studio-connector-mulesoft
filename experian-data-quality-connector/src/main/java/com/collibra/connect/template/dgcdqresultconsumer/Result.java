package com.collibra.connect.template.dgcdqresultconsumer;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.google.common.collect.Lists;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	private String externalEntityId;
	private String name;
	private String description;
	private String note;
	private String dataQualityRuleName;
	private String predicate;

	private String dimension;

	private List<ColumnIdentifier> evaluatedColumns = Lists.newArrayList();

	private long rowsPassed;
	private long rowsFailed;
	private long totalRows;	
	private double qualityScore;
	private Boolean result;
	private double threshold;
	private long lastRunDate;

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

	public List<ColumnIdentifier> getEvaluatedColumns() {
		return evaluatedColumns;
	}

	public void setEvaluatedColumns(List<ColumnIdentifier> evaluatedColumns) {
		this.evaluatedColumns = evaluatedColumns;
	}

	public Boolean isResult() {
		return result;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public long getRowsPassed() {
		return rowsPassed;
	}

	public void setRowsPassed(long rowsPassed) {
		this.rowsPassed = rowsPassed;
	}

	public long getRowsFailed() {
		return rowsFailed;
	}

	public void setRowsFailed(long rowsFailed) {
		this.rowsFailed = rowsFailed;
	}

	public double getQualityScore() {
		return qualityScore;
	}

	public void setQualityScore(double qualityScore) {
		this.qualityScore = qualityScore;
	}

	public double getThreshold() {
		return threshold;
	}

	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}

	public long getLastRunDate() {
		return lastRunDate;
	}

	public void setLastRunDate(long lastRunDate) {
		this.lastRunDate = lastRunDate;
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

	public String getDataQualityRuleName() {
		return dataQualityRuleName;
	}

	public void setDataQualityRuleName(String dataQualityRuleName) {
		this.dataQualityRuleName = dataQualityRuleName;
	}

	public String getPredicate() {
		return predicate;
	}

	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}

	public long getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(long totalRows) {
		this.totalRows = totalRows;
	}
}