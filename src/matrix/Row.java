package matrix;

public class Row {
	double[] row;

	public Row(double[] row) {
		this.row = row;
	}
	public RowmulRowMutate(double mulBy) {
	
		for(int i = 0; i < row.length; i++) {
			row[i]*= mulBy;
		}
		return this;
	}
	
	public Row mulRowNoMutate(double mulBy) {
		double [] changeRow = new double[row.length];
		for(int i = 0; i < row.length; i++) {
			changeRow[i] = row[i] * mulBy;
			
		}
		return new Row(changeRow);
	}

	public double[] getRow() {
		return row;
	}

	public void setRow(double[] row) {
		this.row = row;
	}
	
	
}
