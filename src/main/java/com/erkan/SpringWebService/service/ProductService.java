package com.erkan.SpringWebService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.erkan.SpringWebService.model.Product;

@Component
public class ProductService {
	
	public List<Product> listProducts() {
		List<Product> products = new ArrayList<Product>();

		products.add(new Product(1,"ABC","Lamba","LambaV2 furzen"));
		products.add(new Product(2,"ABCD","Lamba1","LambaV3 furzen"));
		products.add(new Product(3,"ABCE","Lamba2","LambaV4 furzen"));
		products.add(new Product(4,"ABCF","Lamba3","LambaV5 furzen"));

		return products;

	}
	
	public Product getProduct(String name){

		List<Product> products = new ArrayList<Product>();

		products.add(new Product(1,"ABC","Lamba","LambaV2 furzen"));
		products.add(new Product(2,"ABCD","Lamba1","LambaV3 furzen"));
		products.add(new Product(3,"ABCE","Lamba2","LambaV4 furzen"));
		products.add(new Product(4,"ABCF","Lamba3","LambaV5 furzen"));

		return products.stream().filter(o -> o.getCode().equals(name)).findFirst().get();

	}

	
}
