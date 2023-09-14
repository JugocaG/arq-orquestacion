package com.example.orquestacion.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shipment {
    private String shipmentId;
    private String orderId;
    private String status;

    public Shipment(String shipmentId, String orderId, String status) {
        this.shipmentId = shipmentId;
        this.orderId = orderId;
        this.status = status;
    }
}
