package com.fj91.cdi.qualifier;

public class Employee {

	private Double salary;

	public Employee(Double salary) {
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
