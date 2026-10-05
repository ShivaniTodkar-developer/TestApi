package com.example.TestApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int addrId;
private String city;
public int getAddrId() {
	return addrId;
}
public void setAddrId(int addrId) {
	this.addrId = addrId;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
