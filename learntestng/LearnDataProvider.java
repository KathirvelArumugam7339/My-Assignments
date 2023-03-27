package learntestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {
	@Test(dataProvider="fatchdata")
	public class DynamicData {
		
		public void LoginPage(String userName,String password) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(option);
			driver.get("http://leaftaps.com/opentaps/control/logout");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		 driver.findElement(By.id("username")).sendKeys(userName);
		 driver.findElement(By.id("password")).sendKeys(password);
	     driver.findElement(By.className("decorativeSubmit")).click();

		}

		@DataProvider(name = "fetch data")
		public String[][] sendData() {
			String[][] data = new String[2][2];

			data[0][0] = "Demosalesmanager";
			data[0][1] = "crmsfa";

			data[1][0] = "demos";
			data[1][1] = "ded";

			return data;
		}
	}

}
