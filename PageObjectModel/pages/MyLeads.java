package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeads extends BaseClass {
	
public MyLeads(ChromeDriver driver) {
		
		this.driver = driver; 
	}

	public CreateLeads clickToCreate() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		return new CreateLeads(driver);

	}

	public MyLeads editLead() {
		driver.findElement(By.xpath("//a[text()='Maverick']")).click();
		return this;
	}
	public OpenTaps clickEdit() {
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		return new OpenTaps(driver);
	}

}
