package ProgressTest1;

import java.util.Scanner;

public class SaleStaff extends Employee{

	private Integer allowance;
	private Integer sales;
	private Float comission;
	
	public static final Scanner scan = new Scanner(System.in);
	public Integer getAllowance() {
		return allowance;
	}
	public void setAllowance(Integer allowance) {
		this.allowance = allowance;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public Float getComission() {
		return comission;
	}
	public void setComission(Float comission) {
		this.comission = comission;
	}
	public SaleStaff() {
		super();
	};
	public SaleStaff(Integer allowance, Integer sales, Float comission) {
		super();
		this.allowance = allowance;
		this.sales = sales;
		this.comission = comission;
	}
	
	public void input() {
		super.input();
		allowance = inputAllowance();
		sales = inputSales();
		comission = inputComission();
	}
	public Integer inputAllowance() {
		Integer allowance = 0;
		while(allowance == 0) {
			try {
				System.out.println("Enter base salary (int): ");
				allowance = Integer.parseInt(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return allowance;
	}
	public Integer inputSales() {
		Integer sales = 0;
		while(sales == 0) {
			try {
				System.out.println("Enter number of sales (int): ");
				sales = Integer.parseInt(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return sales;
	}
	public Float inputComission() {
		Float comission = (float) 0;
		while(comission == 0) {
			try {
				System.out.println("Enter comission (int_%): ");
				comission = Float.parseFloat(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return comission;
	}
	@Override
	public Float salaryCalculator() {
		this.salary = getAllowance() + getComission()/100 * getSales();
;		return this.salary;
	}
}
