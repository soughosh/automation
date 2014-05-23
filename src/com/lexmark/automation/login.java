package com.lexmark.automation;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
@Test
public class login {
	 public WebDriver driver;
	 public WebElement username;
	 public WebElement password;
	 public WebElement login;
	 
	 public login()
	 {
	driver=new FirefoxDriver();
	//driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	driver.get("http://10.195.9.5");
	 }
	 
 public void authenticateLogin() {
	username=driver.findElement(By.id("username"));
	password=driver.findElement(By.id("password"));
	login=driver.findElement(By.id("submit"));
	username.sendKeys("admin");
	password.sendKeys("admin");
	login.click();
	 }
}
