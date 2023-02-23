package Interface;

public class Teacher extends Person implements InterfacePerson, Comparable<Teacher> {
	public Integer salary;
	protected Integer bonus;
	
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getBonus() {
		return bonus;
	}
	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}
	
	public Teacher(Integer salary, Integer bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}
	public Teacher() {
		super();
	}
	@Override
	public boolean check() {
		if(this.age >= 60) return true;
		else return false;
	}
	@Override
	public void evaluate() {
		if(check() == true) {
			System.out.println("Ban da den tuoi nghi huu!");
		} else {
			System.out.println("Lam viec tiep di roi nghi!");
		}
	}
	@Override
	public String toString() {
		return super.toString() + " Type: Teacher [salary=" + salary + ", bonus=" + bonus + "]";
	}
	@Override
	public int compareTo(Teacher o) {
		return Integer.compare(o.getAge(), this.getAge());
	}
}
