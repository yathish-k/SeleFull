package opentaps.contact;

import org.testng.annotations.Test;

import wrappers.LeafTapsWrappers;


public class EditContact extends LeafTapsWrappers {

	@Test(groups = {"sanity"})
	public void editContact() throws Exception{
		clickByLink("Contacts");
		clickByLink("Find Contacts");
		enterByXpath("(//label[contains(text(),'First name:')])[3]/following::input[1]", "Gopinath");
		clickByXpath("//button[contains(text(),'Find Contacts')]");
		waitUseThread(3000);
		clickByXpath("(//a[@class='linktext'])[4]");
		verifyTitle("View Contact | opentaps CRM");
		clickByXpath("//a[contains(text(),'Edit')]");
		enterById("updateContactForm_departmentName", "IT");
		clickByXpath("//input[@class='smallSubmit']");

	}
}
