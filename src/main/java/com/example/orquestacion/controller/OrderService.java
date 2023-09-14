package com.example.orquestacion.controller;

import com.example.orquestacion.model.Orden;
import com.example.orquestacion.model.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderService {

    @PostMapping("/orders")
    public Orden createOrder(@RequestBody OrderRequest orderRequest) {
        // Lógica para crear un pedido y devolver los detalles
        return null;
    }
}
