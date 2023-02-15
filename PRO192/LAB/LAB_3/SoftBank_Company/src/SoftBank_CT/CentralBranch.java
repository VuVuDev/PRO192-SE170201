package SoftBank_CT;

public class CentralBranch extends Softbank{
	private Integer numberOfEmployee;
	private Float coefficient = (float) 1.5;

	public Float getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(Float coefficient) {
		this.coefficient = coefficient;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}


	public CentralBranch(Integer numberOfEmployee, Float coefficient) {
		super();
		this.numberOfEmployee = numberOfEmployee;
		this.coefficient = coefficient;
	}

	public CentralBranch() {
		super();
	}
	//method 
	@Override 
	public void input() {
		super.input();
		numberOfEmployee = inputNumberOfEmployee();
	}
	public Integer inputNumberOfEmployee() {
		Integer numberOfEmployee = 0;
//		Scanner scan = new Scanner(System.in);
		while(numberOfEmployee == 0) {
			try {
				System.out.println("Enter number of employee (int): ");
				numberOfEmployee = Integer.parseInt(scan.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Invalid Value, Try Again!");
				System.out.println();
			}
		}
		return numberOfEmployee;
	}
	@Override
	public String toString() {
		return super.toString() + " numberOfEmployee=" + numberOfEmployee + ", coefficient=" + coefficient + "  CENTRAL BRANCH" + "]";
	}

	@Override
	public Float costEstimatesCalculate() {
		this.costEstimates = getAmountOfSenior()*5000*getCoefficient() + getAmountOfJunior()*2000*getCoefficient();
		return this.costEstimates;
	}

	@Override
	public Float actualCostCalculate() {
		this.actualCost = getCostEstimates() + getNumberOfEmployee()*1000;
		return this.actualCost;
	}
}
