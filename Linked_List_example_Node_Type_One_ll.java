package Package_Linked_List_Boiler_Plate_Code;

public class Linked_List_example_Node_Type_One_ll {

	int row_location;
	int column_location;
	String test_1;
	String test_2;
	
	
	public Linked_List_example_Node_Type_One_ll(int row_location, int column_location) {
		
		this.row_location = row_location;
		this.column_location = column_location;
		test_1 = "default_test_1";
		test_2 = "default_test_2";
	}
	
public Linked_List_example_Node_Type_One_ll() {
		
		this.row_location = 0;
		this.column_location = 0;
		
	}

public int getRow_location() {
	return row_location;
}

public void setRow_location(int row_location) {
	this.row_location = row_location;
}

public int getColumn_location() {
	return column_location;
}

public void setColumn_location(int column_location) {
	this.column_location = column_location;
}

public String getTest_1() {
	return test_1;
}

public void setTest_1(String test_1) {
	this.test_1 = test_1;
}

public String getTest_2() {
	return test_2;
}

public void setTest_2(String test_2) {
	this.test_2 = test_2;
}
	
	
	
}
