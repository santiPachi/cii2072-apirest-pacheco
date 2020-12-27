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

import com.pacheco.backend.models.entities.Lessee;
import com.pacheco.backend.services.interfaces.ILesseeService;
import com.pacheco.backend.utils.ResponseUtility;



@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/lessee")
public class LesseeController {
	
	@Autowired
	private ILesseeService service;
	
	@GetMapping("/{id}")
	public Lessee retrieve(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Lessee> list() {
		return service.findAll();
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Lessee create(@RequestBody Lessee Lessee) {		
		service.save(Lessee);
		return Lessee;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Lessee update(@RequestBody Lessee Lessee, @PathVariable Long id) {		 			
		service.save(Lessee);
		return Lessee;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	
	@GetMapping("/search/lastname/{lastName}")	
	public ResponseUtility listByLastName(@PathVariable String lastName) {
		Lessee st = service.findByLastName(lastName);
		if(st == null) {
			return new ResponseUtility("Lessee not found", HttpStatus.NOT_FOUND, null);
		}
		return new ResponseUtility("Lessee found", HttpStatus.OK, st);		
	}
	
	
	
	
}
