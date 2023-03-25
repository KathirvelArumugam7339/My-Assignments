package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class MergeLeads extends BaseClass {
	@Test
	public void runMergeLead() {
		new LoginPage(driver).enterUserName().enterPassword().clickLoginButton()
		.clickCRMFSA().clickLeadsButton().clickMerge().clickFromLead().clickMaverick()
		.clickToLead().clickKumaran();
	}

}
