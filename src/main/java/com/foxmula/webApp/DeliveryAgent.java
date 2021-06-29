package com.foxmula.webApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DeliveryAgent {

@Id
private int did;
private String dname;
private String location;

public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "DeliveryAgent [did=" + did + ", dname=" + dname + ", location=" + location + "]";
}

}
