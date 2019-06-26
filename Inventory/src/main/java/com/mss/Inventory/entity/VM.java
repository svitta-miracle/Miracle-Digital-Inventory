package com.mss.Inventory.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "VM")
public class VM {
	@Id
	private String assetId;
	private String ipAddress;
	private String hostName;
	public String getAssetId() {
		return assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	@Override
	public String toString() {
		return "VM [assetId=" + assetId + ", ipAddress=" + ipAddress + ", hostName=" + hostName + "]";
	}
	public VM(String assetId, String ipAddress, String hostName) {
		super();
		this.assetId = assetId;
		this.ipAddress = ipAddress;
		this.hostName = hostName;
	}
	

}
