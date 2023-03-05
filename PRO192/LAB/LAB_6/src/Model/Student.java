package Model;

public class Student {
	private String id;
	private String name;
	private Double aver;
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
	public Double getAver() {
		return aver;
	}
	public void setAver(Double aver) {
		this.aver = aver;
	}
	public Student() {
		super();
	}
	public Student(String id, String name, Double aver) {
		super();
		this.id = id;
		this.name = name;
		this.aver = aver;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", aver=" + aver + "]";
	}
	
}
