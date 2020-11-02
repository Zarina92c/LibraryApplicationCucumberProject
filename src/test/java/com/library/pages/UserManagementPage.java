package com.library.pages;

import com.github.javafaker.Faker;
import com.library.utils.BrowserWait;
import com.library.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class UserManagementPage extends LoginPage{




    @FindBy(xpath = "//i[@class='fa fa-plus']")
    protected WebElement addUserButton;

    public  void click_addUserButton(){
        addUserButton.click();
    }

    @FindBy(xpath = "//div[.='The user has been created.']")
    WebElement newUserCreatedMessage;

    //Add User boxes WebElements
    @FindBy(name = "full_name")
    protected WebElement fullNameInbox;

    @FindBy(name="password")
    protected WebElement passwordInbox;

    @FindBy(name="email")
    protected WebElement emailInbox;

    @FindBy(name = "start_date")
    protected WebElement startDatePicker;

    @FindBy(name ="end_date")
    protected WebElement endDatePicker;

    @FindBy(id = "address")
    protected WebElement addressInbox;

    @FindBy(id="user_group_id")
    protected WebElement userGroupDropDown;

    @FindBy(id = "status")
    protected WebElement statusDropDown;

    @FindBy(xpath = "//button[.='Save changes']")
    protected WebElement saveChangesButton;

    @FindBy(xpath = "//button[.='Close']")
    protected WebElement closeButton;

    /**
     *
     * @param userType is for userGroup can be only student or librarian
     */
    public void addUser(String userType){
        Faker faker =new Faker();
        String fullName=faker.name().fullName();
        String password=faker.number().digits(5);
        String usernameEmail = faker.name().username();
        String companyUrl= faker.company().url().substring(4);
        String email = usernameEmail+"@"+companyUrl;
        String address= faker.address().fullAddress();
        if (userType.equalsIgnoreCase("student")){
            fullNameInbox.sendKeys(fullName);
            passwordInbox.sendKeys(password);
            emailInbox.sendKeys(email);
            addressInbox.sendKeys(address);
            Select userGroup = new Select(userGroupDropDown);
            userGroup.selectByValue("3");
            endDatePicker.clear();
            endDatePicker.click();
            endDatePicker.sendKeys(Keys.ENTER);
           /* endDatePicker.click();
            BrowserWait.wait(1);
            WebElement yearPicker = Driver.getDriver().findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]"));
            yearPicker.click();*/
        }else if (userType.equalsIgnoreCase("librarian")){
            fullNameInbox.sendKeys(fullName);
            passwordInbox.sendKeys(password);
            emailInbox.sendKeys(email);
            addressInbox.sendKeys(address);
            Select userGroup = new Select(userGroupDropDown);
            userGroup.selectByValue("2");
            endDatePicker.clear();
            endDatePicker.click();
            endDatePicker.sendKeys(Keys.ENTER);
           /* endDatePicker.click();
            BrowserWait.wait(1);
            WebElement yearPicker = Driver.getDriver().findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]"));
            yearPicker.click();*/
        }else{
            throw new RuntimeException("There is not such a named '"+userType+"'  user");
        }
    }

    public void click_saveChangeButton(){
        saveChangesButton.click();
    }
    public void click_closeButton(){
        closeButton.click();
    }
    public void assertingNewUserCreated(){
        Assert.assertTrue(newUserCreatedMessage.isDisplayed());
    }





}
