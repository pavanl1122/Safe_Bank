package com.wecp.progressive.repository;

<<<<<<< HEAD
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Accounts;


public interface AccountRepository extends JpaRepository<Accounts, Integer> {
    List<Accounts> findByCustomerId(int customerId);
}

=======

public interface AccountRepository {
}
>>>>>>> 75df51bc61bba2d874956097baa3415a2f066252
