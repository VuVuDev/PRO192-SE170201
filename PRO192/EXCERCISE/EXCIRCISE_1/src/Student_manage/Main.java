package Student_manage;

import java.util.*;

public class Main {
	
	static class Student {
		private String name;
		private Float score;
		
	//Setter & Getter
		//
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Float getScore() {
			return score;
		}
		public void setScore(Float score) {
			this.score = score;
		}
		//Constructor

		public Student(String name, Float score) {
			super();
			this.name = name;
			this.score = score;
		}
		public Student() {
			super();
		}
		//Set method
		public void Input() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter name: ");
			this.setName(scan.nextLine());
			System.out.println("Enter score: ");
			this.setScore(Float.parseFloat(scan.nextLine()));
		}
		
		public String getRank(Float score) {
			if(score >= 8) return  "Well Done";
			else if (score >= 6.5 && score < 8 ) return "Normal";
			else if (score > 4 && score <6.5) return "Try Harder";
			else return "Bad";
		}
		
		public void Export() {
			System.out.println("Name: " + this.getName() + "  ");
			System.out.println("Score: " + this.getScore() );
			System.out.println("Rank: " + this.getRank(this.getScore()));
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		addUser(studentList);
		addMoreUser(studentList);
		for(Student ls : studentList) {
			ls.Export();
		}
	}
	
	public static void addMoreUser(ArrayList<Student> studentList) {
		for(int i = 0; i < 3; i++ ) {
			addUser(studentList);
		
		}
		
	}
	
	public static void addUser(ArrayList<Student> studentList) {
		studentList.add(new Student());
		for (Student ls : studentList) {
			ls.Input();
		}
	}

}
