package Model.factory;

import java.util.Date;

import Model.entities.Adress;

public class PersonFactory {
		
	
		public PhysicalPerson getPhysicalPerson(String name, Date birthDate, Adress adress, PhysicalAccount physicalAccount, String cpf, boolean isEmployee,
			String profession, float monthlyIncome) {
			PhysicalPerson returnn = null;
			returnn = new PhysicalPerson(name, birthDate, adress, physicalAccount, cpf, isEmployee, profession, monthlyIncome);
			return returnn;
		}

		public LegalPerson getLegalPerson(String controlFlag, String name, Date birthDate, Adress adress, LegalAccount legalAccount, String cnpj, float billingAverage, String instituitionNumber) {
			LegalPerson returnn = null;
			returnn = new LegalPerson(controlFlag, name, birthDate, adress, legalAccount, cnpj, billingAverage, instituitionNumber);
			return returnn;
		}

}
