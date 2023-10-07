package com.vn.controller;

import com.vn.model.AccountTransactions;
import com.vn.repo.AccountTransactionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
public class BalanceController {
    @Autowired
    private AccountTransactionsRepo accountTransactionsRepo;

    @GetMapping("/myBalance")
    public List<AccountTransactions> getBalanceDetails(
            @RequestParam int id
    ) {
        List<AccountTransactions> accountTransactions = accountTransactionsRepo.findByCustomerIdOrderByTransactionDtDesc(id);

        if (accountTransactions != null ) {
            return accountTransactions;
        }else {
            return null;
        }
    }
}
