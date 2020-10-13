package com.openMRS.testcases;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.openMRS.pages.AppointmentSchedule;
import com.openMRS.pages.HomePage;
import com.openMRS.pages.IsolationWardPage;
import com.openMRS.pages.ManageServiceTypes;
import com.openMRS.pages.ServiceType;


public class LoginPageTestCases {    // created parent Page class and all classes extends to this parent /base class



	@Test
	public void LoginOPenMRS() throws InterruptedException  
	{



		HomePage hp = new HomePage(); hp.goToLogin();


		IsolationWardPage iw = new IsolationWardPage();
		iw.appointmentSheduling();

		AppointmentSchedule as = new AppointmentSchedule();
		as.manageService();

		ManageServiceTypes ms = new ManageServiceTypes();
		ms.types();

		ServiceType st = new ServiceType();
		st.serviceName();
		st.clickHomeIcon();


		hp.LogOut(); hp.verifyLogoutSuccesfull();

	}

	
}


