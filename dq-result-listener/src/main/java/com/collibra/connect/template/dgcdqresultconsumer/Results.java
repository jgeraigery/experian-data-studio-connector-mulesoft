package com.collibra.connect.template.dgcdqresultconsumer;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
	private String externalSystemId;
	private String communityId;
	private List<Result> results;
	private List<Rules> rules;
	private List<RuleFamilies> ruleFamilies;
	private List<Project> projects;
	

	@Override
	public String toString() {
		return "Results [externalSystemId=" + externalSystemId + ", communityId=" + communityId + ", results=" + results
				+ ", rules=" + rules + ", ruleFamilies=" + ruleFamilies + ", projects=" + projects + "]";
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Rules> getRules() {
		return rules;
	}

	public void setRules(List<Rules> rules) {
		this.rules = rules;
	}

	public List<RuleFamilies> getRuleFamilies() {
		return ruleFamilies;
	}

	public void setRuleFamilies(List<RuleFamilies> ruleFamilies) {
		this.ruleFamilies = ruleFamilies;
	}

	public String getExternalSystemId() {
		return externalSystemId;
	}

	public void setExternalSystemId(String externalSystemId) {
		this.externalSystemId = externalSystemId;
	}

	public String getCommunityId() {
		return communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}
}
