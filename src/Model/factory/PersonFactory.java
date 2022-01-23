package Model.factory;

import java.util.Date;

import Model.entities.Adress;

public class PersonFactory {
		
	
		public PhysicalPerson getPhysicalPerson(String controlFlag, String name, Date birthDate, Adress adress, String cpf, boolean isEmployee,
			String profession, float monthlyIncome) {
			PhysicalPerson returnn = null;
			if (controlFlag.equals("P")) {
				returnn = new PhysicalPerson(controlFlag, name, birthDate, adress, cpf, isEmployee,
				profession, monthlyIncome);
			}
			return returnn;
		}

		public LegalPerson getLegalPerson(String controlFlag, String name, Date birthDate, Adress adress, String cnpj,
				float billingAverage, String instituitionNumber) {
			LegalPerson returnn = null;
			if (controlFlag.equals("L")) {
				returnn = new LegalPerson(controlFlag, name, birthDate, adress, cnpj, billingAverage,
						instituitionNumber);
			}
			return returnn;
		}

}
