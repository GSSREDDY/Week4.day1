package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	
		//Close the popup notifications or Handle  browser notifications 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	  // it run at a background 
		options.setHeadless(true);
	
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles);
driver.switchTo().window(handles.get(1));	
driver.switchTo().window(handles.get(0));	
driver.close();

		
		
		
	
		
		
		
		
		
		
		
	}

}
