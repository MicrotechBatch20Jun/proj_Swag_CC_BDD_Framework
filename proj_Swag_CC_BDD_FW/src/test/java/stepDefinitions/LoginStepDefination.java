package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {

	WebDriver driver;

	@Given("^user is already in login page$")
	public void user_is_already_in_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\JavaNewWorkSpace\\proj_Swag_CC_BDD_FW\\src\\test\\resources\\executable\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");

	}

	@When("^page title is swagLabs$")
	public void page_title_is_swagLabs() {
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		Assert.assertEquals("Swag Labs", title);

	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", url);
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();

	}

}// class
