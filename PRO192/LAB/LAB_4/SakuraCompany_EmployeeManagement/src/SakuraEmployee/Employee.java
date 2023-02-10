package SakuraEmployee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Employee {
	private String fullName;
	private Integer age;
	private String birth;
	private Integer daysOfWorkPerMonth;
	protected Long salary;
	Scanner scan = new Scanner(System.in);
	//Setter and Getter
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public Integer getDaysOfWorkPerMonth() {
		return daysOfWorkPerMonth;
	}
	public void setDaysOfWorkPerMonth(Integer daysOfWorkPerMonth) {
		this.daysOfWorkPerMonth = daysOfWorkPerMonth;
	}

	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	//Constructor
	public Employee() {
		super();
	}
	public Employee(String fullName, Integer age, String birth, Integer daysOfWorkPerMonth, Long slary) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.birth = birth;
		this.daysOfWorkPerMonth = daysOfWorkPerMonth;
		this.salary = slary;
	}
	public void inputEmployee() {
		fullName = inputName();
		age = inputAge();
		birth = inputBirth();
		daysOfWorkPerMonth = inputDays();
	}
	public String inputName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fullname: ");
		String name = scan.nextLine();
		return name;
	}
	public Integer inputAge() {
		Integer age = 0;
		Scanner scan = new Scanner(System.in);
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
	public String inputBirth() {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		try {
			System.out.println("Enter birthday (dd-MM-yyyy): ");
			date = df.parse(scan.nextLine());
			System.out.println(df.format(date));
		} catch (ParseException e) {
			System.err.println("Failed date format, will take current date (" + df.format(date) + ")!");
			System.out.println();
		}
		return df.format(date);
	}
	public Integer inputDays() {
		Integer days = 0;
		Scanner scan = new Scanner(System.in);
		while(days == 0) {
			try {
				System.out.println("Enter days of work this month (int): ");
				days = Integer.parseInt(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return days;
	}
	public Long calculateSalary() {
		return (long) 0;
	}
	@Override
	public String toString() {
		return "FULL NAME: " + fullName + "\tAGE:" + age + "\tBIRTH: " + birth  + "\n" + "Working days this month: ".toUpperCase() + daysOfWorkPerMonth + "\t";
	}
}
