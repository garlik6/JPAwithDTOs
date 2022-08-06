package com.example.jpadto.controllers;

import com.example.jpadto.dtos.ProductDto;
import com.example.jpadto.entities.Product;
import com.example.jpadto.repositories.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DtoController {

    private final ProductRepository productRepository;


    public DtoController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/all")
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @GetMapping("/allDto")
    public List<ProductDto> getAllDTP() {
        return productRepository.findAllDto();
    }

}
