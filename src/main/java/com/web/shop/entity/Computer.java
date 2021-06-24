package com.web.shop.entity;

import com.web.shop.Enum.ComputerStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Computer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Computer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "computerId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int computerId;

    @Column(name = "computerName", length = 50)
    private String computerName;

    @Column(name = "computerStatus", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private ComputerStatus computerStatus = ComputerStatus.OFFLINE;
}
