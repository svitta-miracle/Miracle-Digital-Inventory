package com.mss.Inventory.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Software")
public class Software {
	private String licenseId;
	private String version;
	private String softwareName;
	public String getLicenseId() {
		return licenseId;
	}
	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	@Override
	public String toString() {
		return "Software [licenseId=" + licenseId + ", version=" + version + ", softwareName=" + softwareName + "]";
	}
	public Software(String licenseId, String version, String softwareName) {
		super();
		this.licenseId = licenseId;
		this.version = version;
		this.softwareName = softwareName;
	}
	

}
