package com.saikiran.assignment;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImp implements BankAccountService
{
	@Autowired
	BankAccountRepositoryImpl bankAccountRepositoryImpl;
	
	
	public BankAccountRepositoryImpl getBankAccountRepositoryImpl() {
		return bankAccountRepositoryImpl;
	}

	public void setBankAccountRepositoryImpl(BankAccountRepositoryImpl bankAccountRepositoryImpl) {
		this.bankAccountRepositoryImpl = bankAccountRepositoryImpl;
	}

	@Override
	public double withdraw(long accountId, double balance) throws ClassNotFoundException, SQLException 
	{
		if(getBalance(accountId)>balance)
			return bankAccountRepositoryImpl.updateBalance(accountId,- balance);
		else
		return 0;
	}

	@Override
	public double deposit(long accountId, double balance) throws ClassNotFoundException, SQLException
	{
		
		return bankAccountRepositoryImpl.updateBalance(accountId, balance);
	}

	@Override
	public double getBalance(long accountId) throws ClassNotFoundException, SQLException 
	{
		return bankAccountRepositoryImpl.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) throws ClassNotFoundException, SQLException
	{
		if(withdraw(fromAccount,amount)==0)
		return false;
		else
		{
			deposit(toAccount,amount);
			return true;
		}
	}

}
