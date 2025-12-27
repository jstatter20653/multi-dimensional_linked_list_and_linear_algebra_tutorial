package Package_Linked_List_Boiler_Plate_Code;

import java.util.LinkedList;

public class Linked_List_example_Back_end_Link_list_Boiler_plate_code {

	public Linked_List_example_Back_end_Link_list_Boiler_plate_code() {
		
		
		
	}
	
	public void run_Back_end_llbpc() {
		
		LinkedList<Linked_List_example_Node_Type_One_ll> list_x_1 = 
				new  LinkedList<Linked_List_example_Node_Type_One_ll>();
		
				list_x_1.add(new Linked_List_example_Node_Type_One_ll());
				list_x_1.add(new Linked_List_example_Node_Type_One_ll());
				list_x_1.add(new Linked_List_example_Node_Type_One_ll());
				list_x_1.add(new Linked_List_example_Node_Type_One_ll());
		
				
				
	Linked_List_example_Get_Object_at_Index_X goaix = new Linked_List_example_Get_Object_at_Index_X(list_x_1);	
		

		/*	
			list_x_1.add(new Node_Type_One());
			list_x_1.add(new Node_Type_One());
			list_x_1.add(new Node_Type_One());
			list_x_1.add(new Node_Type_One());
		*/
	
	Linked_List_example_Node_Type_One_ll X_node = goaix.getIndex(1);
	
	goaix.getIndex(1).setTest_1("test_text");
	
	goaix.print_test_1_string(1);
			
	
	}
	
	
	
}
