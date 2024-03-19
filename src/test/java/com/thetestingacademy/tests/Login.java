package com.thetestingacademy.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Login
{

    @Test
    public void launchGoogleMeet()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://workspace.google.com/products/meet/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getCurrentUrl(), "https://workspace.google.com/products/meet/");
        Assert.assertEquals(driver.getTitle(), "Google Meet: Online Web and Video Conferencing Calls | Google Workspace");

        driver.quit();
    }
}
