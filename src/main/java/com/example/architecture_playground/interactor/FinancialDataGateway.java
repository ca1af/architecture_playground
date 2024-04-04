package com.example.architecture_playground.interactor;

import com.example.architecture_playground.finance.Finance;

public interface FinancialDataGateway {
    Finance getFinance(Long id);
}
