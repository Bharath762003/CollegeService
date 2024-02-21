package com.tnsif.collegeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

public class College_Service_Controller {
	@Autowired(required=true)
	private College_Service service;
	
	@GetMapping("/Collegeservice")
	public java.util.List<College> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/Collegeservice/{c_companyid}")
	public ResponseEntity<College> get(@PathVariable Integer c_companyid)
	{
		try
		{
			College c=service.get(c_companyid);
			return new ResponseEntity<College>(c,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/Collegeservice")
	public void add(@RequestBody College c)
	{
		service.save(c);
	}
	
	@PutMapping("/c;acementservice/{c_companyid}")
	public ResponseEntity<?> update(@RequestBody College c, @PathVariable Integer c_companyid)
	{
		College existc = service.get(c_companyid);
		service.save(existc);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/Collegeservice/{c_companyid}")
	public void delete(@PathVariable Integer c_companyid)
	{
		service.delete(c_companyid);
	}

}
