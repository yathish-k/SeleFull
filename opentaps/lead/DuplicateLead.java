package opentaps.lead;

import org.testng.annotations.Test;

import wrappers.LeafTapsWrappers;

public class DuplicateLead extends LeafTapsWrappers{
	
	@Test(groups={"regression"})
	public void duplicateLead() throws Exception{
		
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[contains(text(),'Phone')]");
		enterByName("phoneNumber", "9597704568");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		waitUseThread(3000);
		String sText = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByLink("Duplicate Lead");
		clickByXpath("//input[@name='submitButton']");
	}
	

}
