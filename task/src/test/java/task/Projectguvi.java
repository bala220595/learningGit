package task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Projectguvi {
	
	public static WebDriver driver;

	  	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
				
		driver=new ChromeDriver();
		
		driver.get("https://www.bestbuy.com/");

	  	}
	  	
		public void ValidateUrlIsNotBroken() throws Exception {
			
			Locatepage lp=new Locatepage(driver);
					
			if(lp.urlResponseCode()==200) {
				System.out.println("Link is Not Broken");
			}else {
				System.out.println("Link is Broken");
			}
			Assert.assertTrue(lp.urlResponseCode()==200);
			
		}

}
