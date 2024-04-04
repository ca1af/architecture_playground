package com.example.architecture_playground.data;

import com.example.architecture_playground.finance.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialDatabase extends JpaRepository<Finance, Long> {
}
