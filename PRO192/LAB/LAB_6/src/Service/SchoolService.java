package Service;

import java.util.*;
import java.util.function.Predicate;

import Model.Student;

public class SchoolService {
	
	private static ArrayList<Student> studentList = new ArrayList<Student>();
	private static final Scanner scan = new Scanner(System.in);
	static {
		studentList.add(new Student("S01", "John Horstman", 7.8));
		studentList.add(new Student("S02", "John Smith", 8.5));
		studentList.add(new Student("S03", "Cays Horstman", 9.6));
		studentList.add(new Student("S04", "David Beckham", 8.0));
	}
	
	public void listAllStudent(ArrayList<Student> students) {
		for (Student item : students) {
			System.out.println(item.toString());
		}
	}
	public void listAllStudent() {
		for (Student item: studentList) {
			System.out.println(item.toString());
		}
	}
	
	public ArrayList<Student> search(Predicate<Student> student) {
		ArrayList<Student> tempList = new ArrayList<Student>();
		for (Student item : studentList) {
			if(student.test(item)) tempList.add(item);
		}
		return tempList;
	}
	public void addStudent() {
		studentList.add(this.input());
		System.out.println("Add successfully!");
	}
	public Student input() {
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
                return Double.compare(o1.getAver(), o2.getAver());
            }
        });
        this.listAllStudent();
    }
}