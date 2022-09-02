package org.lo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation {

	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelApp.com");

	}
	@Test
	public void login() {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Kkskrish");
		
		String name = txtUserName.getAttribute("value");
		Assert.assertEquals("verify username", "Kkskrish", name);

		WebElement txtPassWord = driver.findElement(By.id("password"));
		txtPassWord.sendKeys("kumar1996");
		
		String pass = txtPassWord.getAttribute("value");
		Assert.assertEquals("verify password", "kumar1996", pass);
		

		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
		String title = driver.getTitle();
		boolean b = title.contains("Login");
		Assert.assertTrue("verify title", b);
		

	}
	@After
	public void afterMethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}
	@Before
	public void beforeMethod() {
		long timeMillis = System.currentTimeMillis();
		System.out.println(timeMillis);
	}
	@AfterClass
	public static void aftetClass() {
		driver.quit();
	}


}
