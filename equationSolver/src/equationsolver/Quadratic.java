package equationsolver;

public class Quadratic {
      public void solveQuadratic(double a, double b, double c) {
    	  double root1, root2;
          double discriminant = b * b - 4 * a * c;
          if(discriminant > 0) {
              root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
              root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
              System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
          }
          else if(discriminant == 0) {
              root1 = root2 = -b / (2 * a);
              System.out.format("root1 = root2 = %.2f;", root1);
          }
          else {
              double realPart = -b / (2 *a);
              double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
              System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
          }
      }
  
}
