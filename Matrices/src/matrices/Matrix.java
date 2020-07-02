package matrices;

public class Matrix {
	private int rows;
	private int columns;
	private int[][] matrixDefinition;
	public Matrix(int rows, int cols, int[][] matrixDefinition) {
		this.rows=rows;
		this.columns=cols;
		this.matrixDefinition=matrixDefinition;
	}
	public void setRows(int rows){
		this.rows=rows;
	}
	public int getRows() {
		return rows;
	}
	public void setColumns(int columns) {
		this.columns=columns;
	}
	public int getColumns() {
		return columns;
	}
	public void setMatrixDefinition(int[][]matrixDefinition) {
		this.matrixDefinition=matrixDefinition;
	}
	public int[][] getMatrixDefinition() {
		return matrixDefinition;
	}
	
	
	

}
