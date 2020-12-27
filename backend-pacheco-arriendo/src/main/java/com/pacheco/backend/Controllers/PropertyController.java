package com.pacheco.backend.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pacheco.backend.models.entities.Property;
import com.pacheco.backend.services.interfaces.IPropertyService;
import com.pacheco.backend.utils.ResponseUtility;



@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/property")
public class PropertyController {
	
	@Autowired
	private IPropertyService service;
	
	@GetMapping("/{id}")
	public Property retrieve(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Property> list() {
		return service.findAll();
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Property create(@RequestBody Property Property) {		
		service.save(Property);
		return Property;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Property update(@RequestBody Property Property, @PathVariable Long id) {		 			
		service.save(Property);
		return Property;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	

	
	
	
	
}
