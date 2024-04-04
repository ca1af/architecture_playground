package com.example.architecture_playground.data;

import com.example.architecture_playground.finance.Finance;
import com.example.architecture_playground.interactor.FinancialDataGateway;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FinancialDataMapper implements FinancialDataGateway {

   private final FinancialDatabase financialDatabase;
   @Override
   public Finance getFinance(Long id){
       return financialDatabase.findById(id)
               .orElseThrow();
   }
}
