package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.Account;
import Model.Address;
import Model.LegalPerson;
import Model.Person;
import Model.PhysicalPerson;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner s = new Scanner(System.in);
		
		Address address = new Address("A 02", "Qd 04, Lt 10", 215, "Jundiaí", "Anápolis", "Brasil");
		//System.out.println(address.getNumber());
		//System.out.println(address.getStreet());
		
		// Polimorfismo = duas variáveis do mesmo tipo, agindo de modos diferentes
		Person person1 = new LegalPerson("Ana", sdf.parse("26/12/2000"), address, "22.444.888/0002", 200.000, 202);
		Person person2 = new PhysicalPerson("Bob", sdf.parse("14/12/2000"), address, "042.864.202-66", true, "Teacher", 4.000);
		
		// Dado coletado do usuário para saber se a conta é de pessoa física ou jurídica 
		//int type = 0;
		
		//if(type == 0) {
			// Conta de pessoa jurídica
			Account account1 = new Account(2002, 6442, 0, 600.00, 12.500, sdf.parse("26/11/2000"), person1);
		//} else if (type == 1) {
			// Conta de pessoa física
			Account account2 = new Account(2004, 8824, 0, 200.00, 2.500, sdf.parse("26/11/2000"), person2);
		//}
		System.out.println(account1.getBalance()+ "\n");
		System.out.println(account2.getBalance() + "\n");
			
		System.out.println("Transferir,:");
		
		
		Account conta = account2;
		System.out.println("Quantia:");
		double quantia = s.nextDouble();
		if(quantia < 500){
			account1.makeTransfer(conta, quantia);
		}else {
			System.out.println("Insira a sua senha!");
			int senha = s.nextInt();	
			account1.makeTransfer(conta, quantia, senha);
		}
		System.out.println(account1.getBalance()+ "\n");
		System.out.println(account2.getBalance()+ "\n");
		//account1.makeTranfer(account2,)
		
		///////// TESTESTESASDASDSFASDASAD
		
		
		
		
		
		
		
		
		
		
		//System.out.println(account1.toString());
		//System.out.println(account2.toString());
		
		
		//Criando uma conta de teste -> pessoa física
		//PhysicalPerson camila = new PhysicalPerson("Camila",sdf.parse("08/03/2001"),address,"45639872511",false,"Estudante",400);
		
		
		
		
		s.close();
	}

}