package com.eureka.ribbon.ctrl;

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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class Ribbonclient {

	@Autowired
	private LoadBalancerClient lba;

	@GetMapping(value= "/fetch")
	public String getGreetings() throws RestClientException, IOException {
		ServiceInstance servInstance= lba.choose("greetings");
		System.out.println(servInstance.getUri());

		String baseUrl= servInstance.getUri().toString();
		baseUrl= baseUrl + "/greet/welcome/en";

		RestTemplate restTemplate= new RestTemplate();
		ResponseEntity<String> response= null;
		try{
			response= restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), String.class);
		} catch (Exception ex) {
			System.out.println(ex);
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