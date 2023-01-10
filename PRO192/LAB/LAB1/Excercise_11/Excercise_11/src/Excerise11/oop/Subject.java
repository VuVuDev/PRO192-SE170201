package Excerise11.oop;

public class Subject {
	public  int subjectId;
	public  String subjectName;
	public  float subjectPoint;
	public  int subjectFactor;
	
	
	public  String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public float getSubjectPoint() {
		return subjectPoint;
	}
	public void setSubjectPoint(float subjectPoint) {
		this.subjectPoint = subjectPoint;
	}
	public int getSubjectFactor() {
		return subjectFactor;
	}
	public void setSubjectFactor(int subjectFactor) {
		this.subjectFactor = subjectFactor;
	}
	
	public  int getSubjectId() {
		return subjectId;
	}
	public  void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public void showInfoOfSubject() {
		System.out.println("Subject info: ");
		System.out.println(" - Id:     " + this.getSubjectId());
		System.out.println(" - Name:   " + this.getSubjectName());
		System.out.println(" - Point:  " + this.getSubjectPoint());
		System.out.println(" - Factor: " + this.getSubjectFactor()); 
	}
}
