package com.example.repository;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Country;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class CountryRepository {

	@Autowired
	private ObjectMapper objectMapper;

	public List<Country> findAll() throws Exception {
		List<Country> result;
		ClassLoader classLoader = getClass().getClassLoader();
		result = objectMapper.readValue(
				new File(classLoader.getResource("countries.json").getFile()),
				new TypeReference<List<Country>>() {
				});
		return result;
	}
}
