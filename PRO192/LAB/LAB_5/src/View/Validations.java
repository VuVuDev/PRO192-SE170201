package View;

import java.util.Scanner;
import java.util.function.Predicate;

public class Validations {
	public static final Scanner scan = new Scanner(System.in);
	
	public String getAndValidValue(String message, Predicate<String> validator, String errorMessage) {
	    String input = "";
	    boolean isValid = false;
	    
	    while (!isValid) {
	        System.out.println(message);
	        input = scan.nextLine();
	        
	        if (validator.test(input)) {
	            isValid = true;
	        } else {
	            System.out.println(errorMessage);
	        }
	    }
	    
	    return input;
	}

	
}
