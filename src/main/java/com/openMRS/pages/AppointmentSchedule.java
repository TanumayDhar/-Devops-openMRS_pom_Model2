package com.openMRS.pages;

import org.openqa.selenium.By;


import com.openMRS.parentPage.Page;

public class AppointmentSchedule extends Page{
	
	
	
	public void manageService()
	{
		
		driver.findElement(By.xpath("//*[@id=\"appointmentschedulingui-manageAppointmentTypes-app\"]")).click();
		
	}
	
	public void manageProviderSchedules()
	{
		
		
	}
	
	public void manageAppointments()
	{
		
		
		
	}
	
	

}
