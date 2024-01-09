package task;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterClass;

public class DragandDrop {

	@Test
  
  public void draganddrop() throws InterruptedException 
  {
	 WebDriverManager.chromedriver().setup();
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
//	 Thread.sleep(1000);

	 driver.manage().deleteAllCookies();
	 
//	 Thread.sleep(1000);

	 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	 
	 Thread.sleep(1000);
	 	  
	  WebElement drag=driver.findElement(By.id("draggable"));
	  
//	  Thread.sleep(1000);
	  
	  WebElement drop=driver.findElement(By.id("droppable"));
	  
//	  Thread.sleep(3000);
	  
	  Actions action=new Actions(driver);
	  
//	  actions.dragAndDrop(drag, drop).build().perform();
	  
	  action.clickAndHold(drag).moveToElement(drop).release().perform();
	  
//	  Thread.sleep(1000);
	  
	 
  }	
  
}
