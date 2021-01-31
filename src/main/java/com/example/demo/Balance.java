package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "balance")
public class Balance {
	
	@Id
	private String accountNumber;
	
	private LocalDateTime updatedTimestamp;
	
	private BigDecimal balanceAmount;
	


	public Balance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public LocalDateTime getTransactionTs() {
		return updatedTimestamp;
	}

	public void setTransactionTs(LocalDateTime transactionTs) {
		this.updatedTimestamp = transactionTs;
	}

	public BigDecimal getBalance() {
		return balanceAmount;
	}

	public void setBalance(BigDecimal balance) {
		this.balanceAmount = balance;
	}

}
	
	
	
	
	
	


