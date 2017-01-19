package com.bean;

import com.interfacee.Face;

public class HelloWorld implements Face{

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
