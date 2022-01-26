package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Model.entities.Adress;
import Model.exceptions.InsuficientBalanceException;
import Model.exceptions.NegativeDepositException;
import Model.factory.AccountFactory;
import Model.factory.LegalAccount;
import Model.factory.LegalPerson;
import Model.factory.PersonFactory;

public class Program {

	public static void main(String[] args) throws ParseException, InsuficientBalanceException, NegativeDepositException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner s = new Scanner(System.in);
		
		Adress adress = new Adress("A 02", "Qd 04, Lt 10", "22", "Jundiaí", "Anápolis", "Brasil");
		
		// Teste Fábrica de pessoas
		PersonFactory personFactory = new PersonFactory();
		LegalPerson teste = personFactory.getLegalPerson("L", "Nat", sdf.parse("26/12/2000"), adress, "222.222.248", 600, "24" );
		System.out.println(teste.getCnpj()); 
		
		// Teste Fábrica de contas
		AccountFactory accountFactory = new AccountFactory();
		LegalAccount testeAcc = accountFactory.getLegalAccount("2244", "0000", 600, 2000, sdf.parse("26/12/2000"), teste );
		System.out.println(testeAcc.getBalance());
		
		/*
		
		// Teste da exceção que trata saques maiores que o saldo
		try {
			account1.makeWithdraw(750.00);
		} catch (InsuficientBalanceException e) {
			System.out.println(e.getMessage());
			System.out.println(account1.checkBalance());
			System.out.println("Enter a valid withdrawal amount: ");
			double value = s.nextDouble();
			account1.makeWithdraw(value);
		}
		
		
		// Teste da exceção que trata depósito de valores negativos
		try {
			account1.makeDeposit(-120.00);
		} catch (NegativeDepositException e) {
			System.out.println(e.getMessage());
			System.out.println(account1.checkBalance());
			System.out.println("Enter a valid deposit amount: ");
			double value = s.nextDouble();
			account1.makeDeposit(value);
		}
		 
			
		try {
			Connection con = new Conexao().getConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		*/
		
		s.close();
	}

}
