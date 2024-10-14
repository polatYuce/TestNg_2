package Projee;

import Utlity.BaseDriverGenel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _05_SubmenuSocialMedia extends BaseDriverGenel {

    @Test(groups = {"Regression Test"})
    public void SubmenuSocialMedia() {
        Elements elements = new Elements();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        driver.navigate().to("https://techno.study/tr/");

        js.executeScript("arguments[0].scrollIntoView();", elements.facebook);

        elements.facebook.click();
        driver.navigate().back();

        elements.youtube.click();
        driver.navigate().back();

        elements.instagram.click();
        driver.navigate().back();

        elements.linkedin.click();


    }
}
