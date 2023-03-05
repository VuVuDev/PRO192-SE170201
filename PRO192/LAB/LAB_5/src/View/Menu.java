package View;

import java.util.*;

public abstract class Menu {
	public static final Scanner scan = new Scanner(System.in);
	private String title;
	private ArrayList<String> options = new ArrayList<>();
	Validations valid = new Validations();
	
	//constructor
	
	public Menu(String title, String[] op) {
		this.title = title;
		
		this.options.addAll(Arrays.asList(op));
	}
	
	//display menu of function 
	
	public void menuDisplay() {
		System.out.println("----------------------------------");
        System.out.println(title);
        System.out.println("----------------------------------");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
//        System.out.println("0. Quit");
        System.out.println("----------------------------------");
	}
	public Integer getChoice() throws NumberFormatException {
		int choice = scan.nextInt();
		return choice;
	}
	
	public void run() {
		while (true) {
			menuDisplay();
			int choice = getChoice();
			execute(choice);
			if (choice>options.size()) break;
		}
	}
	 public abstract void execute(int n);
}
