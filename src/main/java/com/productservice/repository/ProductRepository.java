package com.productservice.repository;

import com.productservice.enity.Product;
import org.springframework.data.repository.CrudRepository;
public interface ProductRepository extends CrudRepository<Product,Integer> {
}
