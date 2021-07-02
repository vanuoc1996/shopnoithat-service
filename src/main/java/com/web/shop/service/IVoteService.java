package com.web.shop.service;

import com.web.shop.entity.Vote;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface IVoteService {

    List<Vote> getAllVoteProduct();

}
