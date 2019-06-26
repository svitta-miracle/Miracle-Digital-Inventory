package com.mss.Inventory.entity;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection ="UserAssetMapping")
public class UserAssetMapping {
	private String hubbleId;
	
	private String deviceId;
	
	private String licenseId;
	
	private String ipAddress;
	public String getHubbleId() {
		return hubbleId;
	}
	public void setHubbleId(String hubbleId) {
		this.hubbleId = hubbleId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	@Override
	public String toString() {
		return "UserAssetMapping [hubbleId=" + hubbleId + ", deviceId=" + deviceId + ", licenseId=" + licenseId
				+ ", ipAddress=" + ipAddress + "]";
	}
	public UserAssetMapping(String hubbleId, String deviceId, String licenseId, String ipAddress) {
		super();
		this.hubbleId = hubbleId;
		this.deviceId = deviceId;
		this.licenseId = licenseId;
		this.ipAddress = ipAddress;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getLicenseId() {
		return licenseId;
	}
	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	

}
