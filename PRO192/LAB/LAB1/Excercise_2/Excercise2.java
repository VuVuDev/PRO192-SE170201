public class Excercise2 {
	public static void main(String[] args) {
		System.out.println("Find x from ax+b = 0");
		int number_1 = Integer.parseInt(args[0]);
		int number_2 = Integer.parseInt(args[1]);
		System.out.println("Number a: " + number_1);
		System.out.println("Number b: " + number_2);
		float result = (float)-number_2/number_1;
		System.out.format("Number x was found is: %.3f%n" , result);
	}
}
