package com.web.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ProductTypeSub")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductTypeSub {
    @Id
    @Column(name = "productTypeSubId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productTypeSubId;

    @Column(name = "productTypeId", nullable = false)
    private int productTypeId;

    @Column(name = "productTypeSub", length = 100, nullable = false, unique = true)
    private String productTypeSub;
}
