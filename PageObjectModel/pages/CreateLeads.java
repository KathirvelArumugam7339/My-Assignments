package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeads extends BaseClass {
	
public CreateLeads(ChromeDriver driver) {
		
		this.driver = driver; 
	}

	public CreateLeads companyName() {
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Testleaf");
		return this;
	}

	public CreateLeads enterFirstName() {
		driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Kathirvel");

		return this;

	}

	public CreateLeads enterLastName() {
		driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("A");

		return this;
	}

	public ViewLeads clickCreateButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeads(driver);

	}
}
