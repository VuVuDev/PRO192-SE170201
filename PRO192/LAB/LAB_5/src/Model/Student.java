package Model;

public class Student {
	private String id;
	private String name;
	protected Double average;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}
	
	public Student() {
		super();
	}
	
	public Student(String id, String name, Double average) {
		super();
		this.id = id;
		this.name = name;
		this.average = average;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", average=" + average + "]";
	}
	
	
}
