package Package_92320251233_PM;

import java.util.ArrayList;
import java.util.LinkedList;

public class Build_5_Dimensional_Linked_List {

//	LinkedList<Double> five_dimensional_linked_list_X_A;
	
	_3rd_Dimensional_Linked_List_Structure _3_d_list;
	
	LinkedList<_3rd_Dimensional_Linked_List_Structure> five_dimensional_linked_list_X_A; 
	
	int _5th_Dimension_cluster_size;
	int _4th_Dimension_cluster_size;
	int _3rd_Dimension_cluster_size;
	
	public Build_5_Dimensional_Linked_List() {
		
		five_dimensional_linked_list_X_A = new
				LinkedList<_3rd_Dimensional_Linked_List_Structure>();
		
		_3_d_list = new _3rd_Dimensional_Linked_List_Structure();
		
		
	}
		
		/**
	 * @return the five_dimensional_linked_list
	 */
//	public LinkedList<Double> 
//	getFive_dimensional_linked_list() {
		
	//	return five_dimensional_linked_list_X_A;
//	}

	/**
	 * @param five_dimensional_linked_list the five_dimensional_linked_list to set
	 */
//	public void setFive_dimensional_linked_list(LinkedList<Double> 
//	five_dimensional_linked_list_X_A) {
		
//		this.five_dimensional_linked_list_X_A = five_dimensional_linked_list_X_A;
//	}
//   /*
	

	
	
		public void Build(int _1st_d_X_B, int _2nd_d_X_C, int _3rd_d_X_C_Two, int _4th_d_X_D,
				int _5th_d_X_E) {
			
			System.out.println(" beginning of build method \n");
			
			int _5th_d_b_X_F = 0;
			int _4th_d_b_X_G = 0;
			int _3rd_d_b_X_H = 0;
			int _2nd_d_b_X_I = 0;
			int _1st_d_b_X_J = 0;
			
			
			//test for right arguments
			if(_5th_d_X_E < 1) {
				_5th_d_b_X_F = 1;}
			
			if(_4th_d_X_D < 1) {
				_4th_d_b_X_G = 1;}
			
			if(_3rd_d_X_C_Two < 1) {
				_3rd_d_b_X_H = 1;}
			
			if(_2nd_d_X_C < 1) {
				_2nd_d_b_X_I = 1;}
			
			if(_1st_d_X_B < 1) {
				_1st_d_b_X_J = 1;}
			
			
			
			
			//anti_buffer_breach_one_hundred_nodes
			int anti_buffer_breach_one_hundred_nodes = 100;
			
			int total_nodes = _4th_d_b_X_G * _5th_d_b_X_F +
					anti_buffer_breach_one_hundred_nodes;
		
		//	int three_d_total_nodes = _1st_d * _2nd_d * _3rd_d + 100;
			// after accessing correct 4th dimensiobn the access 3d linked list
	//		int total_nodes = 
			
			
			//test below
			System.out.println("\n\n " + (
					total_nodes - anti_buffer_breach_one_hundred_nodes));
			
			System.out.println("\n " + total_nodes);
			
			for(int i = 1; i <= total_nodes;i++) {
				
				five_dimensional_linked_list_X_A.add(
						new _3rd_Dimensional_Linked_List_Structure(
								_1st_d_b_X_J, _2nd_d_b_X_I, _3rd_d_b_X_H));
								
				}
			
			System.out.println("end of build method\n\n");
			
		}

	

	public LinkedList<_3rd_Dimensional_Linked_List_Structure> 
	getFive_dimensional_linked_list_X_A() {
		return five_dimensional_linked_list_X_A;
	}

	public void setFive_dimensional_linked_list_X_A(
			LinkedList<_3rd_Dimensional_Linked_List_Structure> five_dimensional_linked_list_X_A) {
		this.five_dimensional_linked_list_X_A = five_dimensional_linked_list_X_A;
	}
			
	
		
		
}
	

