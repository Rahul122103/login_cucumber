package Stepsmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstep {
	
	WebDriver driver;
	
	@Given("user opens chrome and enters url")
	public void user_opens_chrome_and_enters_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gs\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/login-form");
		driver.manage().window().maximize();
	}

	@When("user enters username")
	public void user_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("username")).sendKeys("rahul");
	}

	@When("user enters password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("password")).sendKeys("1276748437");
	}
	
	@When("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	}

	@Then("Welcome back message is displayed")
	public void welcome_back_message_is_displayed() {
	    
	    System.out.println("login success");
	}

}
