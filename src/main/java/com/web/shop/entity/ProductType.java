package com.web.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ProductType")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductType implements Serializable {
    @Id
    @Column(name = "productTypeId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productTypeId;

    @Column(name = "productType", length = 100, nullable = false, unique = true)
    private String productType;
}
