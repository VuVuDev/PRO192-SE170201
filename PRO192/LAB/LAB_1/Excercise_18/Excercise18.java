import java.util.Scanner;

public class Excercise18 {
	public static String normalize(String str) {
		str = str.trim();
		str = str.replaceAll("\\s+", " ");
		return str;	
	}
	public static String normalizeProperNouns(String str) {
		str = normalize(str);
		String[] temp = str.split(" ");
		str = "";
		for (int i = 0; i <  temp.length; i++) {
			str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
			if (i < temp.length - 1) {
				str += " ";
			}
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to nomalize: ");
		String strInput = sc.nextLine();

		Excercise18 normalizeString = new Excercise18();
		strInput = normalizeString.normalizeProperNouns(strInput);
		System.out.println(strInput);
	} 
}
