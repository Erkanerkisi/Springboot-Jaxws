package com.erkan.SpringWebService.endpoints;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erkan.SpringWebService.model.Product;
import com.erkan.SpringWebService.service.ProductService;

@Service
@WebService
public class ProductEndpoint {
	
	@Autowired
	ProductService pService;
	
	@WebMethod(operationName = "getProducts")
	public List<Product> getProducts() {
		
		return pService.listProducts();
	}
	
	@WebMethod(operationName = "getProduct")
	public Product getProduct(@WebParam String name) {
		
		return pService.getProduct(name);
	}
	

}
