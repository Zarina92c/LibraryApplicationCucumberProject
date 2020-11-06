package com.library.utils;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserWait {

       /*
    Create a utility method named: wait
    static method
    @param sec
    @return void
    The integer number that I pass as parameter should be accepted as SECONDS
    Handle checked exception with try/catch
     */

    public static void wait(int sec){
        try {
            Thread.sleep(1000 * sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
