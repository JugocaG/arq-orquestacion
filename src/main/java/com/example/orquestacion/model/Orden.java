package com.example.orquestacion.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Orden {
    private String orderId;
    private String productId;
    private int quantity;

    public Orden(String orderId, String productId, int quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }
}
