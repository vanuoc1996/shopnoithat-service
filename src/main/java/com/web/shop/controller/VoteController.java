package com.web.shop.controller;

import com.web.shop.entity.CustomerComment;
import com.web.shop.entity.Vote;
import com.web.shop.service.IVoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/vote")
@CrossOrigin(origins = "*")
@Validated
public class VoteController {
    @Autowired
    IVoteService voteService;

    @GetMapping
    public ResponseEntity<?> getAllVoteProduct() {
        List<Vote> entity = voteService.getAllVoteProduct();
        return new ResponseEntity<List<Vote>>(entity, HttpStatus.OK);
    }
}
