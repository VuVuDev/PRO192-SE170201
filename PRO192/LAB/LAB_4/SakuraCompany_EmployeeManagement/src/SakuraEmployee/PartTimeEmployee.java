package SakuraEmployee;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
	public Float discount = (float) 0.5;
	Scanner scan = new Scanner(System.in);
	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	
	public PartTimeEmployee() {
		super();
	}
	public PartTimeEmployee(Float discount) {
		super();
		this.discount = discount;
	}
	@Override
	public Long calculateSalary() {
		this.salary = (long) (this.getDaysOfWorkPerMonth()*1000000*getDiscount()); 
		return this.salary;
	}
	
	@Override
	public String toString() {
		return super.toString() + "ROLE: PART-TIME " + "\n" +"DISCOUNT: " +discount + "\n" + "SALARY: " +salary + "\n";
	}
	
}
