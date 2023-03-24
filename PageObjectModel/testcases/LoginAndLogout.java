package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginAndLogout extends BaseClass{
@Test
	public void runLogin() {
		
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton();		
	}

}
