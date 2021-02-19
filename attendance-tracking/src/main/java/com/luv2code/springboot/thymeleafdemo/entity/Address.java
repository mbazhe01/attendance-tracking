package com.luv2code.springboot.thymeleafdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_address")
public class Address {
	
	private int addrId;
	private int emplId;
	private String addressLabel;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	
	
	
	public Address() {}

	public Address(int emplId, String addressLabel, String address1, String address2, String city,
			String state, String zip) {
				
		this.emplId = emplId;
		this.addressLabel = addressLabel;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="addr_id")
	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addr_id) {
		this.addrId = addr_id;
	}

	@Column(name="empl_id")
	public int getEmplId() {
		return emplId;
	}

	public void setEmplId(int empl_id) {
		this.emplId = empl_id;
	}

	@Column(name="address_label")
	public String getAddressLabel() {
		return addressLabel;
	}

	public void setAddressLabel(String address_label) {
		this.addressLabel = address_label;
	}

	@Column(name="address1")
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name="address2")
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name="city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name="state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name="zip")
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", emplId=" + emplId + ", addressLabel=" + addressLabel
				+ ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state + ", zip="
				+ zip + "]";
	}

}//eoc
