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
	@BeforeTest
	public void GoToPage() {
		AnhTester anhTester = new AnhTester();
		driver.get("https://crm.anhtester.com/admin/authentication");
		WebElement emailTB = driver.findElement(By.id("email"));
		emailTB.sendKeys(anhTester.emailLogin);

		WebElement passTB = driver.findElement(By.name("password"));
		passTB.sendKeys(anhTester.passwordLogin);

		WebElement loginBTN = driver.findElement(By.className("btn-primary"));
		loginBTN.click();
	}

	@Test(enabled = false)
	public void CreateNewCustomers() {

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

		WebElement LanguageSL = XpathConfig("button", "data-id", "default_language");
		LanguageSL.click();
		WebElement Option2B = driver.findElement(By.id("bs-select-3-1"));
		Option2B.click();

		CompanyTB.click();

		WebElement VATNumberTB = driver.findElement(By.tagName("textarea"));
		VATNumberTB.sendKeys("Fsoft");

		WebElement CityTB = driver.findElement(By.id("city"));
		CityTB.sendKeys("Da Nang");

		WebElement StateTB = driver.findElement(By.name("city"));
		StateTB.sendKeys("DN");

		WebElement ZipcodeTB = driver.findElement(By.id("zip"));
		ZipcodeTB.sendKeys("Test");

		WebElement CountryDDL = XpathConfig("button", "data-id", "country");
		CountryDDL.click();
		WebElement Option3 = driver.findElement(By.id("bs-select-4-1"));
		Option3.click();


		sleep(5);

	}

	@Test
	public void CreatNewProject() {
		WebElement ProjectsHL = driver.findElement(By.xpath("//a[@href='https://crm.anhtester.com/admin/projects']"));
		ProjectsHL.click();

		WebElement NewProjectBTN = driver.findElement(By.xpath("//a[normalize-space()='New Project']"));
		NewProjectBTN.click();

		WebElement ProjectNameTB = driver.findElement(By.xpath("//*[text()='Project Name']/following::input"));
		ProjectNameTB.sendKeys("test");

		WebElement CustomersField = XpathConfig("div","class","filter-option");
		CustomersField.click();
		WebElement CustomerTB = XpathConfig("input","placeholder","Type to search...");
		CustomerTB.sendKeys("ABC");
		sleep(5);
	}
}
