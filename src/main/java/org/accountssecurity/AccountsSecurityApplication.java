package org.accountssecurity;

import org.accountssecurity.dto.AccountRequest;
import org.accountssecurity.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.crypto.Data;
import java.util.Date;

@SpringBootApplication
public class AccountsSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsSecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(AccountService accountService){
        return args -> {
            accountService.saveAccount(new AccountRequest(null,"John","1234","ADMIN",new Date(),"John Travolta"));
            accountService.saveAccount(new AccountRequest(null,"Mike","1234","USER",new Date(),"Mike Tyson"));
            accountService.saveAccount(new AccountRequest(null,"Elon","1234","ADMIN",new Date(),"Elon Musk"));
            accountService.saveAccount(new AccountRequest(null,"Tom","1234","USER",new Date(),"Tom Hanks"));
        };
    }

}
