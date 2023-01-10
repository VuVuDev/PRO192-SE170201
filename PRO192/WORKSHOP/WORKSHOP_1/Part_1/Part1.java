import java.util.Scanner;

public class Part1 {
	public static void enterMatrix(int matrix[][], int rows, int cols) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < rows; i++) {
  			for (int j = 0; j < cols; j++) {
				System.out.print("\n m["+i+"]["+j+"] = ");
				matrix[i][j] = sc.nextInt();
			}
		}	
	}
	public static void exportMatrix(int matrix[][], int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.format("%2d ", matrix[i][j]);
			}
			System.out.println();
		}
	}
	public static int sumOfMatrix(int matrix[][], int rows, int cols) {
		int sum = 0;
		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < cols; j++) {
				sum += matrix[i][j];	
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int rows = 0;
		int cols = 0;
		int matrix[][];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		rows = sc.nextInt();
		System.out.print("\nEnter number of cols: ");
		cols = sc.nextInt();
		matrix = new int[rows][cols];
		System.out.print("Enter the matrix: ");
		enterMatrix(matrix, rows, cols);
		System.out.print("\n Matrix values are: \n");
		exportMatrix(matrix, rows, cols);
		System.out.print("\nSum of matrix : " + sumOfMatrix(matrix, rows, cols));
	}
}
