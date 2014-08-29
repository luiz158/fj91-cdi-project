package com.fj91.cdi.inject;

public class TaxCalculator {

	public TaxCalculator() {
		System.out.println("Tax Calculator Created!");
	}
	
	public Double calculate(Double salary) {
		return salary * 0.10;
	}

}
