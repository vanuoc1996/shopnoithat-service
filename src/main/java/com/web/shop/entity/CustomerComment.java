package com.web.shop.entity;

import com.web.shop.Enum.CustomerResult;
import com.web.shop.Enum.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Customer_Comment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerComment implements Serializable {
    @Id
    @Column(name = "CustomerID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CustomerID;

    @Column(name = "Full_Name", length = 50, nullable = false)
    private String fullName;

    @Column(name = "Gmail", length = 50, nullable = false)
    private String gmail;

    @Column(name = "Phone", length = 50, nullable = false)
    private String phone;

    @Column(name = "Address", length = 50, nullable = false)
    private String address;

    @Column(name = "Comment", length = 500)
    private String comment;

    @Column(name = "Status", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private CustomerStatus customerStatus = CustomerStatus.wait;

    @Column(name = "Result", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private CustomerResult customerResult = CustomerResult.notcare;

    @Column(name = "Note", length = 500)
    private String Note;

    public CustomerComment(String fullName, String gmail, String phone, String address, String comment) {
        this.fullName = fullName;
        this.gmail = gmail;
        this.phone = phone;
        this.address = address;
        this.comment = comment;
    }
}
