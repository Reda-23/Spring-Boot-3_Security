package org.accountssecurity.service;

import org.accountssecurity.dto.AccountRequest;
import org.accountssecurity.dto.AccountResponse;
import org.accountssecurity.entity.Account;
import org.accountssecurity.mapper.AccountMapper;
import org.accountssecurity.repo.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final AccountMapper mapper;

    public AccountServiceImpl(AccountRepository accountRepository, AccountMapper mapper) {
        this.accountRepository = accountRepository;
        this.mapper = mapper;
    }

    @Override
    public AccountResponse saveAccount(AccountRequest accountRequest) {
        Account account = mapper.fromAccountRequestToAccount(accountRequest);
        Account savedAccount = accountRepository.save(account);
        return mapper.fromAccountToAccountResponse(savedAccount);
    }

    @Override
    public AccountResponse getAccountById(Long id) {
        Account account = accountRepository.findAccountById(id);
        return mapper.fromAccountToAccountResponse(account);
    }

    @Override
    public AccountResponse updateAccount(AccountRequest accountRequest, Long id) {
        Account updatedAccount = accountRepository.findAccountById(id);
        Account account1 = accountRepository.save(updatedAccount);
        return mapper.fromAccountToAccountResponse(account1);
    }

    @Override
    public List<AccountResponse> AccountsList() {
        List<Account> list = accountRepository.findAll();
        List<AccountResponse> accountResponses = list.stream().map(account -> mapper.fromAccountToAccountResponse(account)).collect(Collectors.toList());
        return accountResponses;
    }

    @Override
    public String deleteAccount(Long id) {
        Account account = accountRepository.findAccountById(id);
            accountRepository.delete(account);
            return "DELETED SUCCESSFULLY";
    }
}
