package com.web.registration.bean;



import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


public class UserInfo {

	@NotEmpty(message="Please enter you name")
	private String name;
	
	@NotEmpty(message="Please enter the password")
	@Size(min=6, max= 12, message="password should be between 6-12 characters")
	private String password;
	
	@NotEmpty/*(message="please enter the mail id")*/
	@Email/*(message="email id format is incorrect")*/
	private String email;
	
	@NotEmpty/*(message="please enter the date of birth")*/
	private String dob;
	
	@NotEmpty/*(message="please select the proper designation")*/
	private String desgination;
	
	
	public void setName(String name) {
		this.name = name;
	}
	

	public void setPassword(String password) {
		this.password = password;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	
	
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getDob() {
		return dob;
	}
	public String getDesgination() {
		return desgination;
	}
	
}
