package com.saikiran.assignment;

import java.sql.SQLException;

public interface BankAccountService 
{
	public double withdraw(long accountId, double balance) throws  SQLException, ClassNotFoundException;

	public double deposit(long accountId, double balance) throws ClassNotFoundException, SQLException;

	public double getBalance(long accountId) throws ClassNotFoundException, SQLException;

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) throws  SQLException,ClassNotFoundException;

}
