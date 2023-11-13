package com.jdc04.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Voter")
public class Voter {

	@jakarta.persistence.Id
	private Integer Id;
	private String name;
	private String email;
	private String phone;
	private String dob;
	private String address;
	private String state;
	private String pincode;
	private String photo;
	private String singature;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getSingature() {
		return singature;
	}
	public void setSingature(String singature) {
		this.singature = singature;
	}
	public Voter(Integer id, String name, String email, String phone, String dob, String address, String state,
			String pincode, String photo, String singature) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.address = address;
		this.state = state;
		this.pincode = pincode;
		this.photo = photo;
		this.singature = singature;
	}
	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Voter [Id=" + Id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob
				+ ", address=" + address + ", state=" + state + ", pincode=" + pincode + ", photo=" + photo
				+ ", singature=" + singature + "]";
	}



}
