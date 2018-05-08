package opentaps.contact;

import org.testng.annotations.Test;

import wrappers.LeafTapsWrappers;

public class CreateContact extends LeafTapsWrappers {

	@Test(groups = {"smoke"})
	public void  createContact() throws Exception {
				
		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField", "Gopinath");
		enterById("lastNameField", "Jayakumar");
		clickByName("submitButton");
	}	
}
