package Employee_Management;

public class Employee implements Comparable<Employee> {
	public String name;
	public Integer age;
	public String address;
	public Double salary;
	public Float coefficient;
	public Double baseSalary;

	//Setter and Getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getSalary() {
		
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Float getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(Float coefficient) {
		this.coefficient = coefficient;
	}
	
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	//class constructor
	public Employee(String name, Integer age, String address, Double baseSalary, Float coefficient) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.baseSalary = baseSalary;
		this.coefficient = coefficient;
	}
	
	//Calculate salary 
	public Double calculateSalary() {
		Double employeeSalary = (double) 0;
		
		employeeSalary = (double) this.baseSalary * this.getCoefficient();
		
		return employeeSalary;
	}	
	
	//export employee information 
	public void exportEmployee() {
		System.out.print(this.getName());
		System.out.print("\t|\t");
		System.out.print(this.getAge());
		System.out.print("\t|\t");
		System.out.print(this.getAddress());
		System.out.print("\t|\t");
		System.out.print(this.getBaseSalary() + "0.000 vnd");
		System.out.print("\t|\t");
		System.out.print(this.getSalary() + ".000 vnd");
		System.out.print("\t|\t");
		System.out.print(this.getCoefficient());
	}
	@Override
	public int compareTo(Employee o) {
		int compare = this.name.compareTo(o.name);
		if (compare == 0) {
			//continue compare in case they have the same name:
			compare = Double.compare(salary, o.salary);
		}
		return compare;
	}
	
}
