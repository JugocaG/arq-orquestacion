package com.example.orquestacion.controller;
import com.example.orquestacion.model.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrchestrationService {

    @Autowired
    private CatalogService catalogService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ShippingService shippingService;

    @PostMapping("/create-order")
    public ResponseEntity<?> createOrderAndShip(@RequestBody OrderRequest orderRequest) {
        // Lógica para coordinar la creación de un pedido y el envío
        return null;
    }
}
