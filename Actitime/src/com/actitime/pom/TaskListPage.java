package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
@FindBy(xpath="//div[text()='Add New']")
private WebElement addnewbtn;
@FindBy(xpath="//div[text()='+ New Customer']")
public WebElement addNewCustBtn;
@FindBy(xpath="//input[@placeholder='Enter Customer Name'and @class]")
public WebElement createName;
@FindBy(xpath="(//textarea[@placeholder='Enter Customer Description'])")
public WebElement addDescription;
@FindBy(xpath="//div[text()='- Select Customer -'and @class='emptySelection']")
public WebElement selectCustDD;
@FindBy(xpath="//div[text()='Our company'and @class='itemRow cpItemRow ']")
private WebElement ourCompOpt;
@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createCustbtn;
@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
private WebElement actualCust;
public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getAddnewbtn() {
	return addnewbtn;
}
public WebElement getAddNewCustBtn() {
	return addNewCustBtn;
}
public WebElement getCreateName() {
	return createName;
}
public WebElement getAddDescription() {
	return addDescription;
}
public WebElement getSelectCustDD() {
	return selectCustDD;
}
public WebElement getOurCompOpt() {
	return ourCompOpt;
}
public WebElement getCreateCustbtn() {
	return createCustbtn;
}
public WebElement getActualCust() {
	return actualCust;
}



}
