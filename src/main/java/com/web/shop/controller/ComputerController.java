package com.web.shop.controller;

import com.web.shop.entity.Computer;
import com.web.shop.service.IComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
@RequestMapping(value = "api/v1/computers")
@CrossOrigin(origins = "*")
@Validated
public class ComputerController {
    @Autowired
    IComputerService computerService;

    @GetMapping
    public ResponseEntity<?> getAllComputers() {
        List<Computer> entity = computerService.getAllComputers();
        return new ResponseEntity<List<Computer>>(entity, HttpStatus.OK);
    }

    @PutMapping(value ="/turnon/{id}")
    public ResponseEntity<?> openCompueter(@PathVariable int id) {
        String rs = computerService.openComputer(id);
        return new ResponseEntity<String>(rs, HttpStatus.CREATED);
    }

    @PutMapping(value ="/turnoff/{id}")
    public ResponseEntity<?> closeComputer(@PathVariable int id) {
        String rs = computerService.closeComputer(id);
        return new ResponseEntity<String>(rs, HttpStatus.CREATED);
    }
}
