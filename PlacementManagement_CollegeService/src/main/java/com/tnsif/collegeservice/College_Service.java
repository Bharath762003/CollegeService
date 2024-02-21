package com.tnsif.collegeservice;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional

public class College_Service {
	@Autowired
	private College_Service_Repository repo;
	
	public List<College> listAll()
	{
		return repo.findAll();
	}
	
	public void save(College c)
	{
		repo.save(c);
	}
	
	public College get(Integer c_companyid)
	{
		return repo.findById(c_companyid).get();
	}
	public void delete(Integer c_companyid)
	{
		repo.deleteById(c_companyid);
	}

}
