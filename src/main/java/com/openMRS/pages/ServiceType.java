package com.openMRS.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.openMRS.parentPage.Page;

public class ServiceType extends Page{
	
	

	
	public void serviceName() throws InterruptedException
	
	
	{  
	
		WebElement describtionField = driver.findElement(By.id("description-field"));
		describtionField.click();
		Thread.sleep(2000);
		describtionField.clear();
		describtionField.sendKeys("New Patient");
		
		driver.findElement(By.xpath("//input[@id='save-button']")).click();
	}
	
	public void clickHomeIcon()
	{
		
		driver.findElement(By.xpath("//i[@class='icon-home small']")).click();
	}
	

}
