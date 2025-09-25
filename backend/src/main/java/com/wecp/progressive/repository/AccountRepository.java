package com.wecp.progressive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Accounts;


public interface AccountRepository extends JpaRepository<Accounts, Integer> {
    List<Accounts> findByCustomerId(int customerId);
}

