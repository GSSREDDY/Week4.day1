package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3School {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
driver.manage().window().maximize();
driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[text()='Try it']")).click();
Alert alert = driver.switchTo().alert();
alert.sendKeys("Santosh");
alert.accept();
// verify your name is displayed sucessfully
String text = driver.findElement(By.id("demo")).getText();
if (text.contains("Santosh")) {
	System.out.println("Pass");
	}else {
		System.out.println("fail");
	}







	}

}
