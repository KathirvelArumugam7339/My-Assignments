package salceforce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.sukgu.Shadow;

public class Base {

	public static WebDriver driver;

	@BeforeMethod

	public void login() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*", "--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();

		Set<String> allWindows = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(allWindows);
		driver.switchTo().window(windows.get(1));

		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		Actions builder = new Actions(driver);
		shadow.setImplicitWait(10);
		WebElement trailhead = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		builder.moveToElement(trailhead).perform();
		Thread.sleep(5000);
		WebElement certification = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		builder.scrollToElement(certification).click(certification).perform();

	}

	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();

	}

}
