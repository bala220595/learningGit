package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumlocatorsforguvi {
	
	public static void main (String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.guvi.in/register");
		
		Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.xpath("//a[@class='login']"));
		
		login.click();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		
		email.click();
		
		WebElement email=driver.findElement(By.id("email"));
		
		email.click();
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		
		password.click();
		
		WebElement password=driver.findElement(By.id("password"));
		
		password.click();
	
		WebElement forgotpassword=driver.findElement(By.xpath("//a[@href=\"/forgot-password/\"]"));
		
		forgotpassword.click();
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	
		checkbox.click();
				
		Thread.sleep(1000);

		WebElement loginn=driver.findElement(By.xpath("//a[@id='login-btn']"));
		
		loginn.click();

		WebElement loginn=driver.findElement(By.xpath("//a[@class='btn login-btn']"));
		
		loginn.click();
		
		WebElement loginn=driver.findElement(By.cssSelector("a[id='login-btn']"));
				
		loginn.click();
		
		Thread.sleep(1000);
		
		WebElement loginn=driver.findElement(By.cssSelector("a[class='btn login-btn']"));

		loginn.click();
		
		WebElement loginn=driver.findElement(By.id("login-btn"));
		
		loginn.click();
		
		WebElement Fullname=driver.findElement(By.id("name"));
	
		Fullname.click();
		
		WebElement Fullname=driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
				
		Fullname.click();
		
		WebElement Fullname=driver.findElement(By.xpath("//input[@id='name']"));
		
		Fullname.click();
		
		WebElement Fullname=driver.findElement(By.cssSelector("input[id='name']"));
		
		Fullname.click();
		
		WebElement emailaddress=driver.findElement(By.cssSelector("input[id='email']"));
		
		emailaddress.click();
		
		WebElement emailaddress=driver.findElement(By.cssSelector("input[type='email']"));
		
		emailaddress.click();
		
		WebElement emailaddress=driver.findElement(By.xpath("//input[@id='email']"));
	
		emailaddress.click();
		
		WebElement emailaddress=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
		
		emailaddress.click();
		
		WebElement emailaddress=driver.findElement(By.id("email"));
	
		emailaddress.click();
		
		WebElement password=driver.findElement(By.cssSelector("input[id='password']"));
		
		password.click();
		
		WebElement password=driver.findElement(By.cssSelector("input[type='password']"));
		
		password.click();
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	
		password.click();
	
		WebElement password=driver.findElement(By.xpath("//input[@class='form-control password-err']"));
	
		password.click();
		
		WebElement password=driver.findElement(By.id("password"));
		
		password.click();
		
		WebElement mobnumber=driver.findElement(By.cssSelector("input[id='mobileNumber']"));
		
		mobnumber.click();
		
		WebElement mobnumber=driver.findElement(By.xpath("//input[@id='mobileNumber']"));
	
		mobnumber.click();
	
		WebElement mobnumber=driver.findElement(By.xpath("//input[@class='form-control countrycode-left']"));
	
		mobnumber.click();
		
		WebElement mobnumber=driver.findElement(By.id("mobileNumber"));
		
		mobnumber.click();
		
		WebElement signup=driver.findElement(By.xpath("//a[@class='btn signup-btn']"));

		signup.click();
		
		WebElement signup=driver.findElement(By.cssSelector("a[id='signup-btn']"));
		
		Thread.sleep(1000);
				
		WebElement signup=driver.findElement(By.id("signup-btn"));
		
		signup.click();		
		

	}

}
