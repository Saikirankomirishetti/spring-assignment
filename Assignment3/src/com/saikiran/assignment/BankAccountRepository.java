package com.saikiran.assignment;

import java.sql.SQLException;

public interface BankAccountRepository 
{
	public double getBalance(long accountId) throws ClassNotFoundException, SQLException ;

	public double updateBalance(long accountId, double newBalance) throws ClassNotFoundException, SQLException;
  
}
