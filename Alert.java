package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		/*
		 * driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		 * //switch to alert box org.openqa.selenium.Alert alert =
		 * driver.switchTo().alert(); alert.accept();
		 */
		/*
		 * driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		 * org.openqa.selenium. Alert alert = driver.switchTo().alert();
		 * 
		 * 
		 * //Get text to print-press a button String alerttext = alert.getText();
		 * System.out.println(alerttext); alert.dismiss();
		 */
		
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		org.openqa.selenium.
		Alert alert = driver.switchTo().alert();
		
		/*
		 * String alerttext = alert.getText(); System.out.println(alerttext);
		 */
		
		alert.sendKeys("Santosh");
	
		alert.accept();
		
		
		
		
		
		
		
		
		
		
		

	}

}
