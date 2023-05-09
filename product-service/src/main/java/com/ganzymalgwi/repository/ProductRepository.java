package com.ganzymalgwi.repository;

import com.ganzymalgwi.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
