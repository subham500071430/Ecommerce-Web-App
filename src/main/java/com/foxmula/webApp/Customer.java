package com.foxmula.webApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    
	@Id
	private String cname;
	private long cid;
	private String address;
	private long phone;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", address=" + address + ", phone=" + phone + "]";
	}	
}
