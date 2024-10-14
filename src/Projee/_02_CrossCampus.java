package Projee;

import Utlity.BaseDriverGenel;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_CrossCampus extends BaseDriverGenel {

    @Test(groups = {"Smoke Test"})
    public void CrossCampus() {
        Elements elements = new Elements();
        driver.get("https://techno.study/tr/");

        elements.bilgiAlın.click();

        System.out.println("elements.bizeUlaşın.getText() = " + elements.bizeUlaşın.getText());
        Assert.assertEquals(elements.bizeUlaşın.getText(), "Bize ulaşın!");

        elements.compusLogin.click();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://campus.techno.study/");


    }
}
