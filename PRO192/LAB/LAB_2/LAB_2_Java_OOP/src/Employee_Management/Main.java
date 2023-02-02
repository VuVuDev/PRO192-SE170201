package Employee_Management;

import java.util.*;

public class Main {
	boolean exit;
	boolean exit_FunctMenu;
	
	public static void main(String[] args) {
		Main menu = new Main();
		menu.runMenu();
	}
	
	public void runMenu() {
		while (!exit) {
			exit_FunctMenu = false;
			printMenu();
			Integer choice = getInput();
			performAction(choice);
		}
	}
	public void printMenu() {
		System.out.println();
		System.out.println("LAB_2 OOP - Employee Management - VO VAN VU" );
		System.out.println("____________________________________________");
		System.out.println();
		System.out.println("1. Hand input 10 employees information");
		System.out.println("2. Random 10 employees information (recommend)");
		System.out.println("3. EXIT PROGRAM"); 
		System.out.println("____________________________________________");
	}
	//Get option
	public Integer getInput() {
		Integer choice = -1;
		Scanner sc = new Scanner(System.in);
		while(choice < 1 || choice > 3) {
			try {
				System.out.print("\nEnter your choice(1-3): ");
				choice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection, Please try again.");
			}
		}
		
		return choice;
	}
	
