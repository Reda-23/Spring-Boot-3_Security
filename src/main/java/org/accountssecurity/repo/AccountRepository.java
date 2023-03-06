package org.accountssecurity.repo;

import org.accountssecurity.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Long> {

    Optional<Account> findAccountById(Long id);
}
