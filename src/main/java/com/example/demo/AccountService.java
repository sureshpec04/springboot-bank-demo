package com.example.demo;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	private AccountRepository accountRepository;

	public AccountService(final AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	
	public Optional<Balance> getAccountBalance(String accountNumber) {
		
		return accountRepository.findById(accountNumber);
		
	}

}
