package Calculators;
import Core.PatientData;

public class RadiationCalculator extends Calculator {

//PatientData object that holds all the patient diagnostic information entered by staff

//Constructor
public RadiationCalculator(PatientData pt) {
	super(pt);
	//this.Patient = patient;
}

//Calculates and sets the total radiation dose for the patient for 3 varying risk levels
public void CalculateTreatment() {
	//risk factors taken from ICRP103 2007
	double riskFactorHeart = 0.12;
	double riskFactorLungs = 0.12;
	double riskFactorBrain = 0.01;
	double riskFactorThyroid = 0.04;
	//double riskFactorKidneys = 0;
	double riskFactorLiver = 0.04;
	double riskFactorStomach = 0.12;
	
	double totalDoseLow = 0;
	double totalDoseMed = 0;
	double totalDoseHigh = 0;
	
	double absorbedDoseLow = 0;
	double absorbedDoseMed = 0;
	double absorbedDoseHigh = 0;
	
	double sievertsLow = 99;		//9.9sV but 99 is used in the algebra
	double sievertsMed = 199;		//19.9sV but 199 is used in the algebra
	double sievertsHigh = 299;		//29.9sV but 299 is used in the algebra
	
		
	switch(Patient.GetTumorLocation().toLowerCase()) 
	{
		case "heart":
			//low risk
			absorbedDoseLow = (sievertsLow)/((5)*((2*riskFactorHeart)+riskFactorLungs));
			totalDoseLow = absorbedDoseLow*Patient.GetOrganMass();
			
			//medium risk
			absorbedDoseMed = (sievertsMed)/((5)*((2*riskFactorHeart)+riskFactorLungs));
			totalDoseMed = absorbedDoseMed*Patient.GetOrganMass();
			
			//high risk
			absorbedDoseHigh = (sievertsHigh)/((5)*((2*riskFactorHeart)+riskFactorLungs));
			totalDoseHigh = absorbedDoseHigh*Patient.GetOrganMass();
			break;
			
		case "lungs":
			//low risk
			absorbedDoseLow = (sievertsLow)/((5)*((2*riskFactorLungs)+riskFactorHeart));
			totalDoseLow = absorbedDoseLow*Patient.GetOrganMass();
			
			//medium risk
			absorbedDoseMed = (sievertsMed)/((5)*((2*riskFactorLungs)+riskFactorHeart));
			totalDoseMed = absorbedDoseMed*Patient.GetOrganMass();
			
			//high risk
			absorbedDoseHigh = (sievertsHigh)/((5)*((2*riskFactorLungs)+riskFactorHeart));
			totalDoseHigh = absorbedDoseHigh*Patient.GetOrganMass();
			break; 
			
		case "brain":
			//low risk
			absorbedDoseLow = (sievertsLow)/((5)*((2*riskFactorBrain)+riskFactorThyroid));
			totalDoseLow = absorbedDoseLow*Patient.GetOrganMass();
			
			//medium risk
			absorbedDoseMed = (sievertsMed)/((5)*((2*riskFactorBrain)+riskFactorThyroid));
			totalDoseMed = absorbedDoseMed*Patient.GetOrganMass();
			
			//high risk
			absorbedDoseHigh = (sievertsHigh)/((5)*((2*riskFactorBrain)+riskFactorThyroid));
			totalDoseHigh = absorbedDoseHigh*Patient.GetOrganMass();
			break;
			
		case "thyroid":
			//low risk
			absorbedDoseLow = (sievertsLow)/((5)*((2*riskFactorThyroid)+riskFactorBrain));
			totalDoseLow = absorbedDoseLow*Patient.GetOrganMass();
			
			//medium risk
			absorbedDoseMed = (sievertsMed)/((5)*((2*riskFactorThyroid)+riskFactorBrain));
			totalDoseMed = absorbedDoseMed*Patient.GetOrganMass();
			
			//high risk
			absorbedDoseHigh = (sievertsHigh)/((5)*((2*riskFactorThyroid)+riskFactorBrain));
			totalDoseHigh = absorbedDoseHigh*Patient.GetOrganMass();
			break;
		/*
		case "Kidneys":
			//low risk
			absorbedDoseLow = (sievertsLow)/((5)*((2*riskFactorBrain)+riskFactorThyroid));
			totalDoseLow = absorbedDoseLow*Patient.GetOrganMass();
			
			//medium risk
			absorbedDoseMed = (sievertsMed)/((5)*((2*riskFactorBrain)+riskFactorThyroid));
			totalDoseMed = absorbedDoseMed*Patient.GetOrganMass();
			
			//high risk
			absorbedDoseHigh = (sievertsHigh)/((5)*((2*riskFactorBrain)+riskFactorThyroid));
			totalDoseHigh = absorbedDoseHigh*Patient.GetOrganMass();
		*/
			
		case "liver":
			//low risk
			absorbedDoseLow = (sievertsLow)/((5)*((2*riskFactorLiver)+riskFactorStomach));
			totalDoseLow = absorbedDoseLow*Patient.GetOrganMass();
			
			//medium risk
			absorbedDoseMed = (sievertsMed)/((5)*((2*riskFactorLiver)+riskFactorStomach));
			totalDoseMed = absorbedDoseMed*Patient.GetOrganMass();
			
			//high risk
			absorbedDoseHigh = (sievertsHigh)/((5)*((2*riskFactorLiver)+riskFactorStomach));
			totalDoseHigh = absorbedDoseHigh*Patient.GetOrganMass();
			break;
			
		case "stomach":
			//low risk
			absorbedDoseLow = (sievertsLow)/((5)*((2*riskFactorStomach)+riskFactorLiver));
			totalDoseLow = absorbedDoseLow*Patient.GetOrganMass();
			
			//medium risk
			absorbedDoseMed = (sievertsMed)/((5)*((2*riskFactorStomach)+riskFactorLiver));
			totalDoseMed = absorbedDoseMed*Patient.GetOrganMass();
			
			//high risk
			absorbedDoseHigh = (sievertsHigh)/((5)*((2*riskFactorStomach)+riskFactorLiver));
			totalDoseHigh = absorbedDoseHigh*Patient.GetOrganMass();
			break;
	}

	Patient.SetTotalDoseLowRisk(TwoDecimalRound(totalDoseLow));
	Patient.SetTotalDoseMedRisk(TwoDecimalRound(totalDoseMed));
	Patient.SetTotalDoseHighRisk(TwoDecimalRound(totalDoseHigh));
	
	//delivered over how many weeks?
	CalculateTotalTherapyWeeks();
	
	//Which risk level is our recommendation?
	ChooseRecommendedRiskLevel();
		
}

public void CalculateTotalTherapyWeeks() {
	//delivered over 5-8wks
	//5wks for cancer stage 4
	//6wks cancer stage 3
	//7wks cancer stage 2
	//8weks cancer stage 1
	
	if(Patient.GetCancerStage() == 1) {
		Patient.SetTotalTherapyWeeks(8);
	}
	else if(Patient.GetCancerStage() == 2) {
		Patient.SetTotalTherapyWeeks(7);
	}
	else if(Patient.GetCancerStage() == 3) {
		Patient.SetTotalTherapyWeeks(6);
	}
	else if(Patient.GetCancerStage() == 4) {
		Patient.SetTotalTherapyWeeks(5);
	}
}

public void ChooseRecommendedRiskLevel() {
	//recommend low risk level dose if cancer stage 1
	//recommend med risk level dose if cancer stage 2,3
	//recommend high risk level dose if cancer stage 4
	
	if(Patient.GetCancerStage() == 1) {
		Patient.SetRecommendedRiskLevel("Low");
	}
	else if(Patient.GetCancerStage() == 2) {
		Patient.SetRecommendedRiskLevel("Medium");
	}
	else if(Patient.GetCancerStage() == 3) {
		Patient.SetRecommendedRiskLevel("Medium");
	}
	else if(Patient.GetCancerStage() == 4) {
		Patient.SetRecommendedRiskLevel("High");
	}
}

}
