package com.web.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Bill")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bill implements Serializable {
    @Id
    @Column(name = "billId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billId;

    @Column(name = "productId", nullable = false)
    private int productId;

    @Column(name = "purchaseDate", nullable = false)
    private Date purchaseDate;

    @Column(name = "customerName", length = 50, nullable = false)
    private String customerName;

    @Column(name = "phoneNumber", length = 12, nullable = false)
    private String phoneNumber;

    @Column(name = "adress", length = 100, nullable = false)
    private String adress;

    @Column(name = "shipMoney", nullable = false)
    private long shipMoney;

    @Column(name = "totalCost", nullable = false)
    private long totalCost;

}
