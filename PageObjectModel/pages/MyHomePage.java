package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
public MyHomePage(ChromeDriver driver) {
		
		this.driver = driver; 
	}
	public MyLeads clickLeadsButton() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		return new MyLeads(driver); 
	}

}
