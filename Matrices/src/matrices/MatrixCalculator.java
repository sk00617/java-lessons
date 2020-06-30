package matrices;
import java.util.Scanner;
public class MatrixCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rows1,cols1,rows2,cols2;
		System.out.println("\t\t\tMatrix Calculator\n\t\t\t*Operations available: Multiplication");
		do {
			System.out.println("Enter the dimensions of the first matrix.");
			System.out.println("Rows: ");
			rows1=sc.nextInt();
			System.out.println("Columns: ");
			cols1=sc.nextInt();
			System.out.println("Enter the dimensions of the second matrix.");
			System.out.println("Rows: ");
			rows2=sc.nextInt();
			System.out.println("Columns: ");
			cols2=sc.nextInt();
			if(cols1!=rows2)
				System.out.println("Remember that the number of columns of the 1st matrix must equal the number of rows of the 2nd matrix.");
		}while(cols1!=rows2);
		int[][]matrix1=new int[rows1][cols1];
		int[][]matrix2=new int[rows2][cols2];
		System.out.println("Enter the values for the first matrix:");
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols1;j++) {
				System.out.printf("\n[%d][%d]:",i,j);
				matrix1[i][j]=sc.nextInt();
			}
		}
		Matrix firstMatrix=new Matrix(rows1,cols1,matrix1);
		System.out.println("Enter the values for the second matrix: ");
		for(int i=0;i<rows2;i++) {
			for(int j=0;j<cols2;j++) {
				System.out.printf("\n[%d][%d]:",i,j);
				matrix2[i][j]=sc.nextInt();
			}
		}
		sc.close();
		Matrix secondMatrix=new Matrix(rows2,cols2,matrix2);
		MatrixOperation matrixMultiplication=new MatrixOperation();
		matrixMultiplication.multiplication(firstMatrix, secondMatrix);
		
		
		
		
		
		
		

	}

}
