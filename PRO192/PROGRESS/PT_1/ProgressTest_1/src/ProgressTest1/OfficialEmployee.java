package ProgressTest1;

import java.util.Scanner;

public class OfficialEmployee extends Employee {
	private Integer baseSalary;
	private Float coefficient;
	
	public static final Scanner scan = new Scanner(System.in);
	
	public Integer getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(Integer baseSalary) {
		this.baseSalary = baseSalary;
	}


	public Float getCoefficient() {
		return coefficient;
	}


	public void setCoefficient(Float coefficient) {
		this.coefficient = coefficient;
	}
	
	public OfficialEmployee() {
		super();
	}

	public OfficialEmployee(String fullName, String address, Integer age, Float salary,Integer baseSalary, Float coefficient) {
		super();
		this.baseSalary = baseSalary;
		this.coefficient = coefficient;
	}
	
	public void input() {
		super.input();
		baseSalary = inputBaseSalary();
		coefficient = inputCoefficient();
	}
	
	public Integer inputBaseSalary() {
		Integer baseSalary = 0;
		while(baseSalary == 0) {
			try {
				System.out.println("Enter base salary (int): ");
				baseSalary = Integer.parseInt(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return baseSalary;
	}
	public Float inputCoefficient() {
		Float coefficient = (float) 0;
		while(coefficient == 0) {
			try {
				System.out.println("Enter coefficient (int): ");
				coefficient = Float.parseFloat(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return coefficient;
	}
	@Override
	public Float salaryCalculator() {
		this.salary = getBaseSalary()*getCoefficient();
		return this.salary;
	}
	
}
