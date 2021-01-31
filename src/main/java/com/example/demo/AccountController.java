package com.example.demo;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class AccountController {

	private AccountService accountService;

	
	// Fetch single user
	  @GetMapping("/{id}")
	  public BigDecimal getBalanceByAccountNumber(@PathVariable("id") String accountNumber){
	    Optional<Balance> balance = accountService.getAccountBalance(accountNumber);
	    if (balance.isPresent()) {
	    	Balance balanceObject = balance.get();
	    	return balanceObject.getBalance();
	    }
	    else
	    	return null;
	  }

}
