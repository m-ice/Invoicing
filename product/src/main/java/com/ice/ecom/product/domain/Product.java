package com.ice.ecom.product.domain;


import org.springframework.data.annotation.Id;

/**
 * @author lucky_ice
 * @version 1.0
 * @created 18-9��-2020 16:55:11
 */
public class Product {
	@org.springframework.data.annotation.Id
	private String Id;
	private String name;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product(){

	}

	public void finalize() throws Throwable {

	}

}