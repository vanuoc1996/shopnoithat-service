package com.web.shop.controller;

import com.web.shop.entity.Bill;
import com.web.shop.entity.CustomerComment;
import com.web.shop.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/bill")
@CrossOrigin(origins = "*")
@Validated
public class BillController {
    @Autowired
    IBillService billService;

    @GetMapping("get")
    public ResponseEntity<?> getAllBill() {
        List<Bill> entity = billService.getAllBill();
        return new ResponseEntity<List<Bill>>(entity, HttpStatus.OK);
    }

    @GetMapping("get/{billId}")
    public ResponseEntity<?> getOneBill(@PathVariable(name = "billId") int billId) {
        Bill entity = billService.getOneBill(billId);
        return new ResponseEntity<Bill>(entity, HttpStatus.OK);
    }
}
