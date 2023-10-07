package com.vn.controller;

import com.vn.model.Loans;
import com.vn.repo.LoanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
public class LoansController {
    @Autowired
    private LoanRepo loanRepo;

    @GetMapping("/myLoans")
    public List<Loans> getLoanDetails(
            @RequestParam int id
    ) {
        List<Loans> loans = loanRepo.findByCustomerIdOrderByStartDtDesc(id);

        if (loans != null ) {
            return loans;
        }else {
            return null;
        }
    }

}
