package com.library.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLibrarianSortUsersPage extends LoginPage{


    @FindBy(xpath = "/html/body/main/section[2]/div[1]/div[3]/div[2]/table/thead/tr/th[5]")
    protected WebElement groupBtn;

    @FindBy(xpath = "//*[@id=\"tbl_users\"]/thead/tr/th[6]")
    protected WebElement statusBtn;


    public void clickOnGroup() {
        groupBtn.click();

    }
    public void clickOnStatus() {statusBtn.click();
    }




    }



