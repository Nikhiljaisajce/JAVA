import java.util.Scanner;
public class Matrixmul{
	public static void main(String args[]){
		int r1,r2,c1,c2,i,j,k;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows of first matrix");
		r1=input.nextInt();
		System.out.println("Enter the number of columns of first matrix");
		c1=input.nextInt();
		System.out.println("Enter the number of rows of second matrix");
		r2=input.nextInt();
		System.out.println("Enter the number of columns of second matrix");
		c2=input.nextInt();
		
		if(c1!=r2){
			System.out.println("Matrix multiplication is not possible");
		}
		else{
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
			int c[][]=new int[r1][c2];
		System.out.println("Enter the value for matrix A");
		for(i=0;i<r1;i++){
			for(j=0;j<c1;j++)
				a[i][j]=input.nextInt();
		}
		System.out.println("Enter the value for matrix B");
		for(i=0;i<r2;i++){
			for(j=0;j<c2;j++)
				b[i][j]=input.nextInt();
		}
		System.out.println("Matrix multiplication is");
		for(i=0;i<r1;i++){
			for(j=0;j<c2;j++){
				c[i][j]=0;
			for(k=0;k<c1;k++){
				c[i][j]+=a[i][k]*b[k][j];
			}
			System.out.println(c[i][j] + " ");
			}
			System.out.println();
		}
		}
	}
}
		
	
		
				

		
		