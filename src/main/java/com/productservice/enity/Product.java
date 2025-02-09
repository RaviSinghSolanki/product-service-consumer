package com.productservice.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "product")
public class Product {
    @Id
    @Column(name="product_id")
    private String productId;
    @Column(name="online_from")
    private LocalDateTime onlinefrom;
    @Column(name = "online_to")
    private LocalDateTime onlineTo;
    @Column(name="created_on",updatable = false)
    private LocalDateTime createdOn;
    @Column(name = "updated_on")
    private LocalDateTime updatedOn;
    @Column(name="product_name")
    private String name;
    @Column(name= "category")
    private String category;
    @Column(name= "color")
    private String color;
}
