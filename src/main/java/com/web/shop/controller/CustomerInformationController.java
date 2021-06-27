package com.web.shop.controller;

import com.web.shop.entity.CustomerComment;
import com.web.shop.entity.request.CustomerCommentRQ;
import com.web.shop.service.ICustomerCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/customercomment")
@CrossOrigin(origins = "*")
@Validated
public class CustomerInformationController {
    @Autowired
    ICustomerCommentService customerCommentService;

    @GetMapping("admin")
    public ResponseEntity<?> getAllCustomerInfomation() {
        List<CustomerComment> entity = customerCommentService.getAllCustomerComment();
        return new ResponseEntity<List<CustomerComment>>(entity, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> creatComment(@RequestBody CustomerCommentRQ dto) {
        customerCommentService.creatComment(dto);
        String rs = "Thông tin đã được gửi đi, đợi xét duyệt!";
        return new ResponseEntity<String>(rs, HttpStatus.OK);
    }

}
