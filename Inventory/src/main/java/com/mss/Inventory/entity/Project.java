package com.mss.Inventory.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="project")
public class Project {
	@Id
	private long projectId;
	private String projectName;
	String proAdmin;
	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProAdmin() {
		return proAdmin;
	}
	public void setProAdmin(String proAdmin) {
		this.proAdmin = proAdmin;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", proAdmin=" + proAdmin + "]";
	}
	public Project(long projectId, String projectName, String proAdmin) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.proAdmin = proAdmin;
	}
	
	

}
