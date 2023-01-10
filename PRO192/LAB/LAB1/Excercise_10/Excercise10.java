public class Excercise10 {
	public static void main(String[] args) {
		double[] array = new double[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (double) (Math.random()*10.2);
		}
		System.out.println();
		exportArray(array, array.length); 
		if (averageFunc(array, array.length) == -1) {
			System.out.format("\n  Invalid Value (%d) !", -1);
			System.exit(0);
		}
		System.out.format("  AVERAGE IS : %.2f%n", averageFunc(array, array.length));
	}		
	public static void exportArray( double[] array, int length) {
		for (int i = 0; i < length; i++) {
			System.out.format("  %.2f  | ", array[i]);	
		}
	}
	public static double averageFunc(double[] array, int length) {
		double sum = 0;
		double aver = 0;
		
		for (int i = 0; i < length; i++) {
			if (array[i] < 0 || array[i] > 10) {
				return -1;
			} else {
				sum += array[i];
			}
			
		}
		System.out.println();
		return aver = (double) sum/length;
	}
}
