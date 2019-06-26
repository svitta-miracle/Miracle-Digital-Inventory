package com.mss.Inventory.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Assets")
public class Assets {
private String assetId;
private String assetType;
private int quantity;
public String getAssetId() {
	return assetId;
}
public void setAssetId(String assetId) {
	this.assetId = assetId;
}
public String getAssetType() {
	return assetType;
}
public void setAssetType(String assetType) {
	this.assetType = assetType;
}
public int getQuantity() {
	return quantity;
}
public Assets(String assetId, String assetType, int quantity) {
	super();
	this.assetId = assetId;
	this.assetType = assetType;
	this.quantity = quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Assets [assetId=" + assetId + ", assetType=" + assetType + ", quantity=" + quantity + "]";
}
}
