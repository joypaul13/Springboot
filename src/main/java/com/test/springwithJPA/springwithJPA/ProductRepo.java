package com.test.springwithJPA.springwithJPA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer>
{
	
}
