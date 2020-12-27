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

import com.pacheco.backend.models.entities.Lessor;
import com.pacheco.backend.services.interfaces.ILessorService;
import com.pacheco.backend.utils.ResponseUtility;



@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/lessor")
public class LessorController {
	
	@Autowired
	private ILessorService service;
	
	@GetMapping("/{id}")
	public Lessor retrieve(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Lessor> list() {
		return service.findAll();
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Lessor create(@RequestBody Lessor Lessor) {		
		service.save(Lessor);
		return Lessor;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Lessor update(@RequestBody Lessor Lessor, @PathVariable Long id) {		 			
		service.save(Lessor);
		return Lessor;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	
	@GetMapping("/search/lastname/{lastName}")	
	public ResponseUtility listByLastName(@PathVariable String lastName) {
		Lessor st = service.findByLastName(lastName);
		if(st == null) {
			return new ResponseUtility("Lessor not found", HttpStatus.NOT_FOUND, null);
		}
		return new ResponseUtility("Lessor found", HttpStatus.OK, st);		
	}
	
	
	
	
}
