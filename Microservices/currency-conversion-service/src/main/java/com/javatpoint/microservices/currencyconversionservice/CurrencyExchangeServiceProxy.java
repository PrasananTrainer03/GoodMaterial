package com.javatpoint.microservices.currencyconversionservice;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@FeignClient(name="currency-exchange-service", url="localhost:8000")
//Enabling feign
@FeignClient(name="currency-exchange-service")
//enabling ribbon
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy 
{
@GetMapping("/currency-exchange/from/{from}/to/{to}")		//where {from} and {to} are path variable
public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to); //from map to USD and to map to INR

@GetMapping("/hello")
String sayHello();
}