package db;

import java.sql.Connection;

import Model.entities.Account;

public class AccountDB {
	private final Connection connection;
	
	public AccountDB(Connection connection) {
		this.connection = connection;
	}



	public boolean existeUser(Account user) throws Exception {
		
		
	}
	
	
	
}
