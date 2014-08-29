package com.fj91.cdi.inject;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/tax-calculator")
public class TaxCalculatorServlet extends HttpServlet {

	private static final long serialVersionUID = 3716737146713067849L;

	@Inject //EAGER Inject by default
	private TaxCalculator calculator;
	
	public TaxCalculatorServlet() {
		System.out.println("Tax Calculator Servlet Created!");
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Tax Calculator Servlet Initialized");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Double salary = Double.parseDouble(req.getParameter("salary"));
		Double calculatedValue = calculator.calculate(salary);
		resp.getOutputStream().print(calculatedValue);
	}
	
}
