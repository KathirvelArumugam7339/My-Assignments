package learntestng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadExcel extends BaseClassLeafTaps{
	
	
	@Test(dataProvider="fetchdata")

	public void createLeadsTestng(String companyname,String firstname,String lastname ) {
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
//	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
	driver.findElement(By.name("submitButton")).click();
	}
	
	@DataProvider(name="fetchdata")
	public String[][]sendData() throws IOException {
		
		
		
		return ReadExcelData.readData();
		
	}


}


