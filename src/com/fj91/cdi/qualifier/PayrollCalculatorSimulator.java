package com.fj91.cdi.qualifier;

import java.util.List;

@Simulator
public class PayrollCalculatorSimulator implements PayrollCalculator {

	public PayrollCalculatorSimulator() {
		System.out.println("Payroll Calculador Simulator created!");
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
