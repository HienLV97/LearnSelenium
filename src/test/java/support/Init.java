package support;

import org.openqa.selenium.*;
import support.screenSetup.ScreenPosition;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class Init {
	public static WebDriver driver = null;
	@BeforeSuite
	public void Setup() {

		driver = new ChromeDriver();
        ScreenPosition.MidRight();
//		ScreenPosition.MidRightMac();
//		Authenticate();
//        ScreenPosition.FullScreen2();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void closeBrowser() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e){
			throw new RuntimeException(e);
		}
        driver.quit();
	}
	public void sleep( double second){
		try{
			Thread.sleep((long) (1000*second));
		} catch (InterruptedException e){
			throw new RuntimeException(e);
		}
	}
	public WebElement XpathConfig(String tagName, String Attribute, String value){
		//button[@data-id='default_language']"));
		return driver.findElement(By.xpath("//"+tagName+"[@"+Attribute+"='"+value+"']"));

	}
}
