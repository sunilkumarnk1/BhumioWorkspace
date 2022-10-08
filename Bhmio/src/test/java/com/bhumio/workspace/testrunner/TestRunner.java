package com.bhumio.workspace.testrunner;

import com.bhumio.workspace.pageobjects.HomePage;
import com.bhumio.workspace.utility.BaseTest;
import com.bhumio.workspace.utility.CommonUtility;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestRunner extends BaseTest {

    @Test
    public void verifyAddAProject_Test_002() throws InterruptedException {
        HomePage hp= PageFactory.initElements(super.driver,HomePage.class);
        hp.clickOnAddAProject();
        Reporter.log("Clicked on Add a Project");

        String project_name=CommonUtility.getPropertyValue("homepage","homepage.projectname");
        hp.enterProjectName(project_name);
        Reporter.log("Entered "+project_name);

        String budget_value=CommonUtility.getPropertyValue("homepage","homepage.projectbudget");
        hp.enterBudget(budget_value);
        Reporter.log("Project Budget"+budget_value+ "is Entered");

        String deadline=CommonUtility.getPropertyValue("homepage","homepage.deadline");
        hp.enterProjectDeadLine(deadline);
        Reporter.log("Entered Deadline "+deadline);

        hp.clickOnAdd();
        Reporter.log("Clicked on Add to add a Project");
    }
}
