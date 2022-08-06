package com.example.jpadto.repositories;

import com.example.jpadto.dtos.ProductDto;
import com.example.jpadto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("""
            SELECT p FROM Product p
            """)
    List<Product> findAll();

    @Query("""
            SELECT new com.example.jpadto.dtos.ProductDto(p.id, p.name, p.price) FROM Product p
            """)
    List<ProductDto> findAllDto();
}
