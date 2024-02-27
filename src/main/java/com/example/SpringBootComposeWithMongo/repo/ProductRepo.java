package com.example.SpringBootComposeWithMongo.repo;

import com.example.SpringBootComposeWithMongo.enttiy.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, Integer> {
}
