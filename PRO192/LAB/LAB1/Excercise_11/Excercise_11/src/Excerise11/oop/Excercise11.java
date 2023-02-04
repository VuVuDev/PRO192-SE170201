package Excerise11.oop;

public class Excercise11 {
	
	public static void inputSubjectList(Subject[] list, String[] subjectName) {
		
		for (int i = 0; i < list.length; i++) {
			list[i].setSubjectName(subjectName[i]);
			list[i].setSubjectPoint((float) (Math.random()*5) +5);
			list[i].setSubjectId(i+1);
			if(subjectName[i] == "Toan" || subjectName[i] == "Van" || subjectName[i] == "Anh") {
				// Toan Van Anh hs 2
				list[i].setSubjectFactor(2);
			} else {
				list[i].setSubjectFactor(1);
			}
		}
		
	}
	public static void exportSubjectList(Subject[] list) {	
			System.out.println("\n THIS PROGRAM WILL RANDOM VALUES OF SUBJECTS...\n");
			for (int i = 0; i < list.length; i++) {
				System.out.format(" %d-%s| Score: %.2f, Factor: %d\n", list[i].getSubjectId(),list[i].getSubjectName().toUpperCase(), list[i].getSubjectPoint(), list[i].getSubjectFactor());
			}
	}
	public static float sumOfScores(Subject[] list) {
		float sumValue = 0;
		for (int i = 0; i < list.length; i++) {
			sumValue+= list[i].getSubjectPoint();
		}
		return sumValue;
	}
	public static int getNumberOfFactors(Subject[] list) {
		int factorNumber = 0;
		for (int i = 0; i < list.length; i++) {
			factorNumber += list[i].getSubjectFactor();
		}
		return factorNumber;
	}
	public static float getAverageOfAll(Subject[] list) {
		float averageValue = 0;
		float sumOfAllSubjects = sumOfScores(list);
		int sumOfAllFactors = getNumberOfFactors(list);
		averageValue += sumOfAllSubjects/sumOfAllFactors;
		return averageValue;
	}
	public static void main(String[] args) {
		Subject[] subjectList = new Subject[7];
		String[] subjectName = {"Toan", "Ly", "Hoa", "Van", "Anh", "Su", "Dia"};
		
		for (int i = 0; i < subjectList.length; i++) {
			subjectList[i] = new Subject();
		}
		
		inputSubjectList(subjectList, subjectName);
		exportSubjectList(subjectList);
		
		System.out.format(" OVERRAL AVERAGE: %.2f", getAverageOfAll(subjectList));
	}

}
