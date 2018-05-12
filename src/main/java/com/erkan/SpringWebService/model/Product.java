package com.erkan.SpringWebService.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Product {

	public Product(int id, String code,String name,String def) {
		setCode(code);
		setDefinition(def);
		setId(id);
		setName(name);
	}
	
	int id;
	String code;
	String name;
	String definition;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}


}
