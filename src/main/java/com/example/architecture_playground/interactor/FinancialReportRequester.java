package com.example.architecture_playground.interactor;

public interface FinancialReportRequester {
    FinancialReportRequest request();

    FinancialReportResponse response(Long id);

}
