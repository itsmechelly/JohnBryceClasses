package com.johnbryce.beans;

import org.springframework.stereotype.Component;

@Component
public class MySingleton {

	public MySingleton() {
		System.out.println("MySingleton - CTOR IN ACTION !!!");
	}
}
