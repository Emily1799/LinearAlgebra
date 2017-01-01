package matrix;

import java.util.Arrays;

public class Row {
	double[] rowvals;

	public Row(double[] rowvals) {
		this.rowvals = rowvals;
	}
	public Row addRows(Row row1, Row row2) {
		Row ret;
		if((row1 == null) || (row2 == null)|| (row1.rowvals.length != row2.rowvals.length)) {
			throw new IllegalArgumentException("Rows must be the same length to be added");
		}
		else {
			//make return array from row1's values (copied, to prevent unintentional damage)
			ret = new Row(Arrays.copyOf(row1.rowvals, row1.rowvals.length));
			for(int i = 0; i < ret.rowvals.length; i++) {
				ret.rowvals[i] +=  row2.rowvals[i];
			}
		}
		return ret;
	}
	
	public void mulRowMutate(double mulBy) {
		for(int i = 0; i < rowvals.length; i++) {
			rowvals[i]*= mulBy;
		}
	}
	
	public Row mulRowNoMutate(double mulBy) {
		double [] changeRow = new double[rowvals.length];
		for(int i = 0; i < rowvals.length; i++) {
			changeRow[i] = rowvals[i] * mulBy;
		}
		return new Row(changeRow);
	}

	public double[] getRow() {
		return rowvals;
	}

	public void setRow(double[] newvals) {
		this.rowvals = newvals;
	}


	public boolean equals(Row r) {
			if(Arrays.equals(r.rowvals, this.rowvals)) {
				return true;
		  }
			else {
				return false;
			}
	}
}
