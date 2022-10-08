package com.bhumio.workspace.pageobjects;

import com.bhumio.workspace.utility.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getHomePageTitle() {
        Reporter.log(super.driver.getTitle());
        return super.driver.getTitle();
    }

    public void clickOnAddAProject() {
        WebElement addProject_ele = HomePage.super.findAnyElement(All_Locators.XPATH, "//button[text()='Add a Project']");
        addProject_ele.click();
    }

    public void enterProjectName(String projectName) {
        WebElement projectName_ele = HomePage.super.findAnyElement(All_Locators.XPATH, "//div/input[@id='name']");
        projectName_ele.sendKeys(projectName);
    }

    public void enterBudget(String budget) {
        WebElement budget_ele = HomePage.super.findAnyElement(All_Locators.XPATH, "//div/input[@id='budget']");
        budget_ele.sendKeys(budget);
    }

    public void enterProjectDeadLine(String deadline_value){
        WebElement deadline_ele=HomePage.super.findAnyElement(All_Locators.XPATH,"//input[@placeholder='mm/dd/yyyy hh:mm (a|p)m']");
        deadline_ele.sendKeys(Keys.SHIFT,Keys.HOME);
        deadline_ele.sendKeys(deadline_value);
    }

    public void clickOnAdd() throws InterruptedException {
        WebElement add_ele=HomePage.super.findAnyElement(All_Locators.XPATH,"//button[@type='submit']");
        add_ele.click();
        Thread.sleep(2000);
    }

    public void clickOncopyCard(){
        WebElement copyCard_ele=HomePage.super.findAnyElement(All_Locators.XPATH,"//button[text()='Copy Card']");
        copyCard_ele.click();
    }

    public void clickOnEditCard(){
        WebElement editCard_ele=HomePage.super.findAnyElement(All_Locators.XPATH,"//button[text()='Edit Card']");
        editCard_ele.click();
    }

    public void enterUpdateProjectName(String updateProjectName){
        WebElement updateProjectName_ele=HomePage.super.findAnyElement(All_Locators.XPATH,"//div/input[@id='name']");
        updateProjectName_ele.sendKeys(Keys.SHIFT,Keys.HOME);
        updateProjectName_ele.sendKeys(updateProjectName);
    }

    public void enterUpdateProjectBudget(String updateProjectBudget){
        WebElement updateBudget_ele=HomePage.super.findAnyElement(All_Locators.XPATH,"//div/input[@id='budget']");
        updateBudget_ele.sendKeys(Keys.SHIFT,Keys.HOME);
        updateBudget_ele.sendKeys(updateProjectBudget);
    }

    public void enterUpdateDeadline(String updateDeadline){
        WebElement updateDeadline_ele=HomePage.super.findAnyElement(All_Locators.XPATH,"//input[@placeholder='mm/dd/yyyy hh:mm (a|p)m']");
        updateDeadline_ele.sendKeys(Keys.SHIFT,Keys.HOME);
        updateDeadline_ele.sendKeys(updateDeadline);
    }

    public void clickOnDeleteCard(){
        WebElement deleteCard_ele=HomePage.super.findAnyElement(All_Locators.XPATH,"//button[text()='Delete Card']");
        deleteCard_ele.click();
    }
}
