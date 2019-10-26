package com.saikiran.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository
{
	private String url;
	private String user;
	private String password;
	
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Statement getConnection() throws ClassNotFoundException, SQLException
	{
		 Class.forName("com.mysql.jdbc.Driver");
         Connection connection = DriverManager.getConnection(url, user, password);
         Statement statement = connection.createStatement();
		 return statement;
	}
	 public void closeConnection() throws ClassNotFoundException, SQLException
	    {
	       getConnection().close();
	    }

	@Override
	public double getBalance(long accountId) throws ClassNotFoundException, SQLException
	{
		double balance=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url, user, password);
		Statement statement=connection.createStatement();
		ResultSet resultset=statement.executeQuery("select accountBalance from bank where accountId="+accountId);
		while(resultset.next())
		{
			balance= resultset.getInt("accountBalance");
		}
		return balance;
	}

	@Override
	public double updateBalance(long accountId, double accountBalance) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url, user, password);
		Statement statement=connection.createStatement();
        statement.executeUpdate("update bank set accountBalance=accountBalance+"+accountBalance+"where accountid="+accountId);
		return getBalance(accountId);
	}

}
