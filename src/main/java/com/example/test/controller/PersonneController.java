/**
 * 
 */
package com.example.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.Personne;
import com.example.test.repository.PersonneRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author miaro
 *
 */
@RestController
@RequestMapping(path = "/api/personne")
public class PersonneController {
	
	@Autowired
	PersonneRepository personneRepository;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@GetMapping("")
	public String getAll() {
		try {
			List<Personne> personnes = new ArrayList<>();
			personneRepository.findAll().forEach(personnes::add);
			String result = objectMapper.writeValueAsString(personnes);
			
			return result;
		} catch (Exception e) {
			String exception = e+" "+e.getMessage();
			return exception;
		}
	}

}
