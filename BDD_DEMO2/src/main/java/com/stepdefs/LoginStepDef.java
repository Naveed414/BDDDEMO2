package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	
	WebDriver driver;
	@Given("^User should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("file:///E:/Selenium%20Software/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	}
	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String uname, String pass) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button")).click();

		
	   
	}
	@Then("^User will be on Home Page$")
	public void user_will_be_on_Home_Page() throws Throwable {
		Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
		driver.close();

		
	}
	
	


}
