package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Swag_Labs_Main {
	
	public String Website_URL = "https://www.saucedemo.com/";
    String User_Dir = System.getProperty("user.dir");
	public WebDriver Browser = null;
	
	
  @BeforeMethod
  public void Launch() {
	  System.setProperty("webdriver.chrome.driver",User_Dir+"/Run_CommandPrompt/Library/chromedriver.exe");
	  //System.setProperty("webdriver.chrome.driver","/Run_CommandPrompt/Library/chromedriver.exe");
	  Browser = new ChromeDriver();
	  Browser.navigate().to(Website_URL);
	  WebElement User_Name = Browser.findElement(By.id("user-name"));
	  User_Name.sendKeys("standard_user");
	  WebElement Password = Browser.findElement(By.id("password"));
	  Password.sendKeys("secret_sauce");
	  Browser.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  
	  String Title = Browser.getTitle();
	  Assert.assertEquals(Title,"Swag Labs");
  }
	
  
  @Test(priority=0)
  public void ClickCart() {
	  Browser.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
  	  Browser.findElement(By.xpath("//*[@id=\"continue-shopping\"]"));
	 
  }
  
  @AfterMethod
  public void Exit() {

	  Browser.close();
  }
  }
  

