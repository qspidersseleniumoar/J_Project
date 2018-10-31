package com.acttime.customertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CustomerTest {
   @Test(groups={"st"})
	public void createcustomertest(){
		System.out.println("customer test");
	
	}
   @Test(groups={"rt"})
	public void modifycustomertest(){
		System.out.println("modifycustomertest test");

	}
   
   @Test(groups={"rt"})
	public void deletecustomertest(){
		System.out.println("deletecustomertest test");

	}
}
