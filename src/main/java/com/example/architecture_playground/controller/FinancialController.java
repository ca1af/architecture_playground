package com.example.architecture_playground.controller;

import com.example.architecture_playground.interactor.FinancialReportRequester;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class FinancialController {

    private final FinancialReportRequester financialReportRequester;


}
