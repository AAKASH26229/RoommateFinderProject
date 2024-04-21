package com.app.finder.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UserId;

	@Column(name = "FirstName", nullable = false, length = 100)
	public String FirstName;
	
	@Column(name = "LastName", nullable = false, length = 100)
	public String LastName;
	
	@Enumerated(EnumType.STRING) // This tells Hibernate to store the enum as a string
	@Column(name = "Gender")
	private Gender gender;

	@Column(name="PhoneNumber", nullable = false, length = 15)
	public int PhoneNumber;
	
	@Column(name = "Country")
	public String Country;
	
	@Column(name = "State")
	public String State;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(Long userId, String firstName, String lastName, Gender gender, int phoneNumber, String country,
			String state) {
		super();
		UserId = userId;
		FirstName = firstName;
		LastName = lastName;
		this.gender = gender;
		PhoneNumber = phoneNumber;
		Country = country;
		State = state;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Users [UserId=" + UserId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", gender=" + gender
				+ ", PhoneNumber=" + PhoneNumber + ", Country=" + Country + ", State=" + State + "]";
	}
	
	

}
