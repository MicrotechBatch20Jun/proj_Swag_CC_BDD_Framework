package stepDefinitions;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class E2EStepDefinition {

	WebDriver driver;

	@Given("^user is in login page$")
	public void user_is_in_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\JavaNewWorkSpace\\proj_Swag_CC_BDD_FW\\src\\test\\resources\\executable\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		Thread.sleep(2000);

	}

	@When("^page title is Swag Labs$")
	public void page_title_is_Swag_Labs() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Swag Labs", title);
		Thread.sleep(2000);

	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable credentials) throws InterruptedException {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.id("user-name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
		Thread.sleep(2000);

	}

	@And("^user click on log in button$")
	public void user_click_on_log_in_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);

	}

	@Then("^user is on Home Page$")
	public void user_is_on_Home_Page() throws InterruptedException {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", url);
		Thread.sleep(2000);

	}

	@Then("^user click on item$")
	public void user_click_on_item() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
		Thread.sleep(2000);

	}

	@Then("^user click on cart$")
	public void user_click_on_cart() throws InterruptedException {
		driver.findElement(By.tagName("svg")).click();
		Thread.sleep(2000);

	}

	@And("^user click on checkout$")
	public void user_click_on_checkout() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
		Thread.sleep(2000);

	}

	@Then("^user enters firstname and lastname and zip$")
	public void user_enters_firstname_and_lastname_and_zip(DataTable info) throws InterruptedException {
		List<List<String>> infodata = info.raw();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(infodata.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(infodata.get(0).get(1));
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(infodata.get(0).get(2));
		Thread.sleep(2000);

	}

	@Then("^user click on continue$")
	public void user_click_on_continue() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@When("^user is on payment page$")
	public void user_is_on_payment_page() throws InterruptedException {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals("https://www.saucedemo.com/checkout-step-two.html", url);
		Thread.sleep(2000);

	}

	@Then("^user click on finish$")
	public void user_click_on_finish() {
		driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();

	}

	@And("^user opt out$")
	public void user_opt_out() throws InterruptedException {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals("https://www.saucedemo.com/checkout-complete.html", url);
		Thread.sleep(3000);

	}

	@Then("^close browser$")
	public void close_browser() {
		driver.quit();
		System.out.println("Testing Completed");

	}

}// class
