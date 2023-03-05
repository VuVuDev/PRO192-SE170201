package View;

import java.util.*;

import Controller.School;
import Model.Student;

//import Controller.School;
//import Model.Student;

public class SchoolManagement extends Menu{
	private School service = new School();
//	public static final Scanner scan = new Scanner(System.in);
	static String[] menu = {
			"List all student",
			"Add new student",
			"Search student by different criteria",
			"Sort Student",
			"Exit!"
			};
	
	public SchoolManagement() {
		super("SCHOOL MANAGEMENT SYSTEM", menu);
	}
	@Override
	public void execute(int n) {
		switch(n) {
		case 1: listAllStudent(); break;
		case 2: addStudent(); break;
		case 3: searchStudent(); break;
		case 4: sortStudent(); break;
		case 5: System.out.println("Program end! \nThank you for using my program");
		default: System.exit(0);
		}
	}
	
	private void listAllStudent() {
		service.listAllStudent();
	}
	private void addStudent() {
		service.addStudent();
	}
	private void searchStudent() {
		String[] mSearch = {"Search by ID","Search by name"};
		Menu m = new Menu("Student searching", mSearch) {
			public void execute(int n) {
				Scanner scan = new Scanner(System.in);
				ArrayList<Student> temp = null;
				switch(n) {
				case 1: 
					System.out.println("Enter Student ID:");
					String val = scan.nextLine();
					temp = service.search(ls -> ls.getId().equals(val));
					break;
				case 2: 
					System.out.println("Enter name: ");
					String text = scan.nextLine();
					System.out.println("Cai Lz ma" + text);
					temp = service.search(ls -> ls.getName().contains(text));
					break;
				default:
					return;
				}
				service.listAllStudent(temp);
			}
		};
		m.run();	
	}
	private void sortStudent() {
		String[] mSort = {"Sort by name","Sort by ID","Sort by average score"};
		Menu m = new Menu("Student sort", mSort) {
			public void execute(int n) {
				switch(n) {
				case 1:
					service.sortByName();
					break;
				case 2:
					service.sortByID();
					break;
				case 3:
					service.sortByAverage();
				default:
					return;
				}
			}
		};
		m.run();
	}
}
