package Tests;

import Calculators.RadiationCalculator;
import Core.PatientData;

import static org.junit.Assert.*;
import org.junit.Test;


public class RadiationCalcTest {

	//ChooseRecommendedRiskLevel unit tests
	@Test
	public void TestRecommendedRiskLevelLow() {
		PatientData testPatient = new PatientData("testFirst", "testLast", "10", 60, "M", 26, 150, "", "lungs", 10, 1, 15, 12, 15, 12, 8, 6);
		RadiationCalculator calc = new RadiationCalculator(testPatient);
		calc.ChooseRecommendedRiskLevel();
		assertEquals("Low", testPatient.GetRecommendedRiskLevel());
	}
	
	@Test
	public void TestRecommendedRiskLevelMedium() {
		PatientData testPatient = new PatientData("testFirst", "testLast", "10", 60, "M", 26, 150, "", "lungs", 10, 2, 15, 12, 15, 12, 8, 6);
		RadiationCalculator calc = new RadiationCalculator(testPatient);
		calc.ChooseRecommendedRiskLevel();
		assertEquals("Medium", testPatient.GetRecommendedRiskLevel());
	}
	
	@Test
	public void TestRecommendedRiskLevelMedium2() {
		PatientData testPatient = new PatientData("testFirst", "testLast", "10", 60, "M", 26, 150, "", "lungs", 10, 3, 15, 12, 15, 12, 8, 6);
		RadiationCalculator calc = new RadiationCalculator(testPatient);
		calc.ChooseRecommendedRiskLevel();
		assertEquals("Medium", testPatient.GetRecommendedRiskLevel());
	}
	
	@Test
	public void TestRecommendedRiskLevelHigh() {
		PatientData testPatient = new PatientData("testFirst", "testLast", "10", 60, "M", 26, 150, "", "lungs", 10, 4, 15, 12, 15, 12, 8, 6);
		RadiationCalculator calc = new RadiationCalculator(testPatient);
		calc.ChooseRecommendedRiskLevel();
		assertEquals("High", testPatient.GetRecommendedRiskLevel());
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void TestTherapyWeeks8() {
		PatientData testPatient = new PatientData("testFirst", "testLast", "10", 60, "M", 26, 150, "", "lungs", 10, 1, 15, 12, 15, 12, 8, 6);
		RadiationCalculator calc = new RadiationCalculator(testPatient);
		calc.CalculateTotalTherapyWeeks();
		assertEquals(8, testPatient.GetTotalTherapyWeeks());
	}
	
	@Test
	public void TestTherapyWeeks7() {
		PatientData testPatient = new PatientData("testFirst", "testLast", "10", 60, "M", 26, 150, "", "lungs", 10, 2, 15, 12, 15, 12, 8, 6);
		RadiationCalculator calc = new RadiationCalculator(testPatient);
		calc.CalculateTotalTherapyWeeks();
		assertEquals(7, testPatient.GetTotalTherapyWeeks());
	}
	
	@Test
	public void TestTherapyWeeks6() {
		PatientData testPatient = new PatientData("testFirst", "testLast", "10", 60, "M", 26, 150, "", "lungs", 10, 3, 15, 12, 15, 12, 8, 6);
		RadiationCalculator calc = new RadiationCalculator(testPatient);
		calc.CalculateTotalTherapyWeeks();
		assertEquals(6, testPatient.GetTotalTherapyWeeks());
	}
	
	@Test
	public void TestTherapyWeeks5() {
		PatientData testPatient = new PatientData("testFirst", "testLast", "10", 60, "M", 26, 150, "", "lungs", 10, 4, 15, 12, 15, 12, 8, 6);
		RadiationCalculator calc = new RadiationCalculator(testPatient);
		calc.CalculateTotalTherapyWeeks();
		assertEquals(5, testPatient.GetTotalTherapyWeeks());
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//calculate treatment tests//
	@Test
	public void TestTreatment() {
		PatientData testPatient = new PatientData("testFirst", "testLast", "10", 60, "M", 26, 150, "", "lungs", 10, 4, 15, 12, 15, 12, 8, 6);
		RadiationCalculator calc = new RadiationCalculator(testPatient);
		calc.CalculateTreatment();
		assertEquals(5, testPatient.GetTotalTherapyWeeks());
		assertEquals("High", testPatient.GetRecommendedRiskLevel());
		assertEquals(2135.71, testPatient.GetTotalDoseHighRisk(), 10);
		assertEquals(1421.43, testPatient.GetTotalDoseMedRisk(), 10);
		assertEquals(707.14, testPatient.GetTotalDoseLowRisk(), 10);
	}
}