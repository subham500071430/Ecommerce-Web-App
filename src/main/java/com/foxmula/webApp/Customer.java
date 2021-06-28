package com.foxmula.webApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    
	@Id
	private String cname;
	private int cid;
	private String address;
	private int phone;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", address=" + address + ", phone=" + phone + "]";
	}	
}
