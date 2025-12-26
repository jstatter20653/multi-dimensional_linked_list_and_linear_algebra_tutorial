package Package_92320251233_PM;

import java.util.ArrayList;

public class temp_Matrix_Formater {

	int rows;
	int columns;
	int buffer;
	ArrayList<Node_Type_One> AL_NTO_X_A1;
	int total_nodes_before_buffer;
	int total_nodes_after_buffer;
	
	
	public temp_Matrix_Formater()
	{
		
		rows = 0;
		columns = 0;
		buffer = 100;
		AL_NTO_X_A1 = new ArrayList<Node_Type_One>();
		
	}

	public void setup_method_1(int _1_rows_X_1, int _2_columns_X_2) {
		
		rows = _1_rows_X_1;
		columns = _2_columns_X_2;
		total_nodes_before_buffer = rows * columns;
		total_nodes_after_buffer = total_nodes_after_buffer + buffer;
		
		
		for(int i = 1; i <= total_nodes_after_buffer; i++) {
		
			AL_NTO_X_A1.add(new Node_Type_One());
		
		}
		
		
		
	}
	
	public void ArrayList_Matrix_Loader() {
		
		//stopped here 103am_12132025
		
	}
	
	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}


	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}


	public int getBuffer() {
		return buffer;
	}


	public void set_Different_Buffer(int buffer) {
		this.buffer = buffer;
	}

	
	

	public ArrayList<Node_Type_One> getAL_NTO_X_A1() {
		return AL_NTO_X_A1;
	}


	public void setAL_NTO_X_A1(ArrayList<Node_Type_One> aL_NTO_X_A1) {
		AL_NTO_X_A1 = aL_NTO_X_A1;
	}

	public int getTotal_nodes_before_buffer() {
		return total_nodes_before_buffer;
	}

	public void setTotal_nodes_before_buffer(int total_nodes_before_buffer) {
		this.total_nodes_before_buffer = total_nodes_before_buffer;
	}

	public int getTotal_nodes_after_buffer() {
		return total_nodes_after_buffer;
	}

	public void setTotal_nodes_after_buffer(int total_nodes_after_buffer) {
		this.total_nodes_after_buffer = total_nodes_after_buffer;
	}

	
	
}
