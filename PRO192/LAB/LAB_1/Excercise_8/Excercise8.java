import java.util.Scanner;

public class Excercise8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---FIBONACCI to N---");
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int f0 = 0;
		int f1 = 1;
		int fn = 0;
	  if (n < 0) {
	    System.out.println("n must greater than 0");
	    System.exit(0);
	  }
		System.out.print("FIBONACCI: ");	
	  for (int i = 1; i <= n; i++) {
	    if(i == 1) {
	      System.out.print(f0 + ", ");
	      continue;
	    }
	    if(i == 2) {
	      System.out.print(f1 + ", ");
	      continue;
	    }
	    fn = f0 + f1;
	    f0 = f1;
	    f1 = fn;
	    System.out.print(fn + ", ");
	  }
	}
}
