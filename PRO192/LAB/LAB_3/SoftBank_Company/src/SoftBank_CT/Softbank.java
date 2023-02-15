package SoftBank_CT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Softbank {
	private Integer branchID;
	private String branchName;
	private String dateOfEstablishment;
	private Integer amountOfSenior;
	private Integer amountOfJunior; 
	protected Float costEstimates;
	protected Float actualCost;
	
	public static final Scanner scan = new Scanner(System.in);
	//Setter and Getter
	public Integer getBranchID() {
		return branchID;
	}
	public void setBranchID(Integer branchID) {
		this.branchID = branchID;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getDateOfEstablishment() {
		return dateOfEstablishment;
	}
	public void setDateOfEstablishment(String dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
	}
	public Integer getAmountOfSenior() {
		return amountOfSenior;
	}
	public void setAmountOfSenior(Integer amountOfSenior) {
		this.amountOfSenior = amountOfSenior;
	}
	public Integer getAmountOfJunior() {
		return amountOfJunior;
	}
	public void setAmountOfJunior(Integer amountOfJunior) {
		this.amountOfJunior = amountOfJunior;
	}
	public Float getCostEstimates() {
		return costEstimates;
	}
	public void setCostEstimates(Float costEstimates) {
		this.costEstimates = costEstimates;
	}
	public Float getActualCost() {
		return actualCost;
	}
	public void setActualCost(Float actualCost) {
		this.actualCost = actualCost;
	}
	
	//Constructor
	public Softbank() {
		super();
	}
	public Softbank(Integer branchID, String branchName, String dateOfEstablishment, Integer amountOfSenior,
			Integer amountOfJunior, Float costEstimates, Float actualCost) {
		super();
		this.branchID = branchID;
		this.branchName = branchName;
		this.dateOfEstablishment = dateOfEstablishment;
		this.amountOfSenior = amountOfSenior;
		this.amountOfJunior = amountOfJunior;
		this.costEstimates = costEstimates;
		this.actualCost = actualCost;
	}
	
	//Method
	public void input() {
		branchID = inputBranchID();
		branchName = inputBranchName();
		dateOfEstablishment = inputDateOfEstablishment();
		amountOfSenior = inputAmountOfSenior();
		amountOfJunior = inputAmountOfJunior();
;	}
	public Integer inputBranchID() {
		Integer branchID = 0;
//		Scanner scan = new Scanner(System.in);
		while(branchID == 0) {
			try {
				System.out.println("Enter Branch ID (int): ");
				branchID = Integer.parseInt(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return branchID;
	}
	public String inputBranchName() {
//		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fullname: ");
		String name = scan.nextLine();
		return name;
	}
	public String inputDateOfEstablishment() {
//		Scanner scan = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		try {
			System.out.println("Enter date of establishment (dd-MM-yyyy): ");
			date = df.parse(scan.nextLine());
			System.out.println(df.format(date));
		} catch (ParseException e) {
			System.err.println("Failed date format, will take current date (" + df.format(date) + ")!");
			System.out.println();
		}
		return df.format(date);
	}
	public Integer inputAmountOfSenior() {
		Integer amountOfSenior = 0;
//		Scanner scan = new Scanner(System.in);
		while(amountOfSenior == 0) {
			try {
				System.out.println("Enter amount of Senior (int): ");
				amountOfSenior = Integer.parseInt(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return amountOfSenior;
	}
	public Integer inputAmountOfJunior() {
		Integer amountOfJunior = 0;
//		Scanner scan = new Scanner(System.in);
		while(amountOfJunior == 0) {
			try {
				System.out.println("Enter amount of Senior (int): ");
				amountOfJunior = Integer.parseInt(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return amountOfJunior;
	}
	@Override
	public String toString() {
		return "Softbank [branchID=" + branchID + ", branchName=" + branchName + "\n" + ", dateOfEstablishment="
				+ dateOfEstablishment + ", amountOfSenior=" + amountOfSenior + ", amountOfJunior=" + + amountOfJunior
				+ "\n " +", costEstimates=" + costEstimates + ", actualCost=" + actualCost + "\n";
	}
	public abstract Float costEstimatesCalculate();
	public abstract	Float actualCostCalculate();
}
