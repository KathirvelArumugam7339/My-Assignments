package Week4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlert {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println(msg);
		alert.accept();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Alert second=driver.switchTo().alert();
		String msg2=alert.getText();
		System.out.println(msg2);
		second.accept();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		Alert alert5=driver.switchTo().alert();
		alert5.sendKeys("kathir");
		alert5.accept();
		
		
		
		
		
		
		
		
	}

}
