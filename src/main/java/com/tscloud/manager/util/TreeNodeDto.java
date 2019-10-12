package com.tscloud.manager.util;

public class TreeNodeDto {

	private String id;
	private String pId;
	private String name;
	public String isParent ="true";
	public boolean checked =false;
	public String icon="";
	public String isOpen;
	private String type; //1 车组级别，2车辆级别
	private String count ;
	
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getId() {
		return id;
	}
	public String getpId() {
		return pId;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsParent() {
		return isParent;
	}
	public boolean isChecked() {
		return checked;
	}
	public String getIcon() {
		return icon;
	}
	public String getIsOpen() {
		return isOpen;
	}
	public String getType() {
		return type;
	}
	public void setIsParent(String isParent) {
		this.isParent = isParent;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public void setIsOpen(String isOpen) {
		this.isOpen = isOpen;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
