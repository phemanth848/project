package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.interfacee.Face;

public class Client {
	
	public static void main(String args[]){
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		Face rfname= (Face) context.getBean("hello");
		System.out.println(rfname.getMessage());
	}

}
