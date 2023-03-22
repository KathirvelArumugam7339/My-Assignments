package Week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookMyShow {
	WebDriver driver;

	@BeforeMethod
	public void login() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
@Test
	public void booking() {
	driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//span[@class='sc-fcdeBU cNeUMt']")).click();
	
	driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("pathaan");
	driver.findElement(By.xpath("//strong[text()='Pathaan']")).click();
	driver.findElement(By.xpath("//button[@data-phase='postRelease']")).click();
	driver.findElement(By.xpath("//span[text()='2D']")).click();
	driver.switchTo().alert().accept();
	
	  WebElement element = driver.findElement(By.xpath("//a[@class='__venue-name']"));
	  String theater=element.getText();
	  System.out.println(theater);
	  element.click();

	}

}
