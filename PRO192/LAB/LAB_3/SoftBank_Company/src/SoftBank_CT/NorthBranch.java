package SoftBank_CT;

import java.util.Scanner;

public class NorthBranch extends Softbank{
	private Float coefficient = (float)2;
	
	public Float getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(Float coefficient) {
		this.coefficient = coefficient;
	}
	
	public NorthBranch(Float coefficient) {
		super();
		this.coefficient = coefficient;
	}
	public NorthBranch() {
		super();
	}
	@Override 
	public void input() {
		super.input();
	}
	@Override
	public String toString() {
		return super.toString() + " coefficient=" + coefficient + "  NORTH BRANCH" + "]";
	}
	public static final Scanner scan = new Scanner(System.in);
	@Override
	public Float costEstimatesCalculate() {
		this.costEstimates = getAmountOfSenior()*5000*getCoefficient() + getAmountOfJunior()*2000*getCoefficient();
		return this.coefficient;
	}

	@Override
	public Float actualCostCalculate() {
		this.actualCost = this.costEstimates;
		return this.actualCost;
	}
		
}
