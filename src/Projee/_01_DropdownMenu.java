package Projee;

import Utlity.BaseDriverGenel;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_DropdownMenu extends BaseDriverGenel {

    @Test(groups = {"Smoke Test"})
    public void DropdownMenu() {
        Elements elements = new Elements();
        driver.get("https://techno.study/tr/");
        Actions aksiyonlar = new Actions(driver);
        Tools.Bekle(2);
        new Actions(driver).moveToElement(elements.kurslar).build().perform();

        elements.sdet.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        wait.until(ExpectedConditions.titleIs("SDET Yazılım Test Uzmanı"));
        Assert.assertEquals(driver.getTitle(), "SDET Yazılım Test Uzmanı");

        new Actions(driver).moveToElement(elements.kurslar).build().perform();

        elements.aug.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        wait.until(ExpectedConditions.titleIs("Android Uygulama Geliştirme"));
        Assert.assertEquals(driver.getTitle(), "Android Uygulama Geliştirme");

        new Actions(driver).moveToElement(elements.kurslar).build().perform();

        elements.vb.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        wait.until(ExpectedConditions.titleIs("Veri Bilimi"));
        Assert.assertEquals(driver.getTitle(), "Veri Bilimi");;

        new Actions(driver).moveToElement(elements.kurslar).build().perform();

        elements.jb_a.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        wait.until(ExpectedConditions.titleIs("Job Center & Arbeitsamt"));
        Assert.assertEquals(driver.getTitle(), "Job Center & Arbeitsamt");;

    }
}
