package com.vn.repo;

import com.vn.model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardsRepo extends JpaRepository<Cards, Integer> {
    List<Cards> findByCustomerId(int customerId);
}
