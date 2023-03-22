package Week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Redbus {
	@Test
	public void redbus() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("chennai");
		Actions builder = new Actions(driver);
		builder.moveToElement(from);
		driver.findElement(By.className("sub-city")).click();

		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Bangalore");
		builder.moveToElement(to);
		driver.findElement(By.xpath("//li[@class='sub-city']")).click();

		driver.findElement(By.xpath("//table//tr[6]//td[4]")).click();
		driver.findElement(By.id("search_btn")).click();
		String busses = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(busses);
		driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
		String sleeper = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println(sleeper);
		System.out.println(driver.getTitle());

	}
}
