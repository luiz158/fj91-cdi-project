package com.fj91.cdi.qualifier;

import java.util.List;

public class PayrollCalculatorReal implements PayrollCalculator {

	public PayrollCalculatorReal() {
		System.out.println("Payroll Calculador Real created!");
	}
	
	@Override
	public Double calculate(List<Employee> employees) {
		Double totalAmount = 0.0;
		for (Employee employee : employees) {
			totalAmount += employee.getSalary();
		}
		return totalAmount;
	}

}
