package org.biswajit.data.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EstUserLocation {

	@Column(name="theatre")
	private Integer theatre;

	@Column(name="country")
	private String country;
	
	@Column(name="province")
	private String province;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="phoneNum")
	private String phoneNum;
	
	public EstUserLocation(){}
	
	public Integer getTheatre() {
		return theatre;
	}
	public void setTheatre(Integer theatre) {
		this.theatre = theatre;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EstVendorLocation [theatre=").append(theatre)
				.append(", country=").append(country).append(", city=")
				.append(city).append("]");
		return builder.toString();
	}
	
	
}
