package com.Hrms.tests;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.Hrms.base.BasePage;
import com.Hrms.pages.LoginPage;
import com.Hrms.pages.PIMPage;
import com.Hrms.utils.CommonUtils;
import com.Hrms.utils.TestNGUtility;

public class TestPIMPage extends BasePage{
	@BeforeTest
	public void setup() throws Exception {
		
	CommonUtils.initialize();
	CommonUtils.launchBrowserAndNavigateToApp();
		
	}
	
	@AfterTest
	public void close() throws Exception {
		
	//driver.quit();
		
	}
		
	
	//----------------Page class objects Implementations---------
	
	LoginPage loginPage = new LoginPage();
	
	PIMPage pimPage = new PIMPage();
	
	@Test(description="Verify that an employee can be added successfully")
	public void addEmployee() throws Exception {
	
	loginPage.login();
	CommonUtils.hardWait(5);
	TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()),"Welcome selenium");
	CommonUtils.moveToElement(PIMPage.getPim());
	CommonUtils.clickElement(PIMPage.getAddEmp());
	CommonUtils.hardWait(5);
	CommonUtils.switchToFrame(PIMPage.getFrame());
	CommonUtils.enterValue(PIMPage.getFirstName(), "Sai",true);
	CommonUtils.enterValue(PIMPage.getLastName(), "P",true);
	CommonUtils.clickElement(PIMPage.getSave());
	CommonUtils.clickElement(PIMPage.getBackButton());
	TestNGUtility.assertTrue("Sai P",CommonUtils.getElementText(PIMPage.getEmpName()));
	CommonUtils.hardWait(5);
	CommonUtils.switchToDefaultContent();
	CommonUtils.clickElement(PIMPage.getLogOut());
	
	
	}
	
	@Test(description="Verify that the search functionality returns the correct employee")
	public void searchEmployee() throws Exception {
		loginPage.login();
		CommonUtils.hardWait(5);
		TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()),"Welcome selenium");
		CommonUtils.switchToFrame(PIMPage.getFrame());
		CommonUtils.hardWait(5);
		CommonUtils.selectDropDownValue(PIMPage.getSearchBy(), "Emp. First Name");
		CommonUtils.enterValue(PIMPage.getSearchFrom(), "Balaji",true);
		CommonUtils.hardWait(5);
		CommonUtils.clickElement(PIMPage.getEmployeeInformationSearchButton());
		CommonUtils.hardWait(10);
		System.out.println("Search Employee Information Functionality Displayed Successfully");
		CommonUtils.switchToDefaultContent();
		CommonUtils.clickElement(PIMPage.getLogOut());
	
	}
	
	@Test(description="Verify that an employee can be deleted successfully")
	public void deleteEmployee() throws Exception {
		loginPage.login();
		CommonUtils.hardWait(5);
		TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()),"Welcome selenium");
		CommonUtils.switchToFrame(PIMPage.getFrame());
		CommonUtils.hardWait(5);
		CommonUtils.selectDropDownValue(PIMPage.getSearchBy(), "Emp. First Name");
		CommonUtils.enterValue(PIMPage.getSearchFrom(), "Sai",true);
		CommonUtils.hardWait(5);
		CommonUtils.clickElement(PIMPage.getEmployeeInformationSearchButton());
		CommonUtils.hardWait(5);
		CommonUtils.clickElement(PIMPage.getclickCheckBox1());
		CommonUtils.hardWait(5);
		CommonUtils.clickElement(PIMPage.getDeletButton());
		String message	=CommonUtils.getElementText(PIMPage.getSuccessFullyDeleteText());
		System.out.println(message);
		CommonUtils.hardWait(5);
		CommonUtils.switchToDefaultContent();
		CommonUtils.clickElement(PIMPage.getLogOut());
		
	}
	
	@Test(description="Verify that employee details can be edited successfully")
	public void editEmployeeDetails() throws Exception {
		/*loginPage.login();
		CommonUtils.hardWait(5);
		TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()),"Welcome selenium");
	*/
	}
	
	
	
	@Test(description="Verify that the employee list is displayed correctly with accurate information")
	public void viewEmployeeList() throws Exception {
		//loginPage.login();
		//CommonUtils.hardWait(5);
		//TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()),"Welcome selenium");
	
	
	}
	
	@Test(description="Verify that photos can be added to employee profiles")
	public void addEmployeePhotos() throws Exception {
		//loginPage.login();
		//CommonUtils.hardWait(5);
		//TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()),"Welcome selenium");
	
	
	}
	
	@Test(description="Verify that employee details are correctly displayed")
	public void viewEmployeeDetails() throws Exception {
		/*loginPage.login();
		CommonUtils.hardWait(5);
		TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()),"Welcome selenium");
	*/
	
	}
	
	@Test(description="Verify that the employment status of an employee can be updated")
	public void editEmploymentStatus() throws Exception {
		/*loginPage.login();
		CommonUtils.hardWait(5);
		TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()),"Welcome selenium");
	
	*/
	}
	
	@Test(description="Verify that the employee list can be filtered based on various criteria")
	public void filterEmployeeList() throws Exception {
		/*loginPage.login();
		CommonUtils.hardWait(5);
		TestNGUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()),"Welcome selenium");
	*/
	
	}
}
