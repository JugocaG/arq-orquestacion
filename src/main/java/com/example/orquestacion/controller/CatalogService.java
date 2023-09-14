package com.example.orquestacion.controller;

import com.example.orquestacion.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogService {
    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable String productId) {
        // Lógica para obtener detalles del producto del catálogo
        return null;
    }
}
