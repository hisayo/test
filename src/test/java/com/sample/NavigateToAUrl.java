package com.sample;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToAUrl {
	private WebDriver driver;
	
	@Before
	public void setup(){
		driver = new FirefoxDriver();
	}
	
	@Test
	public void goToGoogle(){
		driver.get("http://www.google.com");
		assertThat(driver.findElements(By.id("lst-ib")).size(), is(1));
	}
	
	@After
	public void teaDown(){
		driver.quit();
	}
}
