package stepDefinitions;

import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;

public class LoginWithDataTableAsLists {

	@When("user passes valid credentials as below")
	public void user_passes_valid_credentials_as_below(DataTable dataTable) {
	    List<List<String>> data = dataTable.asLists(String.class);
	    String value1 = data.get(1).get(1);
	    String value2 = data.get(0).get(2);
	    System.out.println(value1);			//admin123
	    System.out.println(value2);			//admin
	}
	
}
