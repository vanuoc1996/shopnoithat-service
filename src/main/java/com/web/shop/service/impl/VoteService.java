package com.web.shop.service.impl;

import com.web.shop.entity.Vote;
import com.web.shop.repository.VoteRepository;
import com.web.shop.service.IVoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VoteService implements IVoteService {

    @Autowired
    VoteRepository voteRepository;

    @Override
    public List<Vote> getAllVoteProduct() {
        return voteRepository.findAll();
    }
}
