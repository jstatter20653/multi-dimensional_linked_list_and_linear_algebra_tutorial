package Package_Linked_List_Boiler_Plate_Code;

import java.util.LinkedList;

public class Linked_List_example_Get_Object_at_Index_X {

	LinkedList<Linked_List_example_Node_Type_One_ll> list;
	
	
	public Linked_List_example_Get_Object_at_Index_X() {
		
		list = new LinkedList<Linked_List_example_Node_Type_One_ll>();
		
	}
	
	public Linked_List_example_Get_Object_at_Index_X(LinkedList<Linked_List_example_Node_Type_One_ll> list) {
		
		this.list = list;
		
		//new LinkedList<Node_Type_One_ll>();
		
		this.list = list;
	
	}
	
	public Linked_List_example_Node_Type_One_ll getIndex(int index) {
		//traverse LinkedList
		
		Linked_List_example_Node_Type_One_ll X_1 = new Linked_List_example_Node_Type_One_ll();
		
		for(int i = 0;i < list.size(); i++) {
			
		X_1 = list.get(index);
			
			
		}
		
		
		return X_1;
		
		
		
	}
	
	public void print_test_1_string(int index) {
		
		System.out.println("test_1_string: " + list.get(index).getTest_1());
		
	}
	
//	public String set_test_1_string(int)
	
}
