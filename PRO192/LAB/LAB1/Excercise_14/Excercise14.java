public class Excercise14 {
	public static void main(String[] args) {
		float number = (float) (Math.random()*10);
		System.out.println();
		System.out.format("%.2f point = %c ", number, converToChar(number));
		
	}
	public static int converToChar(float number) {
		if (number >= 8.5 && number <= 10) {
			return 65;
		} else if(number >= 7 && number <= 8.4) {
			return 66;
		} else if(number >=5.5 && number <= 6.9) {
			return 67;
		} else if(number >= 4 && number <= 5.4) {
			return 68;
		} else if (number >= 0 && number <= 3.9) {
			return 70;
		} 
		return 70;
	}
}
