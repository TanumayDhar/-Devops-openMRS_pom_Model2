package com.openMRS.pages;



import org.openqa.selenium.By;

import org.testng.Assert;

import com.openMRS.parentPage.Page;


public class HomePage extends Page{


	


	public void goToLogin() throws InterruptedException
	{
		
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");

		driver.findElement(By.xpath("//li[@id='Isolation Ward']")).click();

		driver.findElement(By.id("loginButton")).click();
		System.out.println("login clicked");

	}

	public void clickCantLogin()
	{



	}

	public void LogOut()
	{
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();	
	}

	public void verifyLogoutSuccesfull()
	{

		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle = "Login";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("logout Successfull");





	}






}
