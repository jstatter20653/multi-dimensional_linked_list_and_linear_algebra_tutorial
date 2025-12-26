package Package_92320251233_PM;

import java.util.ArrayList;

public class _3rd_Dimensional_Linked_List_Structure {

	int amount_of_x_nodes;
	int amount_of_y_nodes;
	int amount_of_z_nodes;
	ArrayList<Node_Type_One> list;
	int protection_against_over_stepping_list;
	int total_nodes;
	
	
	public _3rd_Dimensional_Linked_List_Structure() {
		amount_of_x_nodes = 0;
		amount_of_y_nodes = 0;
		amount_of_z_nodes = 0;
		list = new ArrayList<Node_Type_One>();
		protection_against_over_stepping_list = 100;
		total_nodes = (amount_of_x_nodes  + 1)
				* (amount_of_y_nodes + 1) * (amount_of_z_nodes + 1)
				+ protection_against_over_stepping_list;
	}
	
	public _3rd_Dimensional_Linked_List_Structure(
			int x_size, int y_size, int z_size) {
	
		amount_of_x_nodes = x_size;
		amount_of_y_nodes = y_size;
		amount_of_z_nodes = z_size;
		list = new ArrayList<Node_Type_One>();
		protection_against_over_stepping_list = 100;
		total_nodes = (amount_of_x_nodes  + 1)
				* (amount_of_y_nodes + 1) * (amount_of_z_nodes + 1)
				+ protection_against_over_stepping_list;
		
	}
	
	public void recalculate_number_of_nodes() {
		
		total_nodes = (amount_of_x_nodes  + 1)
				* (amount_of_y_nodes + 1) * (amount_of_z_nodes + 1)
				+ protection_against_over_stepping_list;
		
		
	}
	
	

	public int getAmount_of_x_nodes() {
		return amount_of_x_nodes;
	}

	public void setAmount_of_x_nodes(int amount_of_x_nodes) {
		this.amount_of_x_nodes = amount_of_x_nodes;
	}

	public int getAmount_of_y_nodes() {
		return amount_of_y_nodes;
	}

	public void setAmount_of_y_nodes(int amount_of_y_nodes) {
		this.amount_of_y_nodes = amount_of_y_nodes;
	}

	public int getAmount_of_z_nodes() {
		return amount_of_z_nodes;
	}

	public void setAmount_of_z_nodes(int amount_of_z_nodes) {
		this.amount_of_z_nodes = amount_of_z_nodes;
	}

	public ArrayList<Node_Type_One> getList() {
		return list;
	}

	public void setList(ArrayList<Node_Type_One> list) {
		this.list = list;
	}
	
	
	
	
}
