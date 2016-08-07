package com.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {
	private static FirefoxDriver browser;
	@Value("${local.server.port}")
	private int port;
	@BeforeClass
	public static void openBrowser() {
		browser = new FirefoxDriver();
		browser.manage().timeouts()
				.implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void closeBrowser() {
		browser.quit();
	}
	@Test
	public void testLesson() {
		String baseUrl = "http://localhost:" + port;
		browser.get(baseUrl + "/students");
        int n1 = browser.findElements(By.name("student")).size();
        browser.findElement(By.id("btn_new")).click();
        browser.findElementByName("name")
                .sendKeys("st1");
        browser.findElementByName("phone")
                .sendKeys("12345");
        browser.findElementByTagName("form")
                .submit();
        int n2 = browser.findElements(By.name("student")).size();
        Assert.assertThat("should add a new student",n2,is(n1+1));
	}
}
