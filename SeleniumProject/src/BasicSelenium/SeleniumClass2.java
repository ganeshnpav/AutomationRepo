package BasicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClass2 {
	@Test
	public void SelectTripType() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();  //logic in constructor get executed.
		dr.manage().window().maximize(); //to maximize screen
		dr.get("http://newtours.demoaut.com/");  //get function to navigate to application.
		WebElement username=dr.findElement(By.name("userName"));
		//dr.close(); //to close browser.
		username.sendKeys("mercury");
		
		username.clear();
		
		username.sendKeys("mercury");
		
		WebElement password=dr.findElement(By.name("password"));
		password.sendKeys("mercury");
		
		WebElement signin=dr.findElement(By.name("login"));
		signin.click();
		
		WebElement oneway=dr.findElement(By.xpath("//input[@value='oneway']"));
		System.out.println(oneway.isSelected()); //to check radio buttion checked or not
		oneway.click();
		System.out.println(oneway.isSelected());
		
		//dropdown
		WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));
		Select sell= new Select(pass);
		sell.selectByIndex(2);
		
		Thread.sleep(3000);
		sell.selectByValue("1");
		Thread.sleep(3000);
		sell.selectByVisibleText("2");
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
		WebElement ticketless=dr.findElement(By.xpath("//input[@value='checkbox']"));
		System.out.println(ticketless.isSelected()); //to check radio buttion checked or not
		ticketless.click();
		System.out.println(ticketless.isSelected());
		
		WebElement count=dr.findElement(By.xpath("//select[@name='delCountry']"));
		Select sel2= new Select(count);
		sel2.selectByIndex(2);
		
		Alert alt=dr.switchTo().alert();
		System.out.println(alt.getText());   //
		alt.accept();
		//alt.dismiss();
		


	}

}
