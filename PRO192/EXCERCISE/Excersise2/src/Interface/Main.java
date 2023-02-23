package Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Teacher teacherKhanh = new Teacher();
		teacherKhanh.setName("Huynh Ngoc Bao Khanh");
		teacherKhanh.setAddress("Da Nang Ct");
		teacherKhanh.setAge(50);
		teacherKhanh.setSalary(3000);
		teacherKhanh.setBonus(1);
		System.out.println(teacherKhanh.toString());
		teacherKhanh.evaluate();
		
		Teacher teacherVu = new Teacher();
		teacherVu.setName("Vo Van Vu");
		teacherVu.setAddress("Da Nang Ct");
		teacherVu.setAge(55);
		teacherVu.setSalary(3000);
		teacherVu.setBonus(1);
		System.out.println(teacherVu.toString());
		teacherVu.evaluate();
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(teacherKhanh);
		list.add(teacherVu);
		System.out.println("before sort:");
		for(Person ls : list) {
			System.out.println(ls.toString());
		}
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		//Lamda
		Collections.sort(list,(o1,o2) -> o1.getName().compareTo(o2.getName()) );
		System.out.println("After sort:");
		for(Person ls : list) {
			System.out.println(ls.toString());
		}
	}

}
