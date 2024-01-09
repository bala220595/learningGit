package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testingprac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 
		  WebDriverManager.chromedriver().setup();
		  
		  //launching the webdriver
		  
		  WebDriver driver=(WebDriver) new ChromeDriver();
		  
		  //maximize
		  
		  driver.manage().window().maximize();
		  
		  //to get url
		  
		  driver.get("https://www.guvi.in/");
		  
		  //operations
		  
		  WebElement loginfield=driver.findElement(By.xpath("(//a[@role='button'])[4]"));
		  
//		  loginfield.click();
		  
		  Actions actions=new Actions(driver);
		  
		  actions.moveToElement(loginfield).build().perform();
		  
		  Thread.sleep(2000);

	}

}
