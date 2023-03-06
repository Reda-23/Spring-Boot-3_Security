package org.accountssecurity.mapper;


import org.accountssecurity.dto.AccountRequest;
import org.accountssecurity.dto.AccountResponse;
import org.accountssecurity.entity.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    Account fromAccountRequestToAccount(AccountRequest accountRequest);
    AccountResponse fromAccountToAccountResponse(Account account);
}
