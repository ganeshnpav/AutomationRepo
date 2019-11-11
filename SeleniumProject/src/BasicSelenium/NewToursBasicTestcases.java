package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class NewToursBasicTestcases {
	
	WebDriver dr;
	String username="utpatang";
	String password="utpatang";
	@BeforeClass
	public void launchApplication()
	{
System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		dr= new ChromeDriver();  //logic in constructor get executed.
		dr.manage().window().maximize(); //to maximize screen
		  
	}
	
	@AfterClass
	public void CloseAplication()
	{
		dr.quit();
	}
	
	@Test(dependsOnMethods= {"registration"})
	public void login()
	{
		dr.get("http://newtours.demoaut.com/");
		//text box
		WebElement username=dr.findElement(By.name("userName"));
		//dr.close(); //to close browser.
		username.sendKeys(this.username);
		
		WebElement password=dr.findElement(By.name("password"));
		password.sendKeys(this.password);
		//button
		WebElement signin=dr.findElement(By.name("login"));
		signin.click();
		
		By logout=By.xpath("//a[text()= 'SIGN-OFF']");
		boolean res=isElementPresent(logout);
		Assert.assertEquals(true, res);
		

	}
	@Test(dependsOnMethods= {"SelectPassangers"})
	public void logout()
	{
		dr.findElement(By.xpath("//a[text()= 'SIGN-OFF']")).click();
	}
	@Test
	public void registration()
	{
		dr.get("http://newtours.demoaut.com/");
		dr.findElement(By.linkText("REGISTER")).click();
		
		dr.findElement(By.name("email")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.name("confirmPassword")).sendKeys(password);
		dr.findElement(By.name("register")).click();
		
		By message=By.xpath("//b[contains(text(),'"+username+"')]");
		boolean res=isElementPresent(message);
		Assert.assertEquals(true, res);
	}
	
	@Test(dependsOnMethods= {"logout"})
	void support()
	{
		dr.findElement(By.linkText("SUPPORT")).click();
	}
	
	@Test(dependsOnMethods= {"login"})
	public void selectOneWay()
	{
		WebElement oneway=dr.findElement(By.xpath("//input[@value='oneway']"));
		System.out.println(oneway.isSelected()); //to check radio buttion checked or not
		oneway.click();

	}

	@Test(dependsOnMethods= {"selectOneWay"})
	public void SelectPassangers()
	{
		WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));
		Select sell= new Select(pass);
		sell.selectByIndex(2);
		

	}
	
	//public boolean isElementPresent(String xpath)
	public boolean isElementPresent(By element)
	{
		//int size=dr.findElements(By.xpath(xpath)).size();
		int size=dr.findElements(element).size();
	if(size>0)
	{
		return true;
	}else 
	{
		return false;
	}
	}
}
