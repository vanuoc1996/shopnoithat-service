package com.web.shop.entity.request;

import com.web.shop.entity.CustomerComment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerCommentRQ {
    @Column(length = 50, nullable = false)
    private String fullName;

    @Column(length = 50, nullable = false)
    private String gmail;

    @Column(length = 50, nullable = false)
    private String phone;

    @Column(length = 50, nullable = false)
    private String address;

    @Column(length = 500)
    private String comment;

    public CustomerComment toEntity(){
        return new CustomerComment(fullName, gmail, phone, address, comment);
    }

}
