package com.example.architecture_playground.interactor;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FinancialReportGenerator implements FinancialReportRequester{

    private final FinancialDataGateway financialDataGateway;

    @Override
    public FinancialReportRequest request() {
        this.requestLogic();
        return new FinancialReportRequest();
    }

    @Override
    public FinancialReportResponse response(Long id) {
        this.responseLogic();
        return new FinancialReportResponse();
    }

    private void requestLogic(){
        // someLogic
    }

    private void responseLogic(){
        // someLogic
    }
}
