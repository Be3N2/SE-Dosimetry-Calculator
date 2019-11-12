package Calculators;
import Core.PatientData;


public class SurgeryCalculator extends Calculator {
	String RecommendedSurgery;
	
	public SurgeryCalculator(PatientData pt){
		super(pt);
		RecommendedSurgery = "";
	}
	
	//calculate and set treatment in PatientData object "Patient"
	public void CalculateTreatment() {
		
		int oldAge = -1;
		if(Patient.GetAge() >= 70) {
			// Risk increased  due to older age
			oldAge = Patient.GetCancerStage() + 1;
		}
		
		if(Patient.GetCancerStage() == 1 || oldAge == 1) {
			RecommendedSurgery = "Low Risk: Curative removal surgery \nlitle to no radiation needed.";
			Patient.setRecommendedSurgery(RecommendedSurgery);
		} else if(Patient.GetCancerStage() == 2 || oldAge == 2) {
			RecommendedSurgery = "Low/Medium Risk: Small dosage of radiation first then Curative surgery.";
			Patient.setRecommendedSurgery(RecommendedSurgery);
		} else if(Patient.GetCancerStage() == 3 || oldAge == 3) {
			RecommendedSurgery = "Medium Risk: Larger dosage of radiation and/or Chemptherapy required first."
					+ "\nOnce the tumor is small enough, Curative Surgery.";
			Patient.setRecommendedSurgery(RecommendedSurgery);
		} else if(Patient.GetCancerStage() == 4 || oldAge == 4) {
			RecommendedSurgery = "High Risk: Combination of chemotherapy and radiation until the cancer is at a lower stage.";
			Patient.setRecommendedSurgery(RecommendedSurgery);
		}
	}


}
