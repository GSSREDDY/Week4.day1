package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		//switch to new window
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		
		String SecondWindowTitle = driver.getTitle();
		System.out.println(SecondWindowTitle);
		
		/*
		 * //Close window 
		 * driver.close();
		 * 
		 * //Close all windows 
		 * driver.quit();
		 */
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
