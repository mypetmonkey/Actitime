package com.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLiberary;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;


@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void createCustomer() throws IOException, InterruptedException {
		FileLiberary f=new FileLiberary();
		String custname=f.getExcelFile("createcustomer",1, 2);
		String custdesc=f.getExcelFile("createcustomer",1,3);
		Reporter.log("CreateCustomer",true);
		HomePage p=new HomePage(driver);
		p.setTask();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnewbtn().click();
		t.getAddNewCustBtn().click();
		t.getCreateName().sendKeys(custname);
		t.getAddDescription().sendKeys(custdesc);
		t.getSelectCustDD().click();
		Thread.sleep(5000);
		t.getOurCompOpt().click();
		t.getCreateCustbtn().click();
		Assert.assertEquals(t.getActualCust().getText(),custname);
	}

}
