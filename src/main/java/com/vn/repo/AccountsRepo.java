package com.vn.repo;

import com.vn.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepo extends JpaRepository<Accounts, Integer> {
    Accounts findByCustomerId(int customerId);
}
