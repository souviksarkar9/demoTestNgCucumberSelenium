package com.example.demo;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class TestAppHealth {
	
	WebDriver driver;

	@Given("^Open the Chrome and type application url")
	public void open_the_chrome_and_launch_the_application() throws Throwable {
		System.out.println("Opening Chrome--");
		System.setProperty("webdriver.chrome.driver","C:\\programming-tcs-demo\\demo\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Sending GET Request for HealthCheck--");
		driver.get("http://localhost:8081/");
	}

	@And("^check response as welcome")
	public void verify_welcome_page() throws Throwable {
		String actualString = driver.getPageSource();
		System.out.println("Response Received from GET Request--");
		assertTrue(actualString.contains("welcome"));
	}

}
