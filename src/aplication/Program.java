package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Model.entities.Account;
import Model.entities.Adress;
import Model.entities.LegalPerson;
import Model.entities.Person;
import Model.entities.PhysicalPerson;
import Model.exceptions.InsuficientBalanceException;
import Model.exceptions.NegativeDepositException;

public class Program {

	public static void main(String[] args) throws ParseException, InsuficientBalanceException, NegativeDepositException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner s = new Scanner(System.in);
		
		//Adress adress = new Adress("A 02", "Qd 04, Lt 10", 22, "Jundiaí", "Anápolis", "Brasil");
		
		// Polimorfismo 
		//Person person1 = new LegalPerson("Ana", sdf.parse("26/12/2000"), adress, "22.444.888/0002", 200.000, 202);
		//Person person2 = new PhysicalPerson("Bob", sdf.parse("14/12/2000"), adress, "042.864.202-66", true, "Teacher", 4.000);
		
		// Dado coletado do usuário para saber se a conta é de pessoa física ou jurídica 
		int type = 0;
		
		
		Account account1 = null;
		Account account2 = null;
		
		/*
		if(type == 0) {
			// Conta de pessoa jurídica
			account1 = new Account(2002, 6442, 0, 600.00, 12.500, sdf.parse("26/11/2000"), person1);
			account2 = new Account(2004, 8824, 0, 200.00, 2.500, sdf.parse("26/11/2000"), person2);
		} else if (type == 1) {
			// Conta de pessoa física
			account2 = new Account(2004, 8824, 0, 200.00, 2.500, sdf.parse("26/11/2000"), person2);
		} */
		
		// Mostra os dados da duas contas criadas
		/*if(account1 != null) 
			System.out.println(account1.toString());
		if(account2 != null) 
			System.out.println(account2.toString()); */
		
		// Teste do método que realiza transferência (não necessita de senha) 
		System.out.println("Saldo conta 1" + account1.checkBalance());
		System.out.println("Saldo conta 2" + account2.checkBalance());
		account1.makeTransfer(account2, 200.00);
		System.out.println("Saldo conta 1" + account1.checkBalance());
		System.out.println("Saldo conta 2" + account2.checkBalance());
		
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
		 
			
		s.close();
	}

}
