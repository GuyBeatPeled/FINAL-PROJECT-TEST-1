package tests;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.InitializePage;
import pages.SearchPageResult;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class FirstTest extends InitializePage {

    @BeforeTest
    public void setUp(){
        super.setUp();
    }

    @Test (priority = 1)
    public void searchGroupName(){
        homePage.searchInput("BARCELONA");
        WebElement e = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]"));
        Assert.assertEquals(searchPage.resultBARCELONA(),e);
        //assertNotNull(utilities.waitForElement(searchPage.searchFlagLogo(), 20));
    }

    public void tearDown() throws IOException {
        // utilities.screenshot();
        super.tearDown();
    }
}