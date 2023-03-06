package org.accountssecurity.service;

import org.accountssecurity.dto.AccountRequest;
import org.accountssecurity.dto.AccountResponse;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    AccountResponse saveAccount(AccountRequest accountRequest);
    AccountResponse getAccountById(Long id);
    AccountResponse updateAccount(AccountRequest accountRequest, Long id);
    List<AccountResponse> AccountsList();
    String deleteAccount(Long id);
}
