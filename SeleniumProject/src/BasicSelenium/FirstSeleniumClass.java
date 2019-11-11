package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumClass {
	@Test
	public void test1() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();  //logic in constructor get executed.
		dr.manage().window().maximize(); //to maximize screen
		dr.get("http://newtours.demoaut.com/");  //get function to navigate to application.
		WebElement username=dr.findElement(By.name("userName"));
		//dr.close(); //to close browser.
		username.sendKeys("mercury");
		
		username.clear();
		Thread.sleep(2000);
		
		username.sendKeys("mercury");
		
		WebElement password=dr.findElement(By.name("password"));
		password.sendKeys("mercury");
		
		WebElement signin=dr.findElement(By.name("login"));
		signin.click();
		
		
	}

}
