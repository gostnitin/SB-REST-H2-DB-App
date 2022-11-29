package tech.nitin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.nitin.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
