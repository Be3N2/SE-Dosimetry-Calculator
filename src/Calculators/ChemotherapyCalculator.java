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
				dosage = String.valueOf(TwoDecimalRound(bodySurfaceArea(100)));
				Patient.setChemoDrug(dosage + " mg of Paclitaxel");
				break;
			case "brain":
				dosage = String.valueOf(TwoDecimalRound(bodySurfaceArea(200)));
				Patient.setChemoDrug(dosage + " mg of Carmustine");
				break;
			case "thyroid":
				dosage = String.valueOf(TwoDecimalRound(bodySurfaceArea(90)));
				Patient.setChemoDrug(dosage + " mg of Doxorubicin");
				break;
			case "liver":
				dosage = String.valueOf(TwoDecimalRound(bodySurfaceArea(120)));
				Patient.setChemoDrug(dosage + " mg of Cabozantinib-S-Malate");
				break;
			case "stomach":
				dosage = String.valueOf(TwoDecimalRound(bodySurfaceArea(120)));
				Patient.setChemoDrug(dosage + " mg of Docetaxel");
				break;
		}
	}
	
	public double bodySurfaceArea(double baseDosage) {
		double height = Patient.GetHeight() * 2.54; //inches to center meters
		double weight = Patient.GetWeight();
		double bsa = Math.pow((height*weight)/3600, 2);
		
		return((baseDosage/bsa) + baseDosage);
	}

}
