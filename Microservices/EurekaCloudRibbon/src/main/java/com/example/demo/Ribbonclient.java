package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class Ribbonclient {

	@Autowired
	private LoadBalancerClient lba;
	
	@GetMapping(value= "/showEmploy")
	public Object[] showEmplly() throws RestClientException, IOException {
		ServiceInstance servInstance= lba.choose("eureka-client-new");
		System.out.println("HI " +servInstance.getUri());

		String baseUrl= servInstance.getUri().toString();
		//baseUrl= baseUrl + "/";

		RestTemplate restTemplate= new RestTemplate();
		ResponseEntity<String> response= null;
		
		ResponseEntity<Object[]> res=null;
		try{
			res = restTemplate.exchange(baseUrl, HttpMethod.GET,getHeaders(),Object[].class);
		//	response= restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), String.class);
		} catch (Exception ex) {
			System.out.println("Exception " +ex);
		}
		System.out.println("Output= " + res.getBody());
		return res.getBody();
	}

	@GetMapping(value= "/searchEmploy/{id}")
	public Object searchEmploy(@PathVariable int id) throws RestClientException, IOException {
		ServiceInstance servInstance= lba.choose("eureka-client-new");
		System.out.println("HI " +servInstance.getUri());

		String baseUrl= servInstance.getUri().toString();
		baseUrl= baseUrl + "/"+id;

		RestTemplate restTemplate= new RestTemplate();
		ResponseEntity<String> response= null;
		
		ResponseEntity<Object> res=null;
		try{
			res = restTemplate.exchange(baseUrl, HttpMethod.GET,getHeaders(),Object.class);
		//	response= restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), String.class);
		} catch (Exception ex) {
			System.out.println("Exception " +ex);
		}
		System.out.println("Output= " + res.getBody());
		return res.getBody();
	}

	@GetMapping(value= "/fetch/{id}")
	public String getGreetings(@PathVariable String id) throws RestClientException, IOException {
		ServiceInstance servInstance= lba.choose("greetings");
		System.out.println("HI " +servInstance.getUri());

			// http://localhost:8181
		String baseUrl= servInstance.getUri().toString();
		baseUrl= baseUrl + "/greet/welcome/"+id;

		RestTemplate restTemplate= new RestTemplate();
		ResponseEntity<String> response= null;
		
	//	ResponseEntity<Object[]> res=null;
		try{
		//	res = restTemplate.exchange(baseUrl, HttpMethod.GET,getHeaders(),Object[].class);
			response= restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), String.class);
		} catch (Exception ex) {
			System.out.println("Exception " +ex);
		}
		System.out.println("Output= " + response.getBody());
		return response.getBody();
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}