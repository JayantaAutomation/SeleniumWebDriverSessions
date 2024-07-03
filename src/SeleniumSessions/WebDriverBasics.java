package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverBasics {

	public static void main(String[] args) {

		//Lunch chrome browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = WebDriverManager.chromedriver().create();
		//WebDriver driver = new ChromeDriver();
	
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
		driver.quit();
		/*
		//Lunch Firefox browser
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.ndtv.com/");
		driver2.manage().window().maximize();
		driver2.manage().deleteAllCookies();
		driver2.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver2.close();

		//Lunch IE browser
		WebDriver driver3 = new InternetExplorerDriver();
		driver3.get("https://www.ndtv.com/");
		driver3.manage().window().maximize();
		driver3.manage().deleteAllCookies();
		driver3.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver3.close();
		*/
	}

}
