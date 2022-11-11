package parallel_execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Firefox_parallel
{
	 public static WebDriver driver;

		@BeforeMethod
		public void openapp() {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		@Test
		public void data() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("hema@gmail.com");
			
		}
		@AfterMethod
		public void closeapp()
		{
			driver.close();
		}

}
