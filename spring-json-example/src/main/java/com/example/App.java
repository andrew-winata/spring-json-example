package com.example;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Country;
import com.example.repository.CountryRepository;

public class App {

	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");
			CountryRepository countryRepository = (CountryRepository) context.getBean("countryRepository");

			List<Country> countries = countryRepository.findAll();
			System.out.println(countries);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
