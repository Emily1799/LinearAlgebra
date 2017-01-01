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
	
	public Matrix changeSingleRow(Row newRow, Row rowToChange) {
		Matrix m = new Matrix(this.numColumns, this.numRows, this.matrix);
		int index = findrow(rowToChange);
		if(index == -1){
			throw new IllegalArgumentException("The row to change does not exist in the matrix");
		}
		else{
			matrix[index] = newRow;
		}
		return m;
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
	private int findrow(Row rowtofind) {
		int index = -1;
		int rowindex = 0; 
		boolean rowfound = false;
		
		for(Row r : this.matrix) {
			if(r.equals(rowtofind)) {
				rowfound = true;
				break;
			}
			else {
				rowindex++;
			}
			if(!rowfound) {
				
			}
		}
		
		return index;
	}
	public Matrix mulRowAddToAnother(Row rowToChange, Row rowToMul, double mulBy) {
		Matrix m = new Matrix(this.numColumns, this.numRows, this.matrix);
		//create a new row that is mulby * rowToMul
		Row temp = rowToMul.mulRowNoMutate(mulBy);
		temp = temp.addRows(rowToChange, temp); 
		//set the new row as part of the matrix
		m = m.changeSingleRow(temp, rowToChange);
		
		//TODO:finish this

		return m;
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
