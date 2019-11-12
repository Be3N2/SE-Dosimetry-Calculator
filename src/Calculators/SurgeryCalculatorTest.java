package Calculators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Core.PatientData;

class SurgeryCalculatorTest {
	PatientData Patient = new PatientData();

	@Test
	void calculateTreatmentTest() {
		//initial setup
		Patient.SetCancerStage(1);
		Patient.SetAge(35);
		
		//Run calculations
		SurgeryCalculator sc = new SurgeryCalculator(Patient);
		sc.CalculateTreatment();
		
		//Get Results
		int cancerStage = Patient.GetCancerStage();
		String recSurg = Patient.GetRecommendedSurgery();
		
		//Test outputted surgery is as it should be
		if(cancerStage == 1) {
			assertEquals("Low Risk: Curative removal surgery \nlitle to no radiation needed.", recSurg);
		} else if(cancerStage == 2) {
			assertEquals("Low/Medium Risk: Small dosage of radiation first then Curative surgery.", recSurg);
		} else if(cancerStage == 3) {
			assertEquals("Medium Risk: Larger dosage of radiation and/or Chemptherapy required first."
					+ "\nOnce the tumor is small enough, Curative Surgery.", recSurg);
		} else if(cancerStage == 4) {
			assertEquals("High Risk: Combination of chemotherapy and radiation until the cancer is at a lower stage.", recSurg);
		}
		
	}

}
