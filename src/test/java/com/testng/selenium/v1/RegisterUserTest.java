package com.testng.selenium.v1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testng.selenium.v1.pages.HomePage;
import com.testng.selenium.v1.pages.RegistrationPage;

public class RegisterUserTest {
	WebDriver driver;
	
	
	@BeforeTest
	public void initDriver() {
		String path = "C:/Users/david/eclipse-workspace/v1/drivers/msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		this.driver=driver;
		driver.manage().window().maximize();
	}
	
	@Test
	public void firstTest() {
		HomePage home = new HomePage(driver);
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		home.clickRegisterLink();
	}

}
