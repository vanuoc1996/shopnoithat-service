package com.web.shop.service;

import com.web.shop.entity.Bill;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface IBillService {
    List<Bill> getAllBill();

    Bill getOneBill(int billId);

    void creatBill(Bill bill);

    void editBill(Bill bill);

    void deleteBill(int billId);
}
