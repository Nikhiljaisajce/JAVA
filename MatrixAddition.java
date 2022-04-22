import java.util.*;

class MatrixAddition{
	
	public static void main(String[] args){
		
		int row, col;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number of rows for the Matrices : ");
		row= sc.nextInt();
		System.out.print("Enter the number of columns for the Matrices : ");
		col= sc.nextInt();
		
		int[][] matrixA= new int[row][col];
		int[][] matrixB= new int[row][col];
		int[][] matrixSum= new int[row][col];
		
		System.out.println("Enter the elements for the Matrix A : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrixA[i][j]= sc.nextInt();
			}
		}
		System.out.println("\n");
		
		System.out.println("Enter the elements for the Matrix B : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrixB[i][j]= sc.nextInt();
			}
		}
		System.out.println("\n");
		
		System.out.println("Matrix A is : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matrixA[i][j]+"   ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Matrix B is : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matrixB[i][j]+"   ");
			}
			System.out.println("\n");
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrixSum[i][j]= matrixA[i][j] + matrixB[i][j];
			}
		}
		
		System.out.println("Resultant of the Matrix Addition is : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matrixSum[i][j]+"   ");
			}
			System.out.println("\n");
		}
	}
}