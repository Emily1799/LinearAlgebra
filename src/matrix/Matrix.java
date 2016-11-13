package matrix;


public class Matrix {
	private int numColumns; 
	private int numRows;
	private Row[] matrix = new Row[numColumns];
	
	public Matrix(int numColumns, int numRows, Row... rows) {
		this.numColumns = numColumns;
		this.numRows = numRows;
		this.matrix = rows;
	}
	
	public Matrix scalarMulMutate(double mulBy) {
		Matrix m = new Matrix(this.numColumns, this.numRows, this.matrix);
		for(Row row: matrix) {
			row.mulRowMutate(mulBy);
		}
		return m;
	}
	public Matrix scalarMulNoMutate(double mulBy) {
		Matrix m = new Matrix(this.numColumns, this.numRows, this.matrix);
		for(Row row: matrix) {
			row.mulRowNoMutate(mulBy);
		}
		return m;
	}
	public Matrix mulRowAddToAnother(Row rowToChange, Row rowToMul, double mulBy) {
		Matrix m = new Matrix(this.numColumns, this.numRows, this.matrix);
		Row temp = rowToMul.mulRowNoMutate(mulBy);
		
	}

	public int getNumColumns() {
		return numColumns;
	}

	public int getNumRows() {
		return numRows;
	}
	
	public Row[] getMatrix() {
		return matrix;
	}
	public void setMatrix(Row[] matrix) {
		this.matrix = matrix;
	}

	
	
	


	
	

}
