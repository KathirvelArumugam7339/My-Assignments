package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass{
	
public HomePage(ChromeDriver driver) {
		
		this.driver = driver; 
	}

	/*
	 * public LoginPage clickLogout() {
	 * driver.findElement(By.className("decorativeSubmit")).click(); return new
	 * LoginPage(); }
	 */
	
	public MyHomePage clickCRMFSA() {
		driver.findElement(By.id("label")).click();
		return new MyHomePage(driver);
	}

}
