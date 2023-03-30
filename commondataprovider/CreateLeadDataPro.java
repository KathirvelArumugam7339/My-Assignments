package commondataprovider;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLeadDataPro extends BaseClassDataPro {
	@BeforeTest
	private void setValue() {
		excelfilename="CreateLeadData";
	}

	@Test(dataProvider = "fetchdata")
	public void RunLead( String companyName, String firstName, String lastname) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
	}
	
}
