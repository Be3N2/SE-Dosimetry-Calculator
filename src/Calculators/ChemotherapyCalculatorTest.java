package Calculators;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculators.ChemotherapyCalculator;

import Core.PatientData;

public class ChemotherapyCalculatorTest {
	double heightX = 52;
	double weightX = 150;
	
	public double bodySurfaceArea(double baseDosage) {
		double height = heightX * 2.54; //inches to center meters
		double weight = weightX;
		double bsa = Math.pow((height*weight)/3600, 2);
		
		return((baseDosage/bsa) + baseDosage);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		assertEquals(bodySurfaceArea(1200),1239.62,1);
		assertEquals(bodySurfaceArea(120),123.96,1);
		assertEquals(bodySurfaceArea(354),365.68,1);
	}

}
