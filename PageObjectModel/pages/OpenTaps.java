package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class OpenTaps extends BaseClass{
	
public OpenTaps(ChromeDriver driver) {
		
		this.driver = driver; 
	}
	
	public OpenTaps enterLocalName() {
		WebElement name = driver.findElement(By.name("firstNameLocal"));
		name.clear();
		name.sendKeys("Hari");
		return this;
	}
	public ViewLeads clickUpdate() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		return new ViewLeads(driver);
	}

}
