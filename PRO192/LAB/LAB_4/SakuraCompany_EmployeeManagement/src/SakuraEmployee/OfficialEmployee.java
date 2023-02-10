package SakuraEmployee;

import java.util.Scanner;

public class OfficialEmployee extends Employee {
	
	public Float otTime;
	Scanner scan = new Scanner(System.in);
	
	
	public Float getOtTime() {
		return otTime;
	}

	public void setOtTime(Float otTime) {
		this.otTime = otTime;
	}
	public OfficialEmployee() {
		super();
	}
	public OfficialEmployee(Float otTime) {
		super();
		this.otTime = otTime;
	}
	@Override
	public Long calculateSalary() {
		this.salary = (long) (this.getDaysOfWorkPerMonth()*1000000 + getOtTime()*100000); 
		return this.salary;
	}
	@Override
	public void inputEmployee() {
		super.inputEmployee();
		otTime = inputOTTime();
	}
	public Float inputOTTime() {
		Float otTime = (float) 0;
		Scanner scan = new Scanner(System.in);
		while(otTime == 0) {
			try {
				System.out.println("Enter OT time (float): ");
				otTime = Float.parseFloat(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return otTime;
	}
	@Override
	public String toString() {
		return super.toString() + "ROLE: Official" + "\n" + "OT TIME: " + otTime + "\n" + "SALARY: " + salary + "VND\n";
	}
}
