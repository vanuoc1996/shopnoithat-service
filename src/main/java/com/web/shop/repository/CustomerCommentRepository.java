package com.web.shop.repository;

import com.web.shop.entity.CustomerComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCommentRepository extends JpaRepository<CustomerComment, Integer> {
}
