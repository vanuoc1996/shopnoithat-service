package com.web.shop.service.impl;

import com.web.shop.entity.Bill;
import com.web.shop.repository.BillRepository;
import com.web.shop.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BillService implements IBillService {
    @Autowired
    BillRepository billRepository;

    @Override
    public List<Bill> getAllBill() {
        return billRepository.findAll();
    }

    @Override
    public Bill getOneBill(int billId) {
        return billRepository.findById(billId).get();
    }

    @Override
    public void creatBill(Bill bill) {
        billRepository.save(bill);
    }

    @Override
    public void editBill(Bill bill) {
        billRepository.save(bill);
    }

    @Override
    public void deleteBill(int billId) {
        billRepository.deleteById(billId);
    }
}
