package com.web.shop.entity;

import com.web.shop.Enum.StatusVote;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Vote")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vote implements Serializable {
    @Id
    @Column(name = "voteId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int voteId;

    @Column(name = "mail", length = 50)
    private String mail;

    @Column(name = "phone", length = 50, nullable = false)
    private String phone;

    @Column( name = "productId",nullable = false)
    private int productId;

    @Column(name = "rate", nullable = false)
    private int rate;

    @Column(name = "comment", length = 50, nullable = false)
    private String comment;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private StatusVote stausVote = StatusVote.disagree;

}
