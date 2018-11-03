package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void befoclas()
	{
		System.out.println("Before executin any methods in the class");
	}
	@Parameters({"URL", "APIKey/usrname"})
	@Test
	public void WebLoginCarLoan(String urlname, String key)
	{
		//selenium
		System.out.println("WebLoginCar");
		System.out.println(urlname);
		System.out.println(key);
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("AFter executin any methods in the class");
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("MobileLoginCar");

	}
	@BeforeSuite
	public void Bfsuite()
	{
	System.out.println("I'm number 1");		
	}
	@Test(dataProvider="getData")
	public void MobileSignInCarLoan(String username, String password)
	{
		//Appium
		System.out.println("MobileSignIn");
		System.out.println(username);
		System.out.println(password);

	}
	@BeforeMethod(groups= {"Smoke"})
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	@Test//(dependsOnMethods= {"WebLoginCarLoan", "MobileSignInCarLoan"})
	public void APICarLoan()
	{
		//Rest API automation
		System.out.println("CarLoanAPI");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username password - good credit history
		//2nd - username password - no credit history
		//3rd - usrname password - fraudelent credit history
		Object[][] data = new Object[3][2];
		//1st
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//2nd
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		//3rd
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}
}
