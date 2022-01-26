package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.factory.Account;

public class AccountDB {
	private final Connection connection;
	
	public AccountDB(Connection connection) {
		this.connection = connection;
	}



	public boolean existeUser(Account user) throws SQLException {
		String sql = "select * from account where number = '"+user.getNumber()+"' and account_password = '"+user.getAccountPassword()+"'";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.execute();
		ResultSet resultSet = statement.getResultSet();
		return resultSet.next();
		
		
	}
	
	public boolean existeUserDestination(Account user) throws SQLException {
		String sql = "select * from account where number = '"+user.getNumber()+"'";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.execute();
		ResultSet resultSet = statement.getResultSet();
		return resultSet.next();
		
		
	}
	public double getBalance(String numberAccount) throws SQLException{
		
		String sql = "select balance from account where number = '"+numberAccount+"'";
		PreparedStatement statement;
		
		statement = connection.prepareStatement(sql);
		//statement.setString(1,numberAccount);
		statement.execute();
		
		ResultSet resultSet = statement.getResultSet();
		
		if (resultSet.next()) {
			return resultSet.getDouble("balance");
		}
		return 0;	
		
	}



	public String getnumberAccount(String passwordAccount) throws SQLException {

		String sql = "select number from account where account_password = '"+passwordAccount+"'";
		PreparedStatement statement;
		
		statement = connection.prepareStatement(sql);
		statement.execute();
		
		ResultSet resultSet = statement.getResultSet();
		
		if(resultSet.next()) {
			return resultSet.getString("account_password");
		}
		return null;
		
			
		
	}




	public String addValue(String value, String accountNumber) throws SQLException {
		
		String sql = "update account set balance = balance + '"+Double.valueOf(value).doubleValue()+"' where number = '"+accountNumber+"'";
		PreparedStatement statement;
		statement = connection.prepareStatement(sql);
		statement.execute();
		
		ResultSet resultSet = statement.getResultSet();
		return null;
		
		
	}



	public String removeValue(String value, String accountNumber) throws SQLException {
		String sql = "update account set balance = balance - '"+Double.valueOf(value).doubleValue()+"' where number = '"+accountNumber+"'";
		PreparedStatement statement;
		statement = connection.prepareStatement(sql);
		statement.execute();
		
		ResultSet resultSet = statement.getResultSet();
		return null;
		
	}

	public void transferValue(String value, String accountNumber, String destination) throws SQLException {
		removeValue(value,accountNumber);
		addValue(value,destination);
	}
	
	
	
}
