package com.ganzymalgwi.productservice.repository;

import com.ganzymalgwi.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