	//Perform user action
	public void performAction(Integer choice) {
		switch(choice) {
			case 1:	
				inputEmployee(); break;
			case 2: 
				randomEmployee(); break;
			case 3: 
				exit = true;
				System.out.println(" >> Thank you for using my program <<");	
				break;
			default:
				System.out.println("An unknow error has occured!");
				System.out.println();
		}
	}
	//------------------------------------------------------------------------------------
	//Hand Input Employee
	public void inputEmployee() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		System.out.println("Oke la");
	}
	public void addOneUser(ArrayList<Employee> employees) {
		String name = inputName();
		Integer age = inputAge();
		String address = inputAddress();
		Double baseSalary = 1.05;
		Float coefficient = inputCoefficient();
		employees.add(new Employee(name, age, address, baseSalary, coefficient));
	}
	
	public String inputName() {
		String name = "";
		return name;
	}
	public Integer inputAge() {
		Integer age = 1;
		return age;
	}
	public String inputAddress() {
		String address = "";
		return address;
	}
	public Float inputCoefficient() {
		Float coefficient = (float) 0;
		return coefficient;
	}
	//------------------------------------------------------------------------------------
	//Random input for 10 employees
	public void randomEmployee() {
		System.out.println();
		System.out.println("THIS PROGRAM WILL RANDOM 10 EMPLOYEES INFORMATION...");
		System.out.println();
		
		//Initialize attribute of Object Employee
		String name;
		Integer age;
		String address;
		Double baseSalary;
		Float coefficient;
		//Initialize list of Object Employee
		Employee[] employeeList = new Employee[10];
		for (int i = 0 ; i < employeeList.length; i++) {
			name = randomName();
			age = randomAge();
			address = randomAddress();
			coefficient = randomCoefficient();
			baseSalary = 1.050000;
			employeeList[i] = new Employee(name, age, address, baseSalary, coefficient);
			employeeList[i].salary = employeeList[i].calculateSalary();
			employeeList[i].salary = Math.floor(employeeList[i].salary*1000)/1000;
			
		}
		//call function
		try {
			System.out.println("Wait a few seconds for the program to execute...");
			System.out.println();
			Thread.sleep(1200);
			System.out.println("Executed!".toUpperCase());
			runFunctionMenu(employeeList);
		} catch (InterruptedException ex) {
			ex.printStackTrace(); 
		} 
	}
	
	//Random Employee Info
	public String randomName() {
		//Name source
		String[] firstName = {"Kim", "Tran", "Luu", "Vu", "Mai", "Ly", "Van", "Lam", "Mac", "Hau", "Trieu"};
		String[] middleName = {"Van", "Thi", "Gia", "Ha", "Hoa", "Duc", "Anh", "Phuc", "Huy", "Bao", "Quy"};
		String[] lastName = {"Khan", "Tien", "Hanh", "Nam", "Anh", "Duc", "Hoan", "Tue", "Thang", "Oanh", "Kien"};
		//Take index to random
		Random random = new Random();
		int fnIndex = random.nextInt(firstName.length);
		int mdnIndex = random.nextInt(middleName.length);
		int lnIndex = random.nextInt(lastName.length);
		//Complete the name
		String name = firstName[fnIndex] + " " + middleName[mdnIndex] + " " + lastName[lnIndex];

		return name;
	}
	public Integer randomAge() {
		//Random age from 20 to 55
		Integer age = (int) (Math.random() *26 + 20);
		return age;
	}
	public String randomAddress() {
		//Address location
		String[] location = {"Da Nang City", "Nha Trang", "Binh Duong", "Ho Chi Minh", "Ha Noi Capital", "Hai Phong", "Quang Nam", "Thua Thien-Hue", "Tien Giang", "Binh Dinh", "Gia Lai City"};
		//Take index of the address source
		Random random = new Random();
		int addIndex = random.nextInt(location.length);
		//complete the address
		String address = location[addIndex];
		
		return address;
	}
	public Float randomCoefficient() {
		Float coefficient = (float) Math.random()* 9 + 1;
		coefficient = (float) Math.floor(coefficient*10)/10;
		return coefficient;
	}
	
	//Menu Function < random >to Manage
	public void runFunctionMenu(Employee[] employeeList) {
		while(!exit_FunctMenu) {
			functionMenu();
			Integer option = getOption();
			executeFunction(option, employeeList);
		}
	}
	public void functionMenu() {
		System.out.println("\nSelect the function you want to perform: ");
		System.out.println("1. Display information of all employees.");
		System.out.println("2. Display information of a employee you want to by index.");
		System.out.println("3. Calculate total of salary.");
		System.out.println("4. Sort list of employee descending by name.");
		System.out.println("5. Sort list of employee descending by salary(BONUS).");
		System.out.println("6. EXIT Function Menu");
	}
	public Integer getOption() {
		Integer option = -1;
		Scanner sc = new Scanner(System.in);
		while(option < 1 || option > 8) {
			try {
				System.out.print("\nEnter your choice(1-5): ");
				option = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection, Please try again.");
			}
		}
		return option;
	}
	public void executeFunction(Integer option, Employee[] employeeList) {
		switch(option) {
			case 1: showAllEmployeesInfo(employeeList); pressEnter();;break;
			case 2: showEmployeeInfo(employeeList); break;
			case 3: totalOfSalary(employeeList); break;
			case 4: sortByName(employeeList); break;
			case 5: sortBySalary(employeeList); break;
			case 6: 
				exit_FunctMenu = true;
				System.out.println(" >> EXITED MENU FUNCTION! <<");	
				break;
			default: 
				System.out.println("An unknow error has occured!");
				System.out.println();
		}
	}
	
	//show up All Employees Info
	public void showAllEmployeesInfo(Employee[] list) {
		System.out.println();
		printHeader();
		System.out.println();
		for (int i = 0; i < list.length ; i++) {
			System.out.print("  " + (i+1) + ".\t|");
			list[i].exportEmployee();
			System.out.println();
		}
	}
	//show up a Employee Info 
	public void showEmployeeInfo(Employee[] list) {
		Scanner scan = new Scanner(System.in);
		Integer index = -1;

		while (index < 0 || index > 10) {
			try {
				System.out.print("\nEnter index of employee you want to (1 - 10): ");
				index = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection, Please try again.");
			}
		}
		System.out.println();
		printHeader();
		for (int i = 0; i < list.length ; i++) {
			if (index -1 == i) {
				System.out.println();
				System.out.print("  " + (i+1) + ".\t|");
				list[i].exportEmployee();
				System.out.println();
				pressEnter();
				}
		}
	}
	
	public void totalOfSalary(Employee[] list) {
		System.out.println();
		System.out.print("TOTAL OF SALARY IS: ");
		Double total = totalOfSalaryCalculator(list);
		total = Math.floor(total*1000)/1000;
		System.out.print(total + ".000 VND");
		System.out.println();
		pressEnter();
	}
	
	public Double totalOfSalaryCalculator(Employee[] list) {
		Double total = (double) 0;
		for (var item: list) {
			total += item.salary;
		}
		return total;
	}
	
	public void sortByName(Employee[] list) {
		List<Employee> ls = Arrays.asList(list);
		System.out.println();
		System.out.println("BEFORE SORT BY NAME: ");
		showAllEmployeesInfo(list);
		System.out.println();
		//Sort
		Collections.sort(ls, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println();
		System.out.println("AFTER SORT BY NAME: ");
		System.out.println();
		printHeader();
		System.out.println();
		for (Employee item: ls) {
			System.out.print("  " + (ls.indexOf(item)+1) + ".\t|");
			item.exportEmployee();
			System.out.println();
		}
		pressEnter();
	}
	public void sortBySalary(Employee[] list) {
		List<Employee> ls = Arrays.asList(list);
		System.out.println();
		System.out.println("BEFORE SORT DESCENDING BY SALARY: ");
		showAllEmployeesInfo(list);
		System.out.println();
		
		Collections.sort(ls, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o2.getSalary() - o1.getSalary());
			}
		});
		
		System.out.println();
		System.out.println("AFTER SORT DESCENDING BY SALARY: ");
		System.out.println();
		printHeader();
		System.out.println();
		for (Employee item: ls) {
			System.out.print("  " + (ls.indexOf(item)+1) + ".\t|");
			item.exportEmployee();
			System.out.println();
		}
		pressEnter();
	}
	public void pressEnter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nOke? Press Enter to continute...!");
		scan.nextLine();
		
	}
	public void printHeader() {
		System.out.print("Index:\t");
		System.out.print("Name:\t\t\t");
		System.out.print("Age:\t\t");
		System.out.print("Address:\t\t");
		System.out.print("Base salary:\t\t");
		System.out.print("Slalry:\t\t");
		System.out.print("Coefficient:\t\t");
	}
}
