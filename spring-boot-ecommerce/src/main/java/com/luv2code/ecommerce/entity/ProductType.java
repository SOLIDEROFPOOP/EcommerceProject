package com.luv2code.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "product_type")
@Getter
@Setter

public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="type_name")
    private String typeName;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "type")
    private Set<Product> products;
}
