package com.fj91.cdi.qualifier;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/payroll-calculator")
public class PayrollCalculatorServlet extends HttpServlet {

	private static final long serialVersionUID = 7245423880089118232L;
	
	@Inject @Simulator
	private PayrollCalculator calculator;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee alexandre = new Employee(100.0);
		Employee will = new Employee(200.0);
		Employee fred = new Employee(200.0);
		List<Employee> employees = Arrays.asList(alexandre, will, fred);
		
		Double calculatedValue = calculator.calculate(employees);
		
		resp.getOutputStream().print(calculatedValue);
	}
	
}
