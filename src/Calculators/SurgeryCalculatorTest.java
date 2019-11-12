package Calculators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Core.PatientData;

class SurgeryCalculatorTest {
	PatientData Patient;

	@Test
	void calculateTreatmentTest() {
		SurgeryCalculator sc = new SurgeryCalculator(Patient);
		int cancerStage = sc.Patient.GetCancerStage();
		String recSurg = sc.Patient.GetRecommendedSurgery();
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
