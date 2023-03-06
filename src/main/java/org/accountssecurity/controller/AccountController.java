package org.accountssecurity.controller;


import org.accountssecurity.dto.AccountRequest;
import org.accountssecurity.dto.AccountResponse;
import org.accountssecurity.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @PostMapping("/")
    AccountResponse saveAccount(@RequestBody AccountRequest accountRequest){
        return accountService.saveAccount(accountRequest);
    }

    @GetMapping("/{id}")
    AccountResponse getAccount(@PathVariable Long id){
            return accountService.getAccountById(id);
    }

    @PutMapping("/{id}")
    AccountResponse updateAccount(@PathVariable Long id, @RequestBody AccountRequest accountRequest){
        return accountService.updateAccount(accountRequest,id);
    }

    @GetMapping("/accounts")
    List<AccountResponse> accountsList(){
        return accountService.AccountsList();
    }

    @DeleteMapping("/{id}")
    String deleteAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
        return "ACCOUNT DELETED SUCCESSFULLY";
    }
}
