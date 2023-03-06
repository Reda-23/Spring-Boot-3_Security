package org.accountssecurity.config;

import org.accountssecurity.entity.Account;
import org.accountssecurity.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserInfoService implements UserDetailsService {
    @Autowired
    private AccountRepository accountRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Account> account = accountRepository.findAccountByUsername(username);
        return account.map(UserInfo::new).orElseThrow(()-> new UsernameNotFoundException("USER NOT FOUND"));
    }
}
