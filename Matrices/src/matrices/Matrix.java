package matrices;

public class Matrix {
	private int rows;
	private int columns;
	private int[][] matrix;
	public Matrix(int rows, int cols, int[][] matrix) {
		setRows(rows);
		setColumns(cols);
		setMatrix(matrix);
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
	public void setMatrix(int[][]matrix) {
		this.matrix=matrix;
	}
	public int[][] getMatrix() {
		return matrix;
	}
	
	
	

}
