package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstep {

	public WebDriver driver;

	@Given("^User is on the Facebook page$")
	public void user_is_on_the_Facebook_page(){

		System.out.println("USER IS ON THE FACEBOOK PAGE");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Desktop\\workspace\\Seleniumsample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^User enters the username and password$")
	public void user_enters_the_username_and_password() {

		System.out.println("USER ENTERS THE NAME AND PASSWORD");
		driver.findElement(By.id("email")).sendKeys("rajesh.business7@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("cucumber@123");

	}

	@Then("^User clicks the login button$")
	public void user_clicks_the_login_button() throws Exception {

		System.out.println("USER CLICKS THE LOGIN BUTTON");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(2000);
		driver.close();

	}
}
