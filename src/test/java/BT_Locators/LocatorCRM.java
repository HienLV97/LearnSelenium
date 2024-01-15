package BT_Locators;

import com.sun.jdi.ByteValue;
import information.AnhTester;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import support.Init;
import support.locator.Locator;

public class LocatorCRM extends Init {
	@Test
	public void test() {
		AnhTester anhTester = new AnhTester();
		driver.get("https://crm.anhtester.com/admin/authentication");
		WebElement emailTB = driver.findElement(By.id("email"));
		emailTB.sendKeys(anhTester.emailLogin);

		WebElement passTB = driver.findElement(By.name("password"));
		passTB.sendKeys(anhTester.passwordLogin);

		WebElement loginBTN = driver.findElement(By.className("btn-primary"));
		loginBTN.click();

		WebElement CustomersHL = driver.findElement(By.linkText("Customers"));
		CustomersHL.click();

		WebElement NewCustomerBTN = driver.findElement(By.partialLinkText("New Customer"));
		NewCustomerBTN.click();

		WebElement CompanyTB = driver.findElement(By.id("company"));
		CompanyTB.sendKeys("Fsoft");

		WebElement PhoneTB = driver.findElement(By.id("phonenumber"));
		PhoneTB.sendKeys("0785124525");

		WebElement WebsiteTB = driver.findElement(By.id("website"));
		WebsiteTB.sendKeys("test.com");

		WebElement GroupsDDL = driver.findElement(By.xpath("//button[@data-id='groups_in[]']"));
		GroupsDDL.click();
		WebElement Option1 = driver.findElement(By.id("bs-select-1-0"));
		Option1.click();

		CompanyTB.click();

		WebElement CurrencySL = driver.findElement(By.xpath("//button[@data-id='default_currency']"));
		CurrencySL.click();
		WebElement Option2A = driver.findElement(By.id("bs-select-2-1"));
		Option2A.click();

		CompanyTB.click();

		WebElement LanguageSL = XpathConfig("button","data-id","default_language");
//		WebElement LanguageSL = driver.findElement(By.xpath("//button[@data-id='default_language']"));
		LanguageSL.click();
		WebElement Option2B = driver.findElement(By.id("bs-select-3-1"));
		Option2B.click();

		CompanyTB.click();

		WebElement VATNumberTB = driver.findElement(By.tagName("textarea"));
		VATNumberTB.sendKeys("Fsoft");

		sleep(5);
	}
}
