package mostapha.bayi.billingservice.entities;

import mostapha.bayi.billingservice.model.Product;
import jakarta.persistence.*;

@Entity
public class ProductItem {
    @Id @GeneratedValue
    private Long id;
    private long productId;
    private int quantity;
    private double price;
    @ManyToOne
    private Bill bill;

    @Transient
    private Product product;

}