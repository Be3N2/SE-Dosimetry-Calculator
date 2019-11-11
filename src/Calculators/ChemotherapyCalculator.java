package Calculators;
import Core.PatientData;


public class ChemotherapyCalculator extends Calculator {
	
	public ChemotherapyCalculator(PatientData pt){
		super(pt);
		
	}
	
	//calculate and set treatment in patientdata object "Patient"
	public void CalculateTreatment() {
		String dosage;
		switch(Patient.GetTumorLocation().toLowerCase()) 
		{
			
			case "lungs":
				dosage = String.valueOf(bodySurfaceArea(100));
				Patient.setChemoDrug(dosage + "mg of Paclitaxel");
				
			case "brain":
				dosage = String.valueOf(bodySurfaceArea(200));
				Patient.setChemoDrug(dosage + "mg of Carmustine");
				
			case "thyroid":
				dosage = String.valueOf(bodySurfaceArea(90));
				Patient.setChemoDrug(dosage + "mg of Doxorubicin");
				
			case "liver":
				dosage = String.valueOf(bodySurfaceArea(120));
				Patient.setChemoDrug(dosage + "mg of Cabozantinib-S-Malate");
				
			case "stomach":
				dosage = String.valueOf(bodySurfaceArea(120));
				Patient.setChemoDrug(dosage + "mg of Docetaxel");
				
		}
	}
	
	public double bodySurfaceArea(double baseDosage) {
		double height = Patient.GetHeight() * 2.54; //inches to center meters
		double weight = Patient.GetWeight();
		double bsa = Math.pow((height*weight)/3600, 2);
		
		return((baseDosage/bsa) + baseDosage);
	}

}
