package com.web.shop.service;

import com.web.shop.entity.Computer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Component
@Transactional
public interface IComputerService {
    List<Computer> getAllComputers();

    public Computer findByComputerId(int computerId);

    String openComputer(int computerId);

    String closeComputer(int computerId);

    boolean isExistsById(int computerId);
}
