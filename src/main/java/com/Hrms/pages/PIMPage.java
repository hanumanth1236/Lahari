package com.Hrms.pages;

import org.openqa.selenium.By;

import com.Hrms.utils.CommonUtils;

public class PIMPage{
	// Web locators

	private final static By by_pim = By.xpath("//li[@id='pim']");
	private final static By by_addEmp = By.xpath("//*[@id='pim']/ul/li[2]/a");
	private final static By by_firstName = By.xpath("//input[@id='txtEmpFirstName']");
	private final static By by_lastName = By.xpath("//input[@id='txtEmpLastName']");
	private final static By by_iframe = By.xpath("//iframe[@id='rightMenu']");
	private final static By by_save = By.xpath("//input[@id='btnEdit']");
	private final static By by_back = By.xpath("//input[@class='backbutton']");
	private final static By by_empName = By.xpath("//a[contains(text(),'Sai')]");
	private final static By by_logout = By.xpath("//a[text()='Logout']");
	private final static By by_SearchBy = By.xpath("//select[@name='loc_code']");
	private final static By by_SearchFrom = By.xpath("//input[@id='loc_name']"); 
	private final static By by_SearchButton = By.xpath("//input[@value='Search']");
	private final static By by_checkBox1 = By.xpath("(//input[@name='chkLocID[]'])[1]");
	private final static By by_delete = By.xpath("//input[@value='Delete']");
	private final static By by_deleteTextMessage = By.xpath("//span[text()='Successfully Deleted']");
	
	// Getter/Setter Helping functions
	public static void clickOnElement() throws Exception {
		CommonUtils.clickElement(getPim());
	}
	
	public static By getPim() throws Exception {
		return by_pim;
	}
	
	public static By getAddEmp() throws Exception {
		return by_addEmp;
	}
	
	public static By getFirstName() throws Exception {
		return by_firstName;
	}
	
	public static By getLastName() throws Exception {
		return by_lastName;
	}
	
	public static By getFrame() throws Exception {
		return by_iframe;
	}
	
	public static By getSave() throws Exception {
		return by_save;
	}
	
	public static By getBackButton() throws Exception {
		return by_back;
	}
	
	public static By getEmpName() throws Exception {
		return by_empName;
	}
	
	public static By getLogOut() throws Exception {
		return by_logout;
	}
	
	public static By getSearchBy() throws Exception {
		return by_SearchBy;
	}
	
	public static By getSearchFrom() throws Exception {
		return by_SearchFrom;
	}
	
	public static By getEmployeeInformationSearchButton() throws Exception {
		return by_SearchButton;
	}
	
	public static By getclickCheckBox1() throws Exception {
		return by_checkBox1;
	}
	
	public static By getDeletButton() throws Exception {
		return by_delete;
	}
	
	public static By getSuccessFullyDeleteText() throws Exception {
		return by_deleteTextMessage;
	}
}
