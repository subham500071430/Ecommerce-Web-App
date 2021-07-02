package com.foxmula.webApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderList {

@Id
private long orderid;
private String userid;
private long agentid;
private String product;
private String cname;
private String location;
private String deladdress;


public long getOrderid() {
	return orderid;
}
public void setOrderid(long orderid) {
	this.orderid = orderid;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public long getAgent_id() {
	return agentid;
}
public void setAgent_id(long agentid) {
	this.agentid = agentid;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getDeladdress() {
	return deladdress;
}
public void setDeladdress(String deladdress) {
	this.deladdress = deladdress;
}

}
