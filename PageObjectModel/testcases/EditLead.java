package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class EditLead extends BaseClass{
	@Test
	public void editMyLead() {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMFSA()
		.clickLeadsButton()
		.editLead()
		.clickEdit()
		.enterLocalName()
		.clickUpdate()
		.verifylead();
		

		
	}

}
