package com.finances.pocketsaverapi.repository;

import com.finances.pocketsaverapi.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
}
