package commondataprovider;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClassDataPro {

	public static ChromeDriver driver;
	
	public String excelfilename;

	@Parameters({ "url", "username", "password" })
	@BeforeMethod
	public void preCondition(String url, String username, String password) {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(url);

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}

	@AfterMethod
	public void postCondition() {

		driver.close();

	}

	@DataProvider(name = "fetchdata")
	public String[][] sendData() throws IOException {
		return ReadExcelDatas.readDatas(excelfilename);
	}
}