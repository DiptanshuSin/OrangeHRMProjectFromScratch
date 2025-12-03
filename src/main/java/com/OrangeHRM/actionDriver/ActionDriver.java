package com.OrangeHRM.actionDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDriver {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public ActionDriver(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	//method to click an element
	public void click(By by) {
		driver.findElement(by).click();
	}
	//Wait for element to be clickable
	public void waitForElementToBeClickabble(By by)
	{
		try {
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Element not clickable"+ e.getMessage());
		}
	}
	
	//Wait for Element visibility
	public void waitForElementToBeVisible(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by)); 
	}

}
