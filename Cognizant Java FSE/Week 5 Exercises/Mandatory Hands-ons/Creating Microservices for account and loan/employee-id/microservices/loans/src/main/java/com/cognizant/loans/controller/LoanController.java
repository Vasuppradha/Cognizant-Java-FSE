package com.cognizant.loans.controller;

import com.cognizant.loans.model.LoanModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loans/{number}")
    public LoanModel showLoan(@PathVariable("number") String loanNumber){
        return new LoanModel(loanNumber, "car", 400000, 3258, 18);
    }
}
