package com.mss.Inventory.entity;



import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection= "Device")
public class Device {

@Id

private long deviceId;

private String ram;
private String memory;
private String assetId;
public Device(long deviceId, String ram, String memory, String assetId, String deviceType, String processor,
		String type) {
	super();
	this.deviceId = deviceId;
	this.ram = ram;
	this.memory = memory;
	this.assetId = assetId;
	this.deviceType = deviceType;
	this.processor = processor;
	this.type = type;
}
public String getAssetId() {
	return assetId;
}
public void setAssetId(String assetId) {
	this.assetId = assetId;
}
public String getDeviceType() {
	return deviceType;
}
public void setDeviceType(String deviceType) {
	this.deviceType = deviceType;
}

private String deviceType;
private String processor;
public String getProcessor() {
	return processor;
}
public Device(long deviceId, String ram, String memory, String processor, String type) {
	super();
	this.deviceId = deviceId;
	this.ram = ram;
	this.memory = memory;
	this.processor = processor;
	this.type = type;
}
public void setProcessor(String processor) {
	this.processor = processor;
}

private String type;
public Device() {
	
}

public long getDeviceId() {
	return deviceId;
}
public void setDeviceId(long deviceId) {
	this.deviceId = deviceId;
}
public String getRam() {
	return ram;
}
public void setRam(String ram) {
	this.ram = ram;
}
public String getMemory() {
	return memory;
}
public void setMemory(String memory) {
	this.memory = memory;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Device [deviceId=" + deviceId + ", ram=" + ram + ", memory=" + memory + ", assetId=" + assetId
			+ ", deviceType=" + deviceType + ", processor=" + processor + ", type=" + type + "]";
}



	
}
