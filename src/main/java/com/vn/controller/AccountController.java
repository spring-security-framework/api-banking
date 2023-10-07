package com.vn.controller;

import com.vn.model.Accounts;
import com.vn.repo.AccountsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class AccountController {
    @Autowired
    private AccountsRepo accountsRepo;

    @GetMapping("/myAccount")
    public Accounts getAccountDetails(
            @RequestParam int id
    ) {
        Accounts accounts = accountsRepo.findByCustomerId(id);
        if (accounts != null ) {
            return accounts;
        } else {
            return null;
        }
    }
}
