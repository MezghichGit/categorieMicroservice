package com.sip.ams;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class CategorieServiceApplication {

	@Value("${cat}")
	private String nomCategorie;
	public static void main(String[] args) {
		SpringApplication.run(CategorieServiceApplication.class, args);
	}
	
	@RequestMapping("/cat")
	public String getCategorie()
	{
		return  "Categorie = "+nomCategorie;
	}

}
