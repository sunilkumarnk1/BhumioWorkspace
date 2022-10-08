package com.bhumio.workspace.testrunner;

import com.bhumio.workspace.pageobjects.HomePage;
import com.bhumio.workspace.utility.BaseTest;
import com.bhumio.workspace.utility.CommonUtility;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EditCardTestRunner extends BaseTest {

    @Test
    public void verifyEditCard_Test_004() throws InterruptedException {
        HomePage hp= PageFactory.initElements(super.driver,HomePage.class);
        hp.clickOnAddAProject();
        Reporter.log("Clicked on Add a Project");

        String project_name= CommonUtility.getPropertyValue("homepage","homepage.projectname");
        hp.enterProjectName(project_name);
        Reporter.log("Entered "+project_name);

        String budget_value=CommonUtility.getPropertyValue("homepage","homepage.projectbudget");
        hp.enterBudget(budget_value);
        Reporter.log("Project Budget"+budget_value+ "is Entered");

        String deadline=CommonUtility.getPropertyValue("homepage","homepage.deadline");
        hp.enterProjectDeadLine(deadline);
        Reporter.log("Clicked on Project Deadline "+deadline);
        hp.clickOnAdd();
        Reporter.log("Clicked on Add");

        hp.clickOnEditCard();
        Reporter.log("Clicked on Edit Card");
        String updateproject_name= CommonUtility.getPropertyValue("homepage","homepage.updatename");
        hp.enterUpdateProjectName(updateproject_name);
        Reporter.log("Entered updated Project Name");

        String updatebudget_value=CommonUtility.getPropertyValue("homepage","homepage.updateprojectbudget");
        hp.enterUpdateProjectBudget(updatebudget_value);
        Reporter.log("Updated Project Budget"+updatebudget_value+ "is Entered");

        String updatedeadline=CommonUtility.getPropertyValue("homepage","homepage.updatedeadline");
        hp.enterUpdateDeadline(updatedeadline);
        Reporter.log("Updated project deadline is Entered");
        hp.clickOnAdd();
        Reporter.log("Clicked on Update");
    }
}
