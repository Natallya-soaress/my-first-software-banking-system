package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		
		Address adress = new Address("A 02", "Qd 04, Lt 10", 22, "Jundia�", "An�polis", "Brasil");
		
		// Polimorfismo = duas vari�veis do mesmo tipo, agindo de modos diferentes
		Person person1 = new LegalPerson("Ana", sdf.parse("26/12/2000"), adress, "22.444.888/0002", 200.000, 202);
		Person person2 = new PhysicalPerson("Bob", sdf.parse("14/12/2000"), adress, "042.864.202-66", true, "Teacher", 4.000);
		
		// Dado coletado do usu�rio para saber se a conta � de pessoa f�sica ou jur�dica 
		//int type = 0;
		
		//if(type == 0) {
			// Conta de pessoa jur�dica
			Account account1 = new Account(2002, 6442, 0, 600.00, 12.500, sdf.parse("26/11/2000"), person1);
		//} else if (type == 1) {
			// Conta de pessoa f�sica
			Account account2 = new Account(2004, 8824, 0, 200.00, 2.500, sdf.parse("26/11/2000"), person2);
		//}
		
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		
		s.close();
	}

}