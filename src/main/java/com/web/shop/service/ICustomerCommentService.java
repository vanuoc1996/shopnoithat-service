package com.web.shop.service;

import com.web.shop.entity.CustomerComment;
import com.web.shop.entity.request.CustomerCommentRQ;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public interface ICustomerCommentService {
    List<CustomerComment> getAllCustomerComment();

    void creatComment(CustomerCommentRQ dto);

    void setCustomer(CustomerComment entity);

    void deleteCustomerComment();
}
