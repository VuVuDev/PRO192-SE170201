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
		System.out.println("1. Hand input employees information");
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
		runInputFunctionMenu(employees);
	}
	
	public void runInputFunctionMenu(ArrayList<Employee> employees) {
		while(!exit_FunctMenu) {
			printFunctionMenu();
			Integer option = getOption_other();
			executeInputFunction(option, employees);
		}
	}
	public void printFunctionMenu() {
		System.out.println("\nSelect the function you want to perform: ");
		System.out.println("1. Add a employee.");
		System.out.println("2. Add numbers of employee");
		System.out.println("3. Display information of all employees.");
		System.out.println("4. Display information of a employee you want to by index.");
		System.out.println("5. Calculate total of salary.");
		System.out.println("6. Sort list of employee descending by name.");
		System.out.println("7. Sort list of employee descending by coefficient(BONUS).");
		System.out.println("8. EXIT Function Menu");
	}
	public void executeInputFunction(Integer option, ArrayList<Employee> employees ) {
		switch(option) {
			case 1: addOneUser(employees); pressEnter(); break;
			case 2: 
					addNumbersOfUser(employees); pressEnter(); break;
			case 3:
				Employee[] employeeList = new Employee[employees.size()];
				employeeList = employees.toArray(employeeList);
				showAllEmployeesInfo(employeeList);
				pressEnter();
				break;
			case 4: 
				Employee[] employeeList_1 = new Employee[employees.size()];
				employeeList = employees.toArray(employeeList_1);
				showEmployeeInfo(employeeList_1);
				break;
			case 5: 
				Employee[] employeeList_2 = new Employee[employees.size()];
				employeeList = employees.toArray(employeeList_2);
				totalOfSalary(employeeList_2);
				break;
			case 6:
				Employee[] employeeList_3 = new Employee[employees.size()];
				employeeList = employees.toArray(employeeList_3);
				sortByName(employeeList_3);
				break;
			case 7: 
				Employee[] employeeList_4 = new Employee[employees.size()];
				employeeList = employees.toArray(employeeList_4);
				sortByCoeficient(employeeList_4);
				break;
			case 8:
				exit_FunctMenu = true;
				System.out.println(" >> EXITED MENU FUNCTION! <<");	
				break;
			default: 
				System.out.println("An unknow error has occured!");
				System.out.println();
		}
	}
	public void addNumbersOfUser(ArrayList<Employee> employees) {	
		Integer number = getNumber();
		System.out.println();
		System.out.println("Entering the information of ".toUpperCase()+ number +" employees".toUpperCase());
		
		for (int i = 0; i < number; i++ ) {
			System.out.println();
			System.out.println("Entering data for employees " + (i+1) + ": ");
			addOneUser(employees);
		}
	}
	
	public Integer getNumber() {
		Integer number = 0;
		Scanner scan = new Scanner(System.in);
		while(number == 0) {
			try {
				System.out.print("Enter number of employee: ");
				number = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return number;
	}
	public void addOneUser(ArrayList<Employee> employees) {
		String name = inputName();
		Integer age = inputAge();
		String address = inputAddress();
		Double baseSalary = 1.05;
		Float coefficient = inputCoefficient();
		employees.add(new Employee(name, age, address, baseSalary, coefficient));
		for(Employee ls : employees) {
			ls.setSalary(ls.calculateSalary());
			ls.setSalary(Math.floor(ls.getSalary()*1000)/1000);
		}
		
	}
	
	public String inputName() {
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name:");
		name = scan.nextLine();
		return name;
	}
	public Integer inputAge() {
		Integer age = 0;
		Scanner scan = new Scanner(System.in);
		while(age == 0) {
			try {
				System.out.print("Enter age (int): ");
				age = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return age;
	}
	public String inputAddress() {
		String address;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter address:");
		address = scan.nextLine();
		return address;
	}
	public Float inputCoefficient() {
		Float coefficient = (float) 0;
		Scanner scan = new Scanner(System.in);
		while (coefficient == 0) {
			try {
				System.out.print("Enter coefficient (float): ");
				coefficient = Float.parseFloat(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
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
			employeeList[i].setSalary(employeeList[i].calculateSalary());
			employeeList[i].setSalary(Math.floor(employeeList[i].getSalary()*1000)/1000);
			
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
		String[] firstName = {"Kim", "Tran", "Luu", "Vu", "Mai", "Ly", "Van", "Lam", "Mac", "Hau", "Trieu", "Khan"};
		String[] middleName = {"Van", "Thi", "Gia", "Ha", "Hoa", "Duc", "Anh", "Phuc", "Huy", "Bao", "Quy", "Tan"};
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
		System.out.println("5. Sort list of employee descending by coefficient(BONUS).");
		System.out.println("6. EXIT Function Menu");
	}
	public Integer getOption() {
		Integer option = -1;
		Scanner sc = new Scanner(System.in);
		while(option < 1 || option > 8) {
			try {
				System.out.print("\nEnter your choice(1-6): ");
				option = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection, Please try again.");
			}
		}
		return option;
	}
	public Integer getOption_other() {
		Integer option = -1;
		Scanner sc = new Scanner(System.in);
		while(option < 1 || option > 8) {
			try {
				System.out.print("\nEnter your choice(1-8): ");
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
			case 5: sortByCoeficient(employeeList); break;
			case 6: 
				exit_FunctMenu = true;
				System.out.println(" >> EXITED MENU FUNCTION! <<");	
				break;
			default: 
				System.out.println("An unknow error has occured!");
				System.out.println();
		}
	}
//MANAGEMENT FUNCTION.................................................................
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
				System.out.print("\nEnter index of employee you want to (1 - "+ list.length + "): ");
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
			total += item.getSalary();
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
	public void sortByCoeficient(Employee[] list) {
		List<Employee> ls = Arrays.asList(list);
		System.out.println();
		System.out.println("BEFORE SORT DESCENDING BY COEFFICIENT: ");
		showAllEmployeesInfo(list);
		System.out.println();
		
		Collections.sort(ls, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o2.getCoefficient() - o1.getCoefficient());
			}
		});
		
		System.out.println();
		System.out.println("AFTER SORT DESCENDING BY COEFFICIENT: ");
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
// SUB DISPLAY FUNCTION
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
