package com.saikiran.assignment;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class BankAccountController 
{
	@Autowired
	BankAccountServiceImp bankAccountServiceImp;

	public BankAccountServiceImp getBankAccountServiceImp() {
		return bankAccountServiceImp;
	}

	public void setBankAccountServiceImp(BankAccountServiceImp bankAccountServiceImp) {
		this.bankAccountServiceImp = bankAccountServiceImp;
	}
	public double withdraw(long accountId, double balance) throws ClassNotFoundException, SQLException 
	{
			return bankAccountServiceImp.withdraw(accountId,- balance);
		
	}

	public double deposit(long accountId, double balance) throws ClassNotFoundException, SQLException
	{
		
		return  bankAccountServiceImp.deposit(accountId, balance);
	}

	public double getBalance(long accountId) throws ClassNotFoundException, SQLException 
	{
		return  bankAccountServiceImp.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) throws ClassNotFoundException, SQLException
	{
			return  bankAccountServiceImp.fundTransfer(fromAccount,toAccount,amount);
		}
	}


