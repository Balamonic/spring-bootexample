package com.htcindia.repositories;

import org.springframework.data.repository.CrudRepository;

import com.htcindia.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
