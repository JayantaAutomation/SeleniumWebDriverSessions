package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumWaitingStrategies {

	public static void main(String[] args) {
	
		/* Implicit Wait
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Selenium");
		driver.findElement(By.id("JayantaPanda")).sendKeys("Selenium");
		
		driver.manage().deleteAllCookies();
		driver.close();
		 */
		
		// Explicit Wait
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("IPL 2024" + Keys.ENTER);
		
		WebElement firstResult = new WebDriverWait (driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		
		System.out.println(firstResult.getText());

		driver.manage().deleteAllCookies();
		driver.close();
		
		
		
	}

}
