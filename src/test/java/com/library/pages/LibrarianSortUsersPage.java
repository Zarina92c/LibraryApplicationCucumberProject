package com.library.pages;


import com.library.utils.BrowserWait;
import com.library.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibrarianSortUsersPage extends LoginPage{


    @FindBy(xpath = "/html/body/main/section[2]/div[1]/div[3]/div[2]/table/thead/tr/th[5]")
    protected WebElement groupBtn;

    @FindBy(xpath = "//*[@id=\"tbl_users\"]/thead/tr/th[6]")
    protected WebElement statusBtn;

    public void clickOnGroup() {

        groupBtn.click();
       // BrowserWait.wait(5);

    }
    public void clickOnStatus() {
        statusBtn.click();

    }


    public void assertGroupSorting(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(groupBtn));
        String sortingValue = groupBtn.getAttribute("aria-label");
        Assert.assertTrue(sortingValue.contains("descending"));

    }



    }



