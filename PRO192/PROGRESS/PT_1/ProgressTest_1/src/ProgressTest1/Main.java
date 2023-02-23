package ProgressTest1;

import java.util.*;

public class Main {
	public static final Scanner scan = new Scanner(System.in);
	boolean exit;
	boolean exitFunctionMenu;
	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		Main menu = new Main();
		menu.runProgram(employeeList);
	}
	
	public void runProgram(ArrayList<Employee> employeeList) {
		while(!exit) {
			exitFunctionMenu = false;
			Integer numberOfOptions = printMenu();
			Integer option = getOption(numberOfOptions, 0);
			performAction(option, employeeList);
		}
	}
	public Integer printMenu() {
		System.out.println("PROGRESS TEST 1 - EMPLOYEE MANAGEMENT");
		System.out.println("-----Vo Van Vu - PRO - SE170C01-----");
		System.out.println("1. Add a employee");
		System.out.println("2. Add numbers of employee");
		System.out.println("3. Display all employee");
		System.out.println("4. Display all employee have the same address");
		System.out.println("5. EXIT");
		return 5;
	}
	
	public Integer getOption(Integer numberOfOptions, Integer choice) {

		while(choice == 0) {
			try {
				String line = new String();
				System.out.print("Enter your choice (1 - "+ numberOfOptions + "): ");
				line = scan.nextLine();
				choice = Integer.parseInt(line.trim());
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection, Please try again.");
			}
		}
		return choice;
	}
	public void performAction(Integer option, ArrayList<Employee> employeeList) {
		switch(option) {
		case 1:
			inputOneEmployee(employeeList);break;
		case 2: 
			inputNumberOfEmployee(employeeList); break;
		case 3: 
			if (employeeList.size() == 0) {
				System.out.println();
				System.err.println("NO INFORMATION TO EXPORT!!!");
				System.out.println();
			} else {
				displayAllEmployee(employeeList);
				pressEnter(); 
			}
			break;
	
		case 4:
			if (employeeList.size() == 0) {
				System.out.println();
				System.err.println("NO INFORMATION TO EXPORT!!!");
				System.out.println();
			} else {
				displayAllEmployeeSameAddress(employeeList);
				pressEnter(); 
			}
			break;
		case 5: 
			exit = true;
			System.err.println(" >> Thank you for using my program <<".toUpperCase());
			System.exit(0);
			break;
		default: 
			System.err.println("An unknow error has occured!");
			System.out.println();	
				
		}
	}
	public void inputOneEmployee(ArrayList<Employee> employeeList) {
		while(!exitFunctionMenu) {
			Integer numberOfOptions = printMenuFunction();
			Integer option = getOption(numberOfOptions, 0);
			performAddAction(option, employeeList);
		}
	}
	public Integer printMenuFunction() {	
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("YOU ARE ADDING A EMPLOYEE");
		System.out.println("Do you want to add part-time or full-time employees?");
		System.out.println("1. Official employee");
		System.out.println("2. Sales Staff");
		System.out.println("3. Exit this add");
		return 3;
	}
	public Integer printMenuFunctionMany() {	
		System.err.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("YOU ARE ADDING NUMBERS OF EMPLOYEE");
		System.out.println("Do you want to add part-time or full-time employees?");
		System.out.println("1. Official employee");
		System.out.println("2. Sales Staff");
		System.out.println("3. Exit this add");
		return 3;
	}
	public void performAddAction(Integer option, ArrayList<Employee> employeeList) {
		switch(option) {
			case 1: 
				System.out.println("-----------------------------------------------------");
				System.out.println("ADDING 1 OFFICIAL EMPLOYEE: ");
				addOfficialEmployee(employeeList);pressEnter(); break;
			case 2:	
				System.out.println("-----------------------------------------------------");
				System.out.println("ADDING 1 PART TIME EMPLOYEE: ");
				addPartTimeUser(employeeList); pressEnter();;break;
			case 3: 
				exitFunctionMenu = true;
				System.out.println();
				System.err.println(" >> EXITED ADDING... <<");	
				System.out.println();
				break;
			default: 
				System.out.println("An unknow error has occured!");
				System.out.println();	
		}
	}
	public void inputNumberOfEmployee(ArrayList<Employee> employeeList) {
		while(!exitFunctionMenu) {
			Integer numberOfOptions = printMenuFunctionMany();
			Integer option = getOption(numberOfOptions, 0);
			performAddActionMany(option, employeeList);
		}
	}
	public void performAddActionMany(Integer option, ArrayList<Employee> employeeList) {
		switch(option) {
			case 1: addNumbersOfOfficialEmployee(employeeList); pressEnter();break;
			case 2:	addNumbersOfPartTimeEployee(employeeList); pressEnter(); break;
			case 3: 
				exitFunctionMenu = true;
				System.out.println();
				System.err.println(" >> EXITED ADDING... <<");	
				System.out.println();
				break;
			default:
				System.err.println("An unknow error has occured!");
				System.out.println();	
		}
	}
	public void addOfficialEmployee(ArrayList<Employee> employeeList) {
		Employee official = new OfficialEmployee();
		official.input();
		official.salaryCalculator();
;		employeeList.add(official);
	}
	public void addPartTimeUser(ArrayList<Employee> employeeList) {
		Employee partTime = new SaleStaff();
		partTime.input();
		partTime.salaryCalculator();
;		employeeList.add(partTime);
	}
	public void addNumbersOfOfficialEmployee(ArrayList<Employee> employeeList) {
		Integer numbers = getNumber();
		System.out.println();
		System.out.println("YOU ARE ADDING "+numbers+" OFFICIAL EMPLOYEES");
		for(int i = 0; i < numbers; i++) {
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter information of employee "+(i+1)+": ");
			addOfficialEmployee(employeeList);
		}
	}
	public void addNumbersOfPartTimeEployee(ArrayList<Employee> employeeList) {
		Integer numbers = getNumber();
		System.out.println();
		System.out.println("YOU ARE ADDING "+numbers+" PART-TIME EMPLOYEES");
		for(int i = 0; i < numbers; i++) {
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter information of employee "+(i+1)+": ");
			addPartTimeUser(employeeList);
		}
	}
	public Integer getNumber() {
		Integer number = 0;
		while(number == 0) {
			try {
				System.out.println("Enter numbers of employee to input information: ");
				number = Integer.parseInt(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.err.println("Invalid value, pls try again!");
			}
		}
		return number;
	}
	public void displayAllEmployee(ArrayList<Employee> employeeList) {
		System.out.println();
		System.out.println("ALL EMPLOYEE INFOMATION: ");
		for(Employee ls : employeeList) {
			System.out.println("-----------------------------------------------------");
			System.out.println("EID: " + (employeeList.indexOf(ls) + 1) + ": ");
			System.out.println(ls.toString());	
		}
	}
	public void displayAllEmployeeSameAddress(ArrayList<Employee> employeeList) {
		Employee[] ls = new Employee[employeeList.size()];
		ls = employeeList.toArray(ls);
	}
	public void pressEnter() {
		System.err.println("\nAll done! Press Enter to continue...!");
		scan.nextLine();
	}
}
