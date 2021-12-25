package week4.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShort {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		//Screen short of webpage
		//File source = driver.getScreenshotAs(OutputType.FILE);
		//File destination = new File("./leafground.png");
	//FileUtils.copyFile(source, destination);
	
	//Screen short of webElement

WebElement alertBox = driver.findElement(By.xpath("//button[text()='Alert Box']"));


File sourceEle = driver.getScreenshotAs(OutputType.FILE);
File destinationEle = new File("./alert.png");
FileUtils.copyFile(sourceEle, destinationEle);
	
	

	
	
	
	
	
	
	}

}
