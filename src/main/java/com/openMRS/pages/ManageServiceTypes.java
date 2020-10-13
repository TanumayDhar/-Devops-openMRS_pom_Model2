package com.openMRS.pages;

import org.openqa.selenium.By;


import com.openMRS.parentPage.Page;

public class ManageServiceTypes extends Page {
	
	
	
	
	
	public void types()
	{
		
		driver.findElement(By.xpath("(//i[@class='editAppointmentType delete-item icon-pencil'])[2]")).click();
		
	}
	

}
