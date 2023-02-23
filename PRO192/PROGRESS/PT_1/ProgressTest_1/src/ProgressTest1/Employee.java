package ProgressTest1;

import java.util.Scanner;

public abstract class Employee {
	private String fullName;
	private String address;
	private Integer age;
	protected Float salary;
	
	private static final Scanner scan = new Scanner(System.in);
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public Employee () {
		super();
	}
	public Employee(String fullName, String address, Integer age, Float salary) {
		super();
		this.fullName = fullName;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	public void input() {
		fullName = inputName();
		address = inputAdress();
		age = inputAge();
	}
	
	public String inputName() {
		System.out.println("Enter fullname: ");
		String name = scan.nextLine();
		return name;
	}
	public String inputAdress() {
		System.out.println("Enter Address: ");
		String address = scan.nextLine();
		return address;
	}
	public Integer inputAge() {
		Integer age = 0;
		while(age == 0) {
			try {
				System.out.println("Enter age (int): ");
				age = Integer.parseInt(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return age;
	}
	
	public abstract Float salaryCalculator();
	@Override
	public String toString() {
		return "FULL NAME: " + fullName + "\tSALARY: " + salary + "\tADDRESS: " + address;
	}
	
	
}
