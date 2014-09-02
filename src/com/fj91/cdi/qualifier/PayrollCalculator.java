package com.fj91.cdi.qualifier;

import java.util.List;

public interface PayrollCalculator {

	Double calculate(List<Employee> employees);
	
}
