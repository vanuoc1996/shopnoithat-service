package com.web.shop.service.impl;

import com.web.shop.entity.CustomerComment;
import com.web.shop.entity.request.CustomerCommentRQ;
import com.web.shop.repository.CustomerCommentRepository;
import com.web.shop.service.ICustomerCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CustomerCommentService implements ICustomerCommentService {
   @Autowired
   CustomerCommentRepository customerCommentRepository;

    @Override
    public List<CustomerComment> getAllCustomerComment() {
        return customerCommentRepository.findAll();
    }

    @Override
    public void creatComment(CustomerCommentRQ dto) {
        customerCommentRepository.save(dto.toEntity());
    }

    @Override
    public void setCustomer(CustomerComment entity) {
    }

    @Override
    public void deleteCustomerComment() {

    }
}
