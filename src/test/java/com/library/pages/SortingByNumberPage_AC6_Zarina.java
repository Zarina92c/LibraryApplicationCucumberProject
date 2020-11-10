package com.library.pages;

import com.library.utils.BrowserWait;
import com.library.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SortingByNumberPage_AC6_Zarina {
    // Zarinas test case AC#6

    Select dropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='tbl_users_length']")));

    public void choose_number() {
        BrowserWait.wait(5);
       dropdown.selectByVisibleText("500");
       BrowserWait.wait(5);

    }

    public void find_all() {

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//table[@id='tbl_users'] /tbody/tr"));
       int results = list.size();
        System.out.println("The number of results is: "+ results);

    }



}
