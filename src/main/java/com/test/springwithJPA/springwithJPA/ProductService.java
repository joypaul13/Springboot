package com.test.springwithJPA.springwithJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProductService {
	@Autowired
	ProductRepo repo;
	
	public List<Product> displayProduct()
	{
		return repo.findAll();
	}
}
