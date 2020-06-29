package equationsolver;
import java.util.Scanner;
public class EquationSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Quadratic equation solver\nA quadratic equation is one of the form ax2+bx+c where a is different than 0");
		do {
			System.out.println("Enter the value of A:");
			a=sc.nextDouble();
		}while(a==0);
		System.out.println("Enter the value of B:");
		b=sc.nextDouble();
		System.out.println("Enter the value of C:");
		c=sc.nextDouble();
		sc.close();
		Quadratic quadratic=new Quadratic();
		quadratic.solveQuadratic(a,b,c);
		
		

	}

}
