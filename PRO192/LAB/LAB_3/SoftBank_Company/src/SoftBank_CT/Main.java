package SoftBank_CT;

import java.util.*;

public class Main {
	boolean exit;
	boolean exit_Function;
	public static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Softbank> softBankList = new ArrayList<Softbank>();
		Main menu = new Main();
		menu.runProgram(softBankList);
	}
	
	public void runProgram(ArrayList<Softbank> softBankList) {
		while(!exit) {
			exit_Function = false;
			Integer numberOfOption = printMainMenu();
			Integer option = getOption(numberOfOption, 0);
			performMainAction(option, softBankList);
		}
	}
	public Integer printMainMenu() {
		System.out.println("SOFTBANK COMPANY - BRANCH MANAGEMENT");
		System.out.println("-----Vo Van Vu - PRO - SE170C01-----");
		System.out.println("1. Add a BRANCH");
		System.out.println("2. Add numbers of BRANCH");
		System.out.println("3. Display all BRANCH");
//		System.out.println("4. Display in detail of a BRANCH");
		System.out.println("4. EXIT");
		return 4;
	}
	public Integer getOption(Integer numberOfOptions, Integer choice) {
//		Scanner scan = new Scanner(System.in);
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
	public void performMainAction(Integer option, ArrayList<Softbank> softBankList) {
		switch(option) {
			case 1:
				inputOneBranch(softBankList); break;
			case 2:
				inputNumberOfBranch(softBankList); break;
			case 3: 
				if (softBankList.size() == 0) {
					System.out.println();
					System.err.println("NO INFORMATION TO EXPORT!!!");
					System.out.println();
				} else {
					displayAllBranch(softBankList);
					pressEnter(); 
				}
				break;
			case 4:
				exit = true;
				System.err.println(" >> Thank you for using my program <<".toUpperCase());
				System.exit(0);
				break;
			default:
				System.err.println("An unknow error has occured!");
				System.out.println();	
					
		}
	}
	public void inputOneBranch(ArrayList<Softbank> softBankList) {
		while(!exit_Function) {
			Integer numberOfOptions = printMenuFunction();
			Integer option = getOption(numberOfOptions, 0);
			performAddAction(option, softBankList);
		}
	}
	public Integer printMenuFunction() {	
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("YOU ARE ADDING A BRANCH");
		System.out.println("Do you want to add NORTH BRANCH or CENTRAL BRANCH?");
		System.out.println("1. North Branch");
		System.out.println("2. Central Branch");
		System.out.println("3. Exit this add");
		return 3;
	}
	public Integer printMenuFunctionMany() {	
		System.err.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("YOU ARE ADDING NUMBERS OF BRANCH");
		System.out.println("Do you want to add NORTH BRANCH or CENTRAL BRANCH?");
		System.out.println("1. North Branch");
		System.out.println("2. Central Branch");
		System.out.println("3. Exit this add");
		return 3;
	}
	public void performAddAction(Integer option, ArrayList<Softbank> softBankList) {
		switch(option) {
			case 1: 
				System.out.println("-----------------------------------------------------");
				System.out.println("ADDING 1 NORTH BRANCH: ");
				addNorthBank(softBankList);pressEnter(); break;
			case 2:	
				System.out.println("-----------------------------------------------------");
				System.out.println("ADDING 1 CENTRAL BRANCH: ");
				addCentralBank(softBankList); pressEnter();;break;
			case 3: 
				exit_Function = true;
				System.out.println();
				System.err.println(" >> EXITED ADDING... <<");	
				System.out.println();
				break;
			default: 
				System.out.println("An unknow error has occured!");
				System.out.println();	
		}
	}
	
	public void inputNumberOfBranch(ArrayList<Softbank> softBankList) {
		while(!exit_Function) {
			Integer numberOfOptions = printMenuFunctionMany();
			Integer option = getOption(numberOfOptions, 0);
			performAddActionMany(option, softBankList);
		}
	}
	public void performAddActionMany(Integer option, ArrayList<Softbank> softBankList) {
		switch(option) {
			case 1: addNumbersOfNorthBank(softBankList); pressEnter();break;
			case 2:	addNumbersOfCentralBank(softBankList); pressEnter(); break;
			case 3: 
				exit_Function = true;
				System.out.println();
				System.err.println(" >> EXITED ADDING... <<");	
				System.out.println();
				break;
			default:
				System.err.println("An unknow error has occured!");
				System.out.println();	
		}
	}
	public Integer getNumber() {
		Integer number = 0;
//		Scanner scan = new Scanner(System.in);
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

	public void addNorthBank(ArrayList<Softbank> softBankList) {
		Softbank north = new NorthBranch();
		north.input();
		north.costEstimatesCalculate();
		north.actualCostCalculate();
;		softBankList.add(north);
	}
	public void addCentralBank(ArrayList<Softbank> softBankList) {
		Softbank central = new CentralBranch();
		central.input();
		central.costEstimatesCalculate();
		central.actualCostCalculate();
;		softBankList.add(central);
	}
	public void addNumbersOfNorthBank(ArrayList<Softbank> softBankList) {
		Integer numbers = getNumber();
		System.out.println();
		System.out.println("YOU ARE ADDING "+numbers+" NORTH BRANCH");
		for(int i = 0; i < numbers; i++) {
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter information of branch "+(i+1)+": ");
			addNorthBank(softBankList);
		}
	}
	public void addNumbersOfCentralBank(ArrayList<Softbank> softBankList) {
		Integer numbers = getNumber();
		System.out.println();
		System.out.println("YOU ARE ADDING "+numbers+" CENTRAL BRANCH");
		for(int i = 0; i < numbers; i++) {
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter information of branch "+(i+1)+": ");
			addNorthBank(softBankList);
		}
	}
	public void displayAllBranch(ArrayList<Softbank> softBankList) {
		System.out.println();
		System.out.println("ALL BRANCH INFOMATION: ");
		for(Softbank ls : softBankList) {
			System.out.println("-----------------------------------------------------");
			System.out.println(ls.toString());	
		}
	}
	public void pressEnter() {
//		Scanner scan = new Scanner(System.in);
		System.err.println("\nAll done! Press Enter to continue...!");
		scan.nextLine();
	}
}
