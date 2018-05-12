package com.erkan.SpringWebService;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.erkan.SpringWebService.endpoints.ProductEndpoint;

@Configuration
@EnableAutoConfiguration
public class WebServiceConfig {
	
	@Autowired
    private Bus bus;
	
	@Autowired
	private ProductEndpoint pEndpoint;
 
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, pEndpoint);
        endpoint.publish("/ProductWebServices");
        return endpoint;
    }

}
