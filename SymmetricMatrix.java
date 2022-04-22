import java.util.*;

class SymmetricMatrix{
	
	public static void main(String[] args){
		
		int row, col;
		Scanner sc= new Scanner(System.in);
		boolean isSymmetic= true;
		
		System.out.print("Enter the number of rows for the Matrices : ");
		row= sc.nextInt();
		System.out.print("Enter the number of columns for the Matrices : ");
		col= sc.nextInt();
		
		int[][] matrix= new int[row][col];
		
		System.out.println("Enter the elements for the Matrix : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix[i][j]= sc.nextInt();
			}
		}
		System.out.println("\n");
		
		System.out.println("The entered matrix is : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println("\n");
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i!=j){
					if(matrix[i][j]!=matrix[j][i]){
						isSymmetic= false;
						break;
					}
				}
			}
			
			if(!isSymmetic)
				break;
		}
		
		if(isSymmetic){
			System.out.println("The entered matrix is Symmetric Matrix");
		}
		else{
			System.out.println("The entered matrix is not a Symmetric Matrix");
		}
	}
}