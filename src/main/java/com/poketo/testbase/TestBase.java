package com.poketo.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.poketo.utills.ExtentReport;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase extends ExtentReport{
//	protected WebDriver driver;
	@BeforeClass
	public WebDriver setUp() {
		switch (BrowserObjects.BROWSER) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(BrowserObjects.MAX_WAIT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(BrowserObjects.MAX_WAIT));
			driver.get(BrowserObjects.URL);
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(BrowserObjects.MAX_WAIT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(BrowserObjects.MAX_WAIT));
			driver.get(BrowserObjects.URL);
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(BrowserObjects.MAX_WAIT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(BrowserObjects.MAX_WAIT));
			driver.get(BrowserObjects.URL);
			break;
		}

		
		return driver;

	}

	
	public void launch() {
//		driver = setUp(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
