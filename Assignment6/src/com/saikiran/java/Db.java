package com.saikiran.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Db
{
	 @Value("${db.driverclassname}")
		String	driverClassName;
	   @Value("${db.dburl}")
		String dbUrl;
	   @Value("${db.username}")
		String userName;
	   @Value("${db.password}")
		String password;
	@Override
	public String toString() {
		return "Db [driverClassName=" + driverClassName + ", dbUrl=" + dbUrl + ", userName=" + userName + ", password="
				+ password + "]";
	}

}
