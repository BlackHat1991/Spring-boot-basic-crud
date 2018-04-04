package com.elan.springboot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.elan.springboot.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
