package com.example.orquestacion.controller;


import com.example.orquestacion.model.Orden;
import com.example.orquestacion.model.Shipment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingService {

    @PostMapping("/shipments")
    public Shipment shipOrder(@RequestBody Orden order) {
        // Lógica para gestionar el envío de un pedido
        return null;
    }
}
