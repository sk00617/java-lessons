package matrices;

public class MatrixOperation {
	public void multiplication(Matrix a, Matrix b) {
		int[][] resultingMatrix=new int[a.getRows()][b.getColumns()];
		int[][] matrixA=a.getMatrix();
		int[][] matrixB=b.getMatrix();
        for (int i = 0; i < a.getRows(); i++) { 
            for (int j = 0; j < b.getColumns(); j++) { 
                for (int k = 0; k < a.getColumns(); k++) { 
                    resultingMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("\nResulting matrix:\n");
		for(int i=0;i<a.getRows();i++) {
			for(int j=0;j<b.getColumns();j++) {
				 System.out.print("["+resultingMatrix[i][j]+"]" + " ");
			}
			System.out.println();
		}
	}

}
