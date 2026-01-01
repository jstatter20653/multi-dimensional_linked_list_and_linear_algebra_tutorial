package Package_92320251233_PM;

import java.util.ArrayList;
import java.util.LinkedList;

public class Build_5_Dimensional_Linked_List {


	

	
	LinkedList<Set_Size_3d_Linked_List_Structure> 
	five_dimensional_linked_list_X_A; 
	
	int _5th_Dimension_cluster_size;
	int _4th_Dimension_cluster_size;
	boolean is_it_a_anti_sf_2;
	boolean is_it_right_after_a_non_anti_sf_2;
	int total_nodes;
	int total_nodes_plus_sf_protection;
	
	



	public Build_5_Dimensional_Linked_List() {
		
		five_dimensional_linked_list_X_A = new 
				LinkedList<Set_Size_3d_Linked_List_Structure>();
	
				is_it_a_anti_sf_2 = false;	
				
				is_it_right_after_a_non_anti_sf_2 = false;
	} 

	
	
		public void Build(
				int _1st_d_X_B_fa, int _2nd_d_X_C_fa,
				int _3rd_d_X_C_Two_fa, int _4th_d_X_D_fa,
				int _5th_d_X_E_fa) {
			
			System.out.println(" beginning of build method \n");
			
			int _5th_d_b_X_F = 0;
			int _4th_d_b_X_G = 0;
			int _3rd_d_b_X_H = 0;
			int _2nd_d_b_X_I = 0;
			int _1st_d_b_X_J = 0;
			
			
			//test for right arguments
			if(_5th_d_X_E_fa < 1) {
				_5th_d_b_X_F = 1;}
			
			if(_4th_d_X_D_fa < 1) {
				_4th_d_b_X_G = 1;}
			
			if(_3rd_d_X_C_Two_fa < 1) {
				_3rd_d_b_X_H = 1;}
			
			if(_2nd_d_X_C_fa < 1) {
				_2nd_d_b_X_I = 1;}
			
			if(_1st_d_X_B_fa < 1) {
				_1st_d_b_X_J = 1;}
			
			
			
			
		
			int anti_sf = 100;
			
			int total_nodes_plus_sf_protection = _4th_d_b_X_G * _5th_d_b_X_F +
					anti_sf;
			
			int total_nodes = 
			total_nodes_plus_sf_protection - anti_sf;
		
	
			System.out.println("\n\n " + (
					total_nodes - anti_sf));
			
			System.out.println("\n " + total_nodes);
			
			for(int i = 1;i < _5th_d_b_X_F; i++) {
			
			for(int i_2 = 1; i_2 < _4th_d_b_X_G;i_2++) {
				
		//		five_dimensional_linked_list_X_A.add(
		//				new _3rd_Dimensional_Linked_List_Structure(
		//						_1st_d_b_X_J, _2nd_d_b_X_I, _3rd_d_b_X_H));
			
				five_dimensional_linked_list_X_A.add(
						new Set_Size_3d_Linked_List_Structure());
			
			
			
			}
			}
		//stopped here 12-31-2025  4:36pm	
	//		five_dimensional_linked_list_X_A.get(total_nodes).setIs_it_right_after_a_non_anti_sf_2(true);
				
	//		for(int i = total_nodes; i <= total_nodes_plus_sf_protection;i++) {
				
	//			five_dimensional_linked_list_X_A.get(i).setIs_it_a_anti_sf_2(true);
				
				
	//		}
				
				
				
		
			
			System.out.println("end of build method\n\n");
			
		}

	

	public LinkedList<Set_Size_3d_Linked_List_Structure> 
	getFive_dimensional_linked_list_X_A() {
		return five_dimensional_linked_list_X_A;
	}

	public void setFive_dimensional_linked_list_X_A(
			LinkedList<Set_Size_3d_Linked_List_Structure> five_dimensional_linked_list_X_A) {
		this.five_dimensional_linked_list_X_A = five_dimensional_linked_list_X_A;
	}

	public int get_5th_Dimension_cluster_size() {
		return _5th_Dimension_cluster_size;
	}

	public void set_5th_Dimension_cluster_size(int _5th_Dimension_cluster_size) {
		this._5th_Dimension_cluster_size = _5th_Dimension_cluster_size;
	}

	public int get_4th_Dimension_cluster_size() {
		return _4th_Dimension_cluster_size;
	}

	public void set_4th_Dimension_cluster_size(int _4th_Dimension_cluster_size) {
		this._4th_Dimension_cluster_size = _4th_Dimension_cluster_size;
	}
			
	public void calculate_5th_dim_cluster_size(int number_of_3d_clusters , int _4th) {
		
		_5th_Dimension_cluster_size = number_of_3d_clusters * _4th;
		
	}
	
public void calculate_4th_dim_cluster_size(int number_of_3d_clusters) {
		
		_4th_Dimension_cluster_size = number_of_3d_clusters;
		
	}



public boolean isIs_it_a_anti_sf_2() {
	return is_it_a_anti_sf_2;
}



public void setIs_it_a_anti_sf_2(boolean is_it_a_anti_sf_2) {
	this.is_it_a_anti_sf_2 = is_it_a_anti_sf_2;
}



public boolean isIs_it_right_after_a_non_anti_sf_2() {
	return is_it_right_after_a_non_anti_sf_2;
}



public void setIs_it_right_after_a_non_anti_sf_2(boolean is_it_right_after_a_non_anti_sf_2) {
	this.is_it_right_after_a_non_anti_sf_2 = is_it_right_after_a_non_anti_sf_2;
}
		
public int getTotal_nodes() {
	return total_nodes;
}



public void setTotal_nodes(int total_nodes) {
	this.total_nodes = total_nodes;
}



public int getTotal_nodes_plus_sf_protection() {
	return total_nodes_plus_sf_protection;
}



public void setTotal_nodes_plus_sf_protection(int total_nodes_plus_sf_protection) {
	this.total_nodes_plus_sf_protection = total_nodes_plus_sf_protection;
}
		


}
	

