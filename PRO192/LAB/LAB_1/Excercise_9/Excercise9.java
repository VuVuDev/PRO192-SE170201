public class Excercise9 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);

		System.out.println("______S = 1 + a^1 + a^2 + ... + a^n______"); 
		
		int sum = 1; 
		for (int i = 1; i <= n; i++ ) {
			sum = (int) sum + (int) Math.pow(a, i); 
		}
		System.out.format("Sum = %d", sum);
	}
}
