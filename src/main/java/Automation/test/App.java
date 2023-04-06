package Automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhishek\\Desktop\\Jmeter\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
    	WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://itest.squad1.tech//login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Email ID\"]")).sendKeys("abhishek.yadav@talakunchi.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Admin@12345");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(10000); 
    }
}
