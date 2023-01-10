import java.util.Scanner;

public class Part3 {
	public static void enterName(String list[]) {
		for (int i =0; i < list.length ; i ++) {
			Scanner sc = new Scanner(System.in);
			System.out.print(" Student name " + (i + 1) + " : ");
			list[i] = sc.nextLine();
		}
	}
	public static void exportName(String list[]) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(" Student " + (i + 1) + " : " + normalizeProperNouns(list[i]));
			System.out.println();
		}
	}
	
	//Normalize the first character of all name to upper case
	public static String normalize(String str) {
		str = str.trim();
		str = str.replaceAll("\\s+", " ");
		return str;
	}
	public static String normalizeProperNouns(String str) {
		str = normalize(str);
		String[] temp = str.split(" ");
		str = "";
		for(int i = 0; i < temp.length ; i++) {
			str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
			if(i < temp.length -1) {
				str = str + " ";
			}
		}
		return str;
	}

	public static void main(String[] args) {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter number of students: ");
		number = sc.nextInt();
		
		String[] listStudentsName = new String[number];
		System.out.print("\n Enter name of student: ");
		System.out.println();
		enterName(listStudentsName);
		System.out.println();
		System.out.println(" Student names after normalized: (converted)");
		exportName(listStudentsName);
	}
}
