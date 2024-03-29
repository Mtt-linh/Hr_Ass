package com.example.hr_ass.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "OrderItem")
public class OrderItem {
    @EmbeddedId
    private OderItemID id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "orderId")
    private Order order;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "productId")
    private ProductInformation product;

    @Column(name = "unitPrice")
    private Double unitPrice;

    @Column(name = "qty")
    private int qty;

    public OrderItem (Order order, ProductInformation product, Double unitPrice, int qty) {
        this.id = new OderItemID(order.getOrderId(),product.getProductId());
        this.order = order;
        this.product = product;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }
}