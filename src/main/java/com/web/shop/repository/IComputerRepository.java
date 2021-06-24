package com.web.shop.repository;


import com.web.shop.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComputerRepository extends JpaRepository<Computer, Integer> {
}
