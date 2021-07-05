package com.web.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
    @Id
    @Column(name = "productId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "productCode", length = 10, nullable = false)
    private String productCode;

    @Column(name = "productTypeId", nullable = false)
    private int productTypeId;

    @Column(name = "productTypeSubId", nullable = true)
    private Integer productTypeSubId;

    @Column(name = "productName", length = 100, nullable = false)
    private String productName;

    @Column(name = "mainPictrue", length = 100, nullable = false)
    private String mainPictrue;

    @Column(name = "priceNew", nullable = false)
    private long priceNew;

    @Column(name = "priceOld")
    private long priceOld;

    @Column(name = "size", length = 100)
    private String size;

    @Column(name = "color", length = 100)
    private String color;

    @Column(name = "warrantyTime")
    private int warrantyTime;

    @Column(name = "detail", length = 500, nullable = false)
    private String detail;
}
