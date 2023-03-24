package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass{
	@Test
	public void runCreateLead() {
		 new LoginPage(driver).enterUserName()
		 .enterPassword()
		 .clickLoginButton()
		 .clickCRMFSA()
		 .clickLeadsButton()
		 .clickToCreate()
		 .companyName()
		 .enterFirstName()
		 .enterLastName()
		 .clickCreateButton().verifylead();
		
		
		
	}
}