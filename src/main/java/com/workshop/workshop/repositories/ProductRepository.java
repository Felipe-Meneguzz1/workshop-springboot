package com.workshop.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
