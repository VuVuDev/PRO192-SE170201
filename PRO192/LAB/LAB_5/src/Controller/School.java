package Controller;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.*;

import Model.Student;

public class School {
	private static final Scanner scan = new Scanner(System.in);
	private static ArrayList<Student> studentList = new ArrayList<Student>(); 
	
	static {
		studentList.add(new Student("S01", "John Horstman", 7.8));
		studentList.add(new Student("S02", "John Smith", 8.5));
		studentList.add(new Student("S03", "Cays Horstman", 9.6));
		studentList.add(new Student("S04", "David Beckham", 8.0));
	}
	
	public void listAllStudent(ArrayList<Student> list) {
		for (Student ls : list) {
			System.out.println(ls.toString());
		}
	}
	public void listAllStudent() {
		for (Student ls : studentList) {
			System.out.println(ls.toString());
		}
	}
	
	public ArrayList<Student> search (Predicate<Student> student) {
		ArrayList<Student> temList = new ArrayList<Student>();
		for (Student ls : studentList) {
			if(student.test(ls)) temList.add(ls);
		}
		return temList;
	}
	
	public void addStudent() {
		studentList.add(this.info());
		System.out.println("Add successfully!");
	}
	private Student info() {
		System.out.println("ID: ");
		String id = scan.nextLine();
		System.out.println("Name: ");
		String name = scan.nextLine();
		System.out.println("Average score: ");
		double average = scan.nextDouble();
		
		return new Student(id, name, average);
	}
	public void sortByID() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        this.listAllStudent();
    }
    
    public void sortByName() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        this.listAllStudent();
    }

    public void sortByAverage() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAverage(), o2.getAverage());
            }
        });
        this.listAllStudent();
    }
}
