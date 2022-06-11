package ru.axl.springliquibasedemo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.axl.springliquibasedemo.entity.Product;
import ru.axl.springliquibasedemo.repositories.ProductRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {

    private ProductRepository productRepository;

    @GetMapping("/product/all")
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

}
