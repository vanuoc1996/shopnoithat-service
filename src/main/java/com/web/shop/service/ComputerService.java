package com.web.shop.service;

import com.web.shop.Enum.ComputerStatus;
import com.web.shop.entity.Computer;
import com.web.shop.repository.IComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ComputerService implements IComputerService {

    @Autowired
    IComputerRepository computerRepository;

    @Override
    public List<Computer> getAllComputers() {
        return computerRepository.findAll();
    }

    @Override
    public Computer findByComputerId(int computerId) {
        return computerRepository.findById(computerId).get();
    }


    @Override
    public boolean isExistsById(int computerId) {
        return computerRepository.existsById(computerId);
    }

    @Override
    public String openComputer(int computerId) {
        if (isExistsById(computerId)){
            Computer computer = findByComputerId(computerId);
            computer.setComputerStatus(ComputerStatus.ONLINE);
            return "Đã mở máy";
        }else {
            return "Máy không tồn tại!";
        }
    }

    @Override
    public String closeComputer(int computerId) {
        if (isExistsById(computerId)){
            Computer computer = findByComputerId(computerId);
            computer.setComputerStatus(ComputerStatus.OFFLINE);
            return "Đã tắt máy";
        }else {
            return "Máy không tồn tại!";
        }
    }
}
