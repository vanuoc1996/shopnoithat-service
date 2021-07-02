package com.web.shop.repository;

import com.web.shop.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVoteRepository extends JpaRepository<Vote, Integer> {
}
