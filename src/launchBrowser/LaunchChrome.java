package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
		// Scanner snc = new Scanner(System.in);

		// Launch chrome
		WebDriver driver = new ChromeDriver();
		// Fetch Website
		driver.get("https://www.google.com/");
		// Maximize browser
		driver.manage().window().maximize();
		// Type selenium
		driver.findElement(By.name("q")).sendKeys("selenium123");
		// Click search button
		//driver.findElement(By.name("btnK")).click();

		Thread.sleep(5000);

		// close browser
		driver.close();

	}

}
