public class Excercise13 {
	public static void main(String[] args) {
		double[] pointArray = new double[10];
		randomArrayElement(pointArray);
		exportArray(pointArray); 
		greaterFive(pointArray);
	}
	public static void randomArrayElement(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (double) (Math.random()*10.2);
		}
	}
	public static void exportArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.format("  %.2f  |", array[i]);
		}
	} 
	public static void greaterFive(double[] array) {
		System.out.println("\n  All points have value greater than 5 is: ");
		for (int i = 0; i < array.length; i++) {
			if(array[i] < 0 || array[i] > 10 || array[i] < 5) {
				System.out.format("  NULL  |");
			} else {
				System.out.format("  %.2f  |", array[i]);
			}
		}
	}
}
