package Projee;

import Utlity.BaseDriverGenel;
import Utlity.Tools;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class _06_LogoToHomepage extends BaseDriverGenel {

    @Test(groups = {"Regression Test"})
    public void LogoToHomepage() {
        Elements elements = new Elements();
        Actions aksiyonlar = new Actions(driver);

        driver.navigate().to("https://techno.study/tr/");

        new Actions(driver).moveToElement(elements.kurslar).build().perform();
        elements.sdet.click();
        elements.logo.click();

        new Actions(driver).moveToElement(elements.kurslar).build().perform();
        elements.aug.click();
        elements.logo.click();

        new Actions(driver).moveToElement(elements.kurslar).build().perform();
        elements.vb.click();
        elements.logo.click();

        new Actions(driver).moveToElement(elements.kurslar).build().perform();
        elements.jb_a.click();
        elements.logo.click();

    }
}
