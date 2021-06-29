package com.foxmula.webApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderList {

@Id
private long tid;
private String product;
private long cid;
private String cname;
private String location;
private int did;


public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public long getTid() {
	return tid;
}
public void setTid(long tid) {
	this.tid = tid;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public long getCid() {
	return cid;
}
public void setCid(long cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "OrderList [tid=" + tid + ", product=" + product + ", cid=" + cid + ", cname=" + cname + ", location="
			+ location + ", did=" + did + "]";
}

}
